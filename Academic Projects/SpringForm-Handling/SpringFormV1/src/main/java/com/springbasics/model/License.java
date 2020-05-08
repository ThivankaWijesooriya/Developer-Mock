package com.springbasics.model;

import javax.validation.constraints.NotNull;

public class License {
	
	private Student student;
	
	@NotNull(message="Is required")
	private String number;
	
	public Student getStudent() {
		return student;
	}
	public String getNumber() {
		return number;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	


}
