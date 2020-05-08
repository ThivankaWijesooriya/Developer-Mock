package com.test.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Student {

	@NotNull(message="Student Name Cannot be Empty")
	private String name;
	
	@Valid
	private Faculty faculty;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	

}
