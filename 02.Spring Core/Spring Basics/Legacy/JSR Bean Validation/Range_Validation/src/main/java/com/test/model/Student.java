package com.test.model;

import org.hibernate.validator.constraints.Range;

public class Student {

	@Range(min=21, max=30, message="Age should be between 21 and 30")
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
