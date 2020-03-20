package com.demo.model;

public class Student {

	private int id;
	private String name;
	private int age;
	private Faculty faculty;
	private School school;

	public Student() {
	}

	public Student(int id, String name, int age, Faculty faculty, School school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.faculty = faculty;
		this.school = school;
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

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
