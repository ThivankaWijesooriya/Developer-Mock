package com.test.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.model.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// *****************Method 1****************************

			// Using Class Property firstName to Query ( Not Sql Column of Student table )
			Query query = session.createQuery("from Student s Where s.firstName = 'Lahiru'");

			System.out.println("Method 1: " + query.getSingleResult());

			// *****************Method 2****************************

			Student student = (Student) session.createQuery("from Student s Where s.firstName = 'Lahiru'")
					          .getSingleResult();

			System.out.println("Method 2: " + student);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			
			session.close();
			factory.close();
		}
	}

}
