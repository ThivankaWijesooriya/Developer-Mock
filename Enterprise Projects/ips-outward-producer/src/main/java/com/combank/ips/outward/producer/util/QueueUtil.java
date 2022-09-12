package com.combank.ips.outward.producer.util;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueUtil {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public boolean addToQueue(String exchange, String routingKey, Object message) {

		try {

			// Publish ISO 20022 message to queue
			rabbitTemplate.convertAndSend(exchange, routingKey, message);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
