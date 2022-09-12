package com.combank.ips.outward.producer.constant;

public enum QueueStatus {
	
	TOBEQUEUED("T"),
	QUEUED("Q"), 
	DEQUEUED("D");

	private String flag;

	QueueStatus(String flag) {
		this.flag = flag;
	}

	public String getFlag() {
		return flag;
	}

}
