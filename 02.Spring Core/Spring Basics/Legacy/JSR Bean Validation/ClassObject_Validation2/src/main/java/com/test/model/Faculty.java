package com.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class Faculty {
	
	@NotNull(message="Faculty Name Cannot be Empty")
	private String name;
	
	private List<Student> student = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
