package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.model.Student;

@Configuration
public class StudentConfig {

	@Bean(name = "student1")
	public Student studentBean() {

		return new Student(1, "Ravindu", 40);
	}

}
