package com.test.model;

import javax.validation.constraints.NotNull;

public class Student {
	
	@NotNull(message="Name Cannot be Empty")
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
