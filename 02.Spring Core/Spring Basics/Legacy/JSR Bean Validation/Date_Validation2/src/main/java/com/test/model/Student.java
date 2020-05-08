package com.test.model;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
	@NotNull(message="Name Cannot be Empty")
	private String name;
	
	
	
	@Past(message="Date should be Current date or a Past date")
	private Date enrollment;
	
	
	
	@Future(message="Date should be a Future date")
	private Date graduation;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Date enrollment) {
		this.enrollment = enrollment;
	}

	public Date getGraduation() {
		return graduation;
	}

	public void setGraduation(Date graduation) {
		this.graduation = graduation;
	}

}
