package com.combank.ips.outward.producer.constant;

public enum QueueDetail {
	
	QUEUE("ips_inward_queue"),
	EXCHANGE("ips_inward_exchange"), 
	ROUTING_KEY("ips_inward_routingkey");

	private String value;

	QueueDetail(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
