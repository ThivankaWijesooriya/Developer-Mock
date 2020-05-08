package com.ONEzero.DAO;



import com.ONEzero.model.Employee;

public interface EmployeeDAO {
	

	
	public abstract void createEmployee(Employee employee);
	public abstract String getAllEmployee();
	public abstract Employee getEmployeeById(String empid);
	public abstract void updateEmployeeById(Employee employee);
    public abstract String getAllReportingOfficers(String name);
    public abstract Employee authenticateUser(String username,String password);
    public abstract void changePassword(String userid,String newPass);

}
