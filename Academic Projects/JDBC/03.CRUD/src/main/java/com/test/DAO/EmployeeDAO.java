package com.test.DAO;

import java.util.List;

import com.test.model.Employee;

public interface EmployeeDAO {
	
	public abstract void createEmployee(Employee emp);
	public abstract List<Employee> getAllEmployee();
	public abstract Employee getEmployeeById(Employee employeeid);
	public abstract void updateEmployeeById(Employee emp);
	public abstract void deleteEmployeeById(Employee employee);
	

}
