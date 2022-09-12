package com.combank.ips.outward.producer.constant;

public enum Currency {

	MVR("MVR");

	private String value;

	Currency(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
