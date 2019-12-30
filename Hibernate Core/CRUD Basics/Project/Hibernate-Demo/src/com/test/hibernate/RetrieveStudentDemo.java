package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.model.Student;

public class RetrieveStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			Student tempStudent = new Student("Shanuka", "Perera", "Shanuka@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			session.save(tempStudent);

			// commit transaction
			session.getTransaction().commit(); // Ends Current Session After Commit
			

			// ******RETRIEVAL LOGIC*****************************************************

			// now get a new session and start transaction to avoid Session/EntityManager is closed Exception
			session = factory.getCurrentSession();
			
			// start a transaction
			session.beginTransaction();

			System.out.println("\nGetting student with id: " + tempStudent.getId());

			// retrieve student based on the id: primary key
			Student student = session.get(Student.class, tempStudent.getId());

			System.out.println("Get complete: " + student);

			// commit the transaction
			session.getTransaction().commit();
			

		} finally {
			
			session.close();
			factory.close();
		}
	}

}
