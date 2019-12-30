package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.model.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = null;

		try {
			
			// *********Method 1**********
			
			// create session
			session = factory.getCurrentSession();

			int studentId = 2;

			// start a transaction
			session.beginTransaction();

			// Get Student Object with Id 2
			Student student = session.get(Student.class, studentId);

			// Delete the Student
			session.delete(student);

			// Commit transaction
			session.getTransaction().commit();

			System.out.println("Student Deleted !");
			
			
			// *********Method 2**********
			
			// create session
		    session = factory.getCurrentSession();
		    
		    session.beginTransaction();

			// Delete the Student
			session.createQuery("delete from Student s where s.id = '3'").executeUpdate();

			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Student Deleted !");
			

		} finally {

			
			factory.close();
		}
	}

}
