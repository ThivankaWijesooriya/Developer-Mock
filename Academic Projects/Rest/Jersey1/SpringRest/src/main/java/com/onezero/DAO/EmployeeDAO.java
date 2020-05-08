package com.onezero.DAO;

import java.util.ArrayList;

import com.onezero.modal.Customer;
import com.onezero.modal.Employee;

public class EmployeeDAO {
	
	ArrayList<Employee> emlist;
	
	public EmployeeDAO() {
		
		emlist = new ArrayList<Employee>();
		
		Employee em = new Employee(1,"thivanka",24);
		Employee em2 = new Employee(2,"Lahiru",24);
		Employee em3 = new Employee(3,"Shan",24);
		
		emlist.add(em);
		emlist.add(em2);
		emlist.add(em3);
		
	}
	
	public ArrayList<Employee> getList(){
		
		return emlist;
	}
	
	public Employee getEmployee(int id) {
		
		for(Employee e:emlist) {
			
			if(e.getEmployeeid()==id) {
				
				return e;
			}
		}
		
		return new Employee();
	}

	public Employee SetEmployee(Employee obj) {
	
		emlist.add(obj);
		return obj;
	}

	
	
	
}
