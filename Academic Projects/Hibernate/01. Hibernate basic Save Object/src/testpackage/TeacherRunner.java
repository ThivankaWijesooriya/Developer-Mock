package testpackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TeacherRunner {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
								.configure("/resources/hibernate.cfg.xml")
								.addAnnotatedClass(Teacher.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			
			// Create class object
			Teacher obj = new Teacher("Thivanka",24);
			
			// Start transaction
			session.beginTransaction();
			
			// Save/persist transaction
			session.save(obj);
			
			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Data Saved");
			
		} catch (Exception e) {
			
			System.out.println("Failed");
		}
		
		finally {
			
			factory.close();
		}
								

	}

}
