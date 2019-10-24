package com.redhat.route;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.redhat.Application;
import com.sun.mdm.index.webservice.ExecuteMatchResponse;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;

@Component
public class CamelRoute extends RouteBuilder {

    static final Logger logger = LoggerFactory.getLogger(CamelRoute.class);

    @Autowired
    private Environment env;

    @Override
    public void configure() throws Exception {
        
    	// /--------------------------------------------------\
        // | Jaxb Data Format                          |
        // \--------------------------------------------------/
    	DataFormat jaxbComSunWebserviceDataFormat = new JaxbDataFormat("com.sun.mdm.index.webservice");
        // /--------------------------------------------------\
        // | Handle route exceptions                          |
        // \--------------------------------------------------/
        onException(IllegalArgumentException.class)
                .handled(true)
                .log(LoggingLevel.INFO, ">> Exception : ${body}")
                .log("${exception.message}")
                .log("${exception.stacktrace}")
                .setExchangePattern(ExchangePattern.InOnly)
                .maximumRedeliveries(3)
                .to("activemq:queue:q.empi.nextgate.dlq");

        // /--------------------------------------------------\
        // | Route definition                                 |
        // \--------------------------------------------------/

        // 4.1 This consumes the Person XML from an ActiveMQ queue (q.empi.deim.in).
        // 4.2 This converts the ExecuteMatchUpdate XML to an ExecuteMatchUpdate object.
        // 4.3 Use the ExecuteMatchUpdate object to build the Nextgate WebService Request (sent to WebService).
        // 4.4 JUnit: Develop a feature and a fabric profile.
        // 4.5 JUnit: Test these using SoapUI or curl.
        // 4.6 Deploy the Test Web Service in Apache Karaf (optional)

        from(Application.ACTIVE_MQ_QUEUE_PREFIX+Application.APP_MESSAGE_QUEUE_OUT)
        	.streamCaching()
            .unmarshal(jaxbComSunWebserviceDataFormat)
            .process(new Processor() {
				
				@Override
				public void process(Exchange exchange) throws Exception {
					ExecuteMatchUpdate executeMatchUpdate = exchange.getIn().getBody(ExecuteMatchUpdate.class);
	            	
	            	final List<Object> params = new ArrayList<>();
					params.add(executeMatchUpdate.getCallerInfo());
					params.add(executeMatchUpdate.getSysObjBean());
					exchange.getOut().setBody(params);
					exchange.getOut().setHeader(CxfConstants.OPERATION_NAME, "executeMatchUpdate");
					exchange.getOut().setHeader(CxfConstants.OPERATION_NAMESPACE, "http://webservice.index.mdm.sun.com/");
				}
			})
            .setExchangePattern(ExchangePattern.InOut)
            .to("cxf://http://localhost:8181/cxf/PersonEJBService/PersonEJB"
            	    + "?serviceClass=com.sun.mdm.index.webservice.PersonEJB"
            	    + "&wsdlURL=http://localhost:8181/cxf/PersonEJBService/PersonEJB?wsdl"
            	    + "&defaultOperationName=executeMatchUpdate")
            .log("The Result is:  \nResult code: ${body[0].resultCode}"
            		+ "\nMatch field changed: ${body[0].matchFieldChanged}"
            		+ "\nOverlay detected: ${body[0].overlayDetected}")
            .setBody(simple("${body[0].resultCode}"));

    }
}
