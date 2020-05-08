package JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Jaxb_unmarshall {

	public static void main(String[] args) {
		try {
			
			File file = new File("C:/Users/Thivanka/Desktop/JavaTest/employee.xml");    
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);    
         
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
            Employee e=(Employee) jaxbUnmarshaller.unmarshal(file); 
            System.out.println(e); // prints toString method of employee class
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());  
			
		} catch (Exception e) {
			System.out.println("error");
		}

	}

}
