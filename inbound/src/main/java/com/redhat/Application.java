package com.redhat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public final static String ACTIVE_MQ_QUEUE_PREFIX   = "activemq:queue:";
    public final static String APP_MESSAGE_QUEUE_OUT    = "q.empi.deim.in";
	public static final String APP_MESSAGE_QUEUE_IN 	= "q.empi.deim.in";

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
