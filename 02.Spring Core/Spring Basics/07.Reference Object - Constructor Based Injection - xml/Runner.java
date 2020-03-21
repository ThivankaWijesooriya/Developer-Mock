package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Student;

public class Runner {

	public static void main(String[] args) {

		try {

			// applicationContext.xml will contain bean definitions
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

			// Up casting created bean to object class type
			Student student = (Student) context.getBean("student1");

			// Displaying Student Output
			System.out.println("*** Student Information ***");
			System.out.println("Student Id: " + student.getId());
			System.out.println("Student Name: " + student.getName());
			System.out.println("Student Age: " + student.getAge());

			// Displaying Faculty Output
			System.out.println("*** Faculty Information ***");
			System.out.println("Faculty Id: " + student.getFaculty().getId());
			System.out.println("Faculty Name: " + student.getFaculty().getName());

			// Closing resources
			context.close();

		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}

}
