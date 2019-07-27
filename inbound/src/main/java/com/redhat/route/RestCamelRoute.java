package com.redhat.route;

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
import com.redhat.Application;

import static org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent;

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
				.to("amqp:queue:errorQueue");

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
			.log("XML BODY: ${body}").to("direct:postXmlToAMQQueue")
		.endRest();

		from("direct:postXmlToAMQQueue").setExchangePattern(ExchangePattern.InOnly)
			.to("activemq:queue:q.empi.deim.in")
			.log("Sending Message...");
	}

}
