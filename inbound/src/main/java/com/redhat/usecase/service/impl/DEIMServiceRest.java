package com.redhat.usecase.service.impl;

import java.security.acl.Permission;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.cxf.jaxrs.impl.ResponseBuilderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.customer.app.Person;
import com.customer.app.response.ESBResponse;

@Component
public class DEIMServiceRest extends RouteBuilder {

		@Autowired
		private Environment env;
		
		@Value("${api.version}")
		private String apiVersion;

		@Produce(uri = "direct:integrateRoute")
		ProducerTemplate template;

  @POST
  @Path("/match")
  @Consumes(MediaType.APPLICATION_XML)
  public Response addPerson(Person person) {

    ResponseBuilderImpl builder = new ResponseBuilderImpl();

    // This header is used to direct the message in the Camel route
    Map<String, Object> headers = new HashMap<String, Object>();
    headers.put("METHOD", "match");

    try {
      String camelResponse = template.requestBodyAndHeaders(template.getDefaultEndpoint(),
      person, headers, String.class);

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

      builder.status(Response.Status.OK);
      builder.entity(esbResponse);

    } catch (CamelExecutionException cee) {
      builder.status(Response.Status.INTERNAL_SERVER_ERROR);
      builder.entity(cee.getMessage());
    }catch(Exception e){
      builder.status(Response.Status.INTERNAL_SERVER_ERROR);
      builder.entity(e.getMessage());
      e.printStackTrace();
    }

    return builder.build();
  }

@Override
public void configure() throws Exception {
	
	// /--------------------------------------------------\
    // | Configure REST endpoint                          |
    // \--------------------------------------------------/

    restConfiguration()
        .apiContextPath("/")
        .component("servlet")
        .contextPath("/api/v" + apiVersion)
        .dataFormatProperty("prettyPrint", "true")
        .port(env.getProperty("server.port", "8080"))
        .bindingMode(RestBindingMode.xml);
    
    // /--------------------------------------------------\
    // | Expose route w/ REST endpoint                    |
    // \--------------------------------------------------/
    
    rest()
    	.id("restRouteMatch")
	    .description("Match rest service from apache csx example")
	    .consumes(MediaType.APPLICATION_XML).produces(MediaType.APPLICATION_XML)
	    
	    .post("/match")
	    	.type(Person.class)
	    	.id("")
            .description("")
            .responseMessage().code(204).message("success").endResponseMessage()
            .route().routeId("").transform().body()//Transform to XML again to send to amq
            .to("direct:postXmlToAMQQueue")
    .endRest();
	
    
   // from("direct:postXmlToAMQQueue")apiVersion;
}

}
