package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.model.Student;

@Configuration
public class StudentConfig {

	@Bean(name = "student1")
	public Student studentBean() {

		Student student = new Student();

		student.setId(1);
		student.setName("Lahiru");
		student.setAge(30);

		return student;
	}

}
