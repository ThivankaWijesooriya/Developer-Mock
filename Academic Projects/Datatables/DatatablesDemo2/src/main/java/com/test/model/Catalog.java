package com.test.model;

public class Catalog {

	private String itemname;
	private int price;
	
	public Catalog(String itemname, int price) {
		super();
		this.itemname = itemname;
		this.price = price;
	}
	
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
