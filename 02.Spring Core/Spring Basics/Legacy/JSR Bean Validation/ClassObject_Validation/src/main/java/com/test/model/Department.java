package com.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Department {
	
	@NotNull(message="DeptName cannot be Empty")
	private String deptname;
	
	@Valid
	private List<Student> studentList = new ArrayList<>() ;
	

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	

	

	



}
