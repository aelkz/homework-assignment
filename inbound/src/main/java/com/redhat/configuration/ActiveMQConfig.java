package com.redhat.configuration;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.jms.pool.PooledConnectionFactory;
import org.apache.camel.component.amqp.AMQPComponent;
import org.apache.qpid.jms.JmsConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

@Configuration
@EnableJms
public class ActiveMQConfig {

	@Value("${spring.activemq.broker-url}")
	private String brokerUrl;
	
	/**
     * AMQ service host
     */
	@Value("${spring.activemq.amqp.host}")
    private String amqpHost;

	@Value("${spring.activemq.amqp.port}")
    private Integer amqpPort;

	@Value("${spring.activemq.user}")
	private String user;

	@Value("${spring.activemq.password}")
	private String password;
	
	@Bean(name = "activemq")
	public ActiveMQComponent createComponent(ConnectionFactory connectionFactory) {
		ActiveMQComponent activeMQComponent =  new ActiveMQComponent();
		activeMQComponent.setConnectionFactory(connectionFactory);
		return activeMQComponent;
	}

//	@Bean
//	public ActiveMQConnectionFactory connectionFactory() {
//		if ("".equals(user)) {
//			return new ActiveMQConnectionFactory(brokerUrl);
//		}
//		return new ActiveMQConnectionFactory(user, password, brokerUrl);
//	}
//
//	@Bean
//	public JmsListenerContainerFactory activeMQConnectionFactory(ConnectionFactory connectionFactory,
//			DefaultJmsListenerContainerFactoryConfigurer configurer) {
//		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//		configurer.configure(factory, connectionFactory);
//		factory.setPubSubDomain(true);
//		return factory;
//	}
//
//	@Bean
//	public JmsTemplate jmsTemplate() {
//		return new JmsTemplate(connectionFactory());
//	}
//
//	@Bean
//	public JmsTemplate jmsTemplateTopic() {
//		JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory());
//		jmsTemplate.setPubSubDomain(true);
//		return jmsTemplate;
//	}
	
	@Bean(name = "amqp-component")
    AMQPComponent amqpComponent() {
        JmsConnectionFactory qpid = new JmsConnectionFactory(user, password, "amqp://"+ amqpHost + ":" + amqpPort);

        PooledConnectionFactory factory = new PooledConnectionFactory();
        factory.setConnectionFactory(qpid);

        return new AMQPComponent(factory);
    }

}
