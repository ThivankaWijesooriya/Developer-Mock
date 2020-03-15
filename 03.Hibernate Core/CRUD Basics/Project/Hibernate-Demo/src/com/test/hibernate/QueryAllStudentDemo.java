package com.test.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.model.Student;

public class QueryAllStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			@SuppressWarnings("unchecked")
			List<Student> studentList = session.createQuery("from Student").getResultList();

			getAllStudents(studentList);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {

			session.close();
			factory.close();

		}
	}

	private static void getAllStudents(List<Student> studentList) {

		for (Student temp : studentList) {

			System.out.println(temp);
		}

	}

}
