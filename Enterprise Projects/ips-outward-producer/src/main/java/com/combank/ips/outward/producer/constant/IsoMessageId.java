package com.combank.ips.outward.producer.constant;

public enum IsoMessageId {

	Credit_Transfer("pacs.008"), 
	Payment_Status_Report("pacs.002");

	private String value;

	IsoMessageId(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
