package com.onezero.modal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	// Employee Fields
	
	
	private int employeeid;
	private String employeename;
	private int employeeage;
	
	
	public Employee() {
		
	}

	

	public Employee(int employeeid, String employeename, int employeeage) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeage = employeeage;
	}


   @XmlAttribute
	public int getEmployeeid() {
		return employeeid;
	}

   @XmlElement
	public String getEmployeename() {
		return employeename;
	}


	@XmlElement
	public int getEmployeeage() {
		return employeeage;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	
	
	
	

	

	
}
