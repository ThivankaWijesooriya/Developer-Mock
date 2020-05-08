package com.springbasics.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class Teacher {

	private int teacherid;
	
	@NotNull(message="Is required")
	private String teachername;
	
	private List<Student> studentlist = new ArrayList<>();
	
	public int getTeacherid() {
		return teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public List<Student> getStudentlist() {
		return studentlist;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}

}
