package com.redhat.route;

import org.apache.camel.CamelContext;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.processor.RedeliveryPolicy;
import org.apache.camel.spi.DataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.customer.app.Person;
import com.redhat.Application;
import com.redhat.converter.TransformToExecuteMatch;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;

@Component
public class CamelRoute extends RouteBuilder {

    static final Logger logger = LoggerFactory.getLogger(CamelRoute.class);

    @Autowired
    private Environment env;

    @Override
    public void configure() throws Exception {
    	CamelContext context = getContext();
    	context.setTypeConverterStatisticsEnabled(true);
    	//Registry the converter
    	TransformToExecuteMatch executeMatch = new TransformToExecuteMatch();
    	context.getTypeConverterRegistry().addTypeConverters(executeMatch);
    	
    	DataFormat jaxbDataFormat = new JaxbDataFormat("com.customer.app");
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
                .to(Application.ACTIVE_MQ_QUEUE_PREFIX+"q.empi.transform.dlq");

        // /--------------------------------------------------\
        // | Route definition                                 |
        // \--------------------------------------------------/

        // 3.1 This consumes the Person XML from an ActiveMQ queue (q.empi.deim.in).
        // 3.2 This converts the Person XML to a Person object.
        // 3.3 This converts the Person object to an ExecuteMatchUpdate object, which is the operation on the web service.
        //     To accomplish this, you have to write your own TypeConverter with the convertTo method implemented.
        // 3.4 This converts the ExecuteMatchUpdate object to ExecuteMatchUpdate XML.
        // 3.5 This dispatches the ExecuteMatchUpdate XML to an ActiveMQ queue (q.empi.nextgate.out).
        // 3.6 On the command line, run mvn clean install.

        from(Application.ACTIVE_MQ_QUEUE_PREFIX+Application.APP_MESSAGE_QUEUE_IN)
            .unmarshal(jaxbDataFormat)
            .convertBodyTo(ExecuteMatchUpdate.class)
            .marshal(jaxbComSunWebserviceDataFormat)
            .to(Application.ACTIVE_MQ_QUEUE_PREFIX+Application.APP_MESSAGE_QUEUE_OUT);

    }
}
