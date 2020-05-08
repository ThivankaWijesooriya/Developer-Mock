package com.test.service;



import com.test.DAO.EmployeeDAO;
import com.test.DAO.EmployeeDAOImpl;
import com.test.model.Employee;

public class TestConnection {

	public static void main(String[] args) {
		
         EmployeeDAO obj = new EmployeeDAOImpl();
         
         Employee ob = new Employee();
         
         ob.setEmployeeid(6);
         
         
         obj.deleteEmployeeById(ob);
		 
		 
		

	}
	
	
	

}
