package com.onezero.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	
	private String name;
	private String firstname;
	private String branch;
	private String department;
	private String designation;
	private String username;
	private String password;

	public User() {
	}

	public User(String name, String firstname, String branch, String department, String designation, String username,
			String password) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.branch = branch;
		this.department = department;
		this.designation = designation;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", firstname=" + firstname + ", branch=" + branch + ", department=" + department
				+ ", designation=" + designation + ", username=" + username + ", password=" + password + "]";
	}

		

}
