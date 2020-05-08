package com.test.model;

import javax.validation.constraints.NotNull;

public class Student {
	
	@NotNull(message="Student Name cannot be Empty")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
