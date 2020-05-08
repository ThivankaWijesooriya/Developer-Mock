package com.springbasics.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.validation.Valid;
import javax.validation.constraints.Email;

public class Student {
	
	
	@NotNull(message="Is required")
	@Size(min=1,message="Is required")
	private String Name;
	
	@NotNull(message="Is required")
	@Size(min=5,message="Minimum length 5 and a max of 10",max=10)
	private String School;
	
	@NotNull(message="Is required")
	@Min(value= 18,message="Age must be above 18")
	@Max(value=28,message="Age must be below 28")
	private int age;
	
	
	@NotNull(message="Is required")
	@Past
	private Date Enrollment;
	
	@NotNull(message="Is required")
	@Future
	private Date Graduation;
	
	@NotNull(message="Is required")
	@Email
	private String Email;
	
	@Valid
    private License license;
    
	@Valid
    private List <Teacher> teacherlist = new ArrayList<>();
	
	//GETTERS

   
	
	public Date ConvertDate(String testdate) {
		  
		   Date date=null;
		    try {
				date=new SimpleDateFormat("yyyy-MM-dd").parse(testdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			return date;
		}
	
	

	public String getName() {
		return Name;
	}

	public String getSchool() {
		return School;
	}

	public int getAge() {
		return age;
	}

	public Date getEnrollment() {
		return Enrollment;
	}

	public Date getGraduation() {
		return Graduation;
	}

	public String getEmail() {
		return Email;
	}

	public License getLicense() {
		return license;
	}

	public List<Teacher> getTeacherlist() {
		return teacherlist;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setSchool(String school) {
		School = school;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEnrollment(Date enrollment) {
		Enrollment = enrollment;
	}

	public void setGraduation(Date graduation) {
		Graduation = graduation;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public void setTeacherlist(List<Teacher> teacherlist) {
		this.teacherlist = teacherlist;
	}
	
	

}
