package gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class Javaobject_to_json {
	
	/*static ArrayList<Employee> emlist= new ArrayList<Employee>();*/
	

	public static void main(String[] args) {
		
		
		ArrayList<Employee> emlist= new ArrayList<Employee>();
		Gson object = new Gson();
		
		Employee em1 = new Employee(1,"thivanka",24);
		Employee em2 = new Employee(2,"Lahiru",24);
		Employee em3 = new Employee(3,"Shanaka",24);
		
		
		emlist.add(em1);
		emlist.add(em2);
		emlist.add(em3);
		
		
		
		// 1. Java object to JSON, and assign to a String
		String employees = object.toJson(emlist);
		
		System.out.println(employees);
		System.out.println(object.toJson(emlist)); // same result as above sysout
		
	      //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("C:/Users/Thivanka/Desktop/JavaTest/employee.json")) {
        	
        	object.toJson(emlist, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        

	}

}

class Employee{
	
private int id;
private String name;
private int age;

public Employee() {};

public Employee(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}


public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
}

	
}
