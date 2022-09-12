package com.combank.ips.outward.producer.service;

public interface QueueService {

	public boolean addToQueue(String exchange, String routingKey, Object message);

}
