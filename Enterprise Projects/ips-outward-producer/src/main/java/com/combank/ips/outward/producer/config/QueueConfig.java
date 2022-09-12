package com.combank.ips.outward.producer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MarshallingMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.combank.ips.outward.producer.constant.QueueDetail;

@Configuration
public class QueueConfig {

	@Bean
	public Queue queue() {
		return new Queue(QueueDetail.QUEUE.getValue());
	}

	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(QueueDetail.EXCHANGE.getValue());
	}

	@Bean
	public Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(QueueDetail.ROUTING_KEY.getValue());
	}

	public MarshallingMessageConverter messageConverter() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.combank.ips.outward.producer.model.*");
		return new MarshallingMessageConverter(marshaller);
	}

	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(messageConverter());
		return rabbitTemplate;
	}

}
