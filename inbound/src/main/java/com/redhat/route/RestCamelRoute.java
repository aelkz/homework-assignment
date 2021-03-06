package com.redhat.route;

import java.util.UUID;

import javax.ws.rs.core.MediaType;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.customer.app.Person;
import com.customer.app.response.ESBResponse;

@Component
public class RestCamelRoute extends RouteBuilder {

	@Autowired
	private Environment env;

	@Value("${api.version}")
	private String apiVersion;

	@Override
	public void configure() throws Exception {

		// /--------------------------------------------------\
		// | Handle route exceptions |
		// \--------------------------------------------------/
		onException(IllegalArgumentException.class)
			.handled(true).log(LoggingLevel.INFO, ">> Exception : ${body}")
				.log("${exception.message}")
				.log("${exception.stacktrace}")
				.setExchangePattern(ExchangePattern.InOnly)
				.maximumRedeliveries(3)
				.to("amqp:queue:q.empi.transform.dlq");

		// /--------------------------------------------------\
		// | Configure REST endpoint |
		// \--------------------------------------------------/

		restConfiguration().apiContextPath("/")
			.component("servlet")
			.contextPath("/api/v" + apiVersion)
			.dataFormatProperty("prettyPrint", "true")
			.port(env.getProperty("server.port", "8080"))
			.bindingMode(RestBindingMode.off);

		// /--------------------------------------------------\
		// | Expose route w/ REST endpoint |
		// \--------------------------------------------------/

		DataFormat jaxbDataFormat = new JaxbDataFormat("com.customer.app");
		DataFormat responseJaxbDF =  new JaxbDataFormat("com.customer.app.response");

		rest().id("restRouteMatch")
			.description("Match rest service from apache csx example")
			.consumes(MediaType.TEXT_PLAIN).post("/match").type(Person.class).id("matchId")
			.description("Match person creation").responseMessage().code(204).message("success")
			.endResponseMessage()
			.route().routeId("matchRoute").streamCaching().unmarshal(jaxbDataFormat)
			.process(new Processor() {

					public void process(Exchange exchange) throws Exception {
						Person person = exchange.getIn().getBody(Person.class);
						person.setCommentvalue("XML has been processed to Person");
						exchange.getIn().setBody(person);

					}
			}).marshal(jaxbDataFormat)// Transform to XML again to send to amq
			.log("XML BODY: ${body}")
			.to("direct:postXmlToAMQQueue")
		.endRest();

		from("direct:postXmlToAMQQueue").setExchangePattern(ExchangePattern.InOut)
			.to("activemq:queue:q.empi.deim.in")
			.log("Sending Message...")
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				String camelResponse = exchange.getIn().getBody(String.class);

			      ESBResponse esbResponse = new ESBResponse();
			      esbResponse.setBusinessKey(UUID.randomUUID().toString());
			      esbResponse.setPublished(true);

			      // Here we hard code the response code values to strings for the demo
			      // A better practice would be to have an ENUM class
			      String comment = "NONE";
			      if (camelResponse.equals("0")) {
			        comment = "NO MATCH";
			      } else if (camelResponse.equals("1")) {
			        comment = "MATCH";
			      } else if (camelResponse.equals("2")) {
			        comment = "DONE";
			      } else {
			        comment = "ERROR";
			      }
			      esbResponse.setComment(comment);
				
			      exchange.getIn().setBody(esbResponse);
			}
		}).marshal(responseJaxbDF);
	}

}
