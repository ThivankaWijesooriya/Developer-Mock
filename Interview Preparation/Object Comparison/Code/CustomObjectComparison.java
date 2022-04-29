package com.test.core.equal;

import java.util.Objects;

class Student {

	private int id;
	private String name;

	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

class Teacher {

	private int id;
	private String name;

	public Teacher() {
	}

	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

}

public class CustomObjectComparison {

	public static void main(String[] args) {

		// Overriding Equals and Hashcode methods for Object Comparison
		Student s1 = new Student(1, "thivanka");
		Student s2 = new Student(1, "thivanka");

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode()); // 1231674436
		System.out.println(s2.hashCode()); // 1231674436

		// Not overriding
		Teacher t1 = new Teacher(1, "thivanka");
		Teacher t2 = new Teacher(1, "thivanka");

		System.out.println(t1.equals(t2)); // false
		System.out.println(t1.hashCode()); // 366712642
		System.out.println(t2.hashCode()); // 1829164700
	}

}
