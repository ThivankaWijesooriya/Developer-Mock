package JAXB;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class EmployeeRunner {

	public static void main(String[] args) {
		try {
			
			JAXBContext contextObj = JAXBContext.newInstance(Employee.class);  
			  
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		  
		    Employee emp1=new Employee(1,"Vimal Jaiswal",50000);  
		      
		    marshallerObj.marshal(emp1, new FileOutputStream("C:/Users/Thivanka/Desktop/JavaTest/employee.xml")); 
			
		} catch (Exception e) {
			System.out.println("error");
		}

	}

}

@XmlRootElement  
class Employee {  
    private int id;  
    private String name;  
    private float salary;  
  
public Employee() {}  
public Employee(int id, String name, float salary) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.salary = salary;  
}  
@XmlAttribute  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
@XmlElement  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
@XmlElement  
public float getSalary() {  
    return salary;  
}  
public void setSalary(float salary) {  
    this.salary = salary;  
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}  
}  