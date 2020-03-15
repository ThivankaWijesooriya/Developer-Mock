package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.model.Student;

public class UpdateAllStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// Bulk Update all Student email
			session.createQuery("Update Student set email='anonymous@gmail.com'").executeUpdate();
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Student Updated !");

		} finally {

			session.close();
			factory.close();
		}
	}

}
