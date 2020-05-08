package com.test.model;


import com.test.service.FieldMatch;

@FieldMatch(first="category" , second="location" , message="Fields Dont Match")
public class Student {

	
	private String category;
	private String location;

    
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
