package com.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.demo.config.StudentConfig;
import com.demo.model.Student;

public class Runner {

	public static void main(String[] args) {

		try {

			// StudentConfig will contain bean definitions
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

			// Up casting created bean to object class type
			Student student = (Student) context.getBean("student1");

			// Displaying Output
			System.out.println("*** Student Information ***");
			System.out.println("Student Id: " + student.getId());
			System.out.println("Student Name: " + student.getName());
			System.out.println("Student Age: " + student.getAge());

			// Closing resources
			context.close();

		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}

}
