package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.model.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create a student object
			System.out.println("Creating new student object...");

			Student tempStudent1 = new Student("Thivanka", "Wijesooriya", "Thivanka@gmail.com");
			Student tempStudent2 = new Student("Lahiru", "Perera", "Lahiru@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent1);
			session.save(tempStudent2);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			
			session.close();
			factory.close();
		}
	}

}
