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

			// Displaying Student Output
			System.out.println("*** Student Information ***");
			System.out.println("Student Id: " + student.getId());
			System.out.println("Student Name: " + student.getName());
			System.out.println("Student Age: " + student.getAge());
			
			// Displaying Faculty Output
			System.out.println("*** Faculty Information ***");
			System.out.println("Student Faculty Id: " + student.getFaculty().getId());
			System.out.println("Student Faculty Name: " + student.getFaculty().getName());
			
			// Displaying School Output
			System.out.println("*** School Information ***");
			System.out.println("Student School Id: " + student.getSchool().getId());
			System.out.println("Student School Name: " + student.getSchool().getName());

			// Closing resources
			context.close();

		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}

}
