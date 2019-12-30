package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.model.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			int studentId = 2;

			// start a transaction
			session.beginTransaction();

			// Get Student Object with Id 2
			Student student = session.get(Student.class, studentId);

			student.setFirstName("Chamath");
			student.setLastName("Perera");
			student.setEmail("Chamath@gmail.com");

			// Update and commit transaction
			session.getTransaction().commit();

			System.out.println("Student Updated !");

		} finally {

			session.close();
			factory.close();
		}
	}

}
