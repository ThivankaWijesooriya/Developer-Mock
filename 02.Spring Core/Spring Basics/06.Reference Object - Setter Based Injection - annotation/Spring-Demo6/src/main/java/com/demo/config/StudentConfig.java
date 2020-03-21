package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.model.Faculty;
import com.demo.model.Student;

@Configuration
public class StudentConfig {

	@Bean(name = "student1")
	public Student studentBean() {

		Student student = new Student();
		student.setId(10);
		student.setName("Sahan");
		student.setAge(50);
		student.setFaculty(facultyBean());
		
		return student;
	}

	@Bean(name = "faculty1")
	public Faculty facultyBean() {

		return new Faculty(30, "Accounts");
	}


}
