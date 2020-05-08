package com.test.model;


import com.test.service.CheckLocation;


public class Student {

	@CheckLocation
	private String category;
	

    
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
