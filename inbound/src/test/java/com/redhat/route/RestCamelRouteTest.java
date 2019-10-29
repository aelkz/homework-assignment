package com.redhat.route;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.ExpressionBuilder;
import org.apache.camel.component.mock.AssertionClause;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.apache.camel.test.spring.DisableJmx;
import org.apache.camel.test.spring.UseAdviceWith;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(CamelSpringBootRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@UseAdviceWith(value = true)
@DisableJmx
public class RestCamelRouteTest {

	@Autowired
	protected CamelContext camelContext;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Produce(uri = "direct:start")
	protected ProducerTemplate start;
	
	@EndpointInject(uri = "mock:postXmlToAMQQueue")
	protected MockEndpoint mockXmlAMQ;
	
	@Before
	public void setUp() throws Exception {
		
		camelContext.getRouteDefinition("matchRoute").adviceWith(camelContext, new AdviceWithRouteBuilder() {

			@Override
			public void configure() throws Exception {
				
				weaveByToString(".*postXmlToAMQQueue.*").replace().to(mockXmlAMQ);
//				weaveByToString(".*netty4.*").replace().to(mockNetty4);

			}
			
		});
	
		
		camelContext.start();
	}
	
	@After
	public void stopTest() throws Exception {
		camelContext.suspend();
		camelContext.stop();
	}
	
	
	@Test
	public void testMatch01() throws Exception {
		
		String expectedContains = "<age>30</age>\n" + 
				"    <legalname>\n" + 
				"        <given>First</given>\n" + 
				"        <family>Last</family>\n" + 
				"    </legalname>\n" + 
				"    <fathername>Dad</fathername>\n" + 
				"    <mothername>Mom</mothername>\n" + 
				"    <commentvalue>XML has been processed to Person</commentvalue>\n" + 
				"    <gender>\n" + 
				"        <code>Male</code>\n" + 
				"    </gender>";

		String mensagem = "<p:Person xmlns:p=\"http://www.app.customer.com\"\n" + 
				"  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" + 
				"  xsi:schemaLocation=\"http://www.app.customer.com PatientDemographics.xsd \">\n" + 
				"\n" + 
				"  <p:age>30</p:age>\n" + 
				"  <p:legalname>\n" + 
				"    <p:given>First</p:given>\n" + 
				"    <p:family>Last</p:family>\n" + 
				"  </p:legalname>\n" + 
				"  <p:fathername>Dad</p:fathername>\n" + 
				"  <p:mothername>Mom</p:mothername>\n" + 
				"  <p:gender xsi:type=\"p:Code\">\n" + 
				"    <p:code>Male</p:code>\n" + 
				"  </p:gender>\n" + 
				"</p:Person>";
		
		AssertionClause expectedBodyReceived = mockXmlAMQ.expectedBodyReceived();
		
		expectedBodyReceived.expression(ExpressionBuilder.bodyExpression());
		
		mockXmlAMQ.expectedMessageCount(1);
		
		ResponseEntity<String> response = restTemplate.postForEntity("/api/v1/match", mensagem, String.class);
		assertEquals(response.getStatusCode() , HttpStatus.OK);
		String s = response.getBody();
		assertTrue(s.contains(expectedContains));
		
		mockXmlAMQ.assertIsSatisfied();

		
	}
	
	
	
}
