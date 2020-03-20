package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.model.Faculty;
import com.demo.model.School;
import com.demo.model.Student;

@Configuration
public class StudentConfig {

	@Bean(name = "student1")
	public Student studentBean() {

		return new Student(1, "Ravindu", 40, facultyBean(),schoolBean());
	}

	@Bean(name = "faculty1")
	public Faculty facultyBean() {

		return new Faculty(10, "IT");
	}

	@Bean(name = "school1")
	public School schoolBean() {

		School school = new School(20, "Royal");

		return school;
	}

}
