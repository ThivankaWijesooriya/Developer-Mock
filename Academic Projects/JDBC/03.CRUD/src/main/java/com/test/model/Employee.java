package com.test.model;

import java.math.BigDecimal;

public class Employee {

	private int employeeid;
	private String employeename;
	private String datejoined;
	private double salary;
	private BigDecimal bonus;

	public Employee() {
	};

	public Employee(String employeename, String datejoined, double salary, BigDecimal bonus,int employeeid) {
		super();

		this.employeename = employeename;
		this.salary = salary;
		this.datejoined = datejoined;
		this.bonus = bonus;
		this.employeeid = employeeid;

	}

	public int getEmployeeid() {
		return employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public String getDatejoined() {
		return datejoined;
	}

	public double getSalary() {
		return salary;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public void setDatejoined(String datejoined) {
		this.datejoined = datejoined;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	

}
