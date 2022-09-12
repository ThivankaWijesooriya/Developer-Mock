package com.combank.ips.outward.producer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.combank.ips.outward.producer.service.QueueService;
import com.combank.ips.outward.producer.util.QueueUtil;

@Service
public class QueueServiceImpl implements QueueService {

	@Autowired
	private QueueUtil queueUtil;

	@Override
	public boolean addToQueue(String exchange, String routingKey, Object message) {
		return queueUtil.addToQueue(exchange, routingKey, message);
	}

}
