package hibernateCodes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("/resources/hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//Create Session object
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			// Create class object
			Student std1 = new Student("Shami","wijesooriya","shami@gmail");
			
			
			// Start transaction
			session.beginTransaction();
			
			// Save/persist transaction
			session.save(std1);
			
			// Commit transaction
			session.getTransaction().commit();
			
			
		} finally {
			
			factory.close();
		}

	}

}
