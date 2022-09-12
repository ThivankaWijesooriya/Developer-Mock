package com.combank.ips.outward.producer.constant;

public enum IsoDirection {

	RECEIVED("R"), 
	SENT("S");

	private String flag;

	IsoDirection(String flag) {
		this.flag = flag;
	}

	public String getFlag() {
		return flag;
	}

}
