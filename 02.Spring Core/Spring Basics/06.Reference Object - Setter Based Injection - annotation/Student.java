package com.demo.model;

public class Student {

	private int id;
	private String name;
	private int age;
	private Faculty faculty;
	

	public Student() {
	}

	public Student(int id, String name, int age, Faculty faculty) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.faculty = faculty;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}


}
