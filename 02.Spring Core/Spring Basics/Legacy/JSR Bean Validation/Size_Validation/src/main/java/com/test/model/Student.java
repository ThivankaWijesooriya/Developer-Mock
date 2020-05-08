package com.test.model;


import javax.validation.constraints.Size;

public class Student {
	
	@Size(min=8,max=12,message="Password Should be Minimum of 8 chars and max 12")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	

}
