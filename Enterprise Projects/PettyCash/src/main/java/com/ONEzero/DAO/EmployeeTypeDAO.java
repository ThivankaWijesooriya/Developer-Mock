package com.ONEzero.DAO;

import java.util.List;
import java.util.Map;

import com.ONEzero.model.Department;
import com.ONEzero.model.EmployeeType;

public interface EmployeeTypeDAO {
	
	
	public abstract void createEmployeeType(EmployeeType employeetype);
	public abstract String getAllEmployeeTypes();
	public abstract void updateEmployeeTypeById(EmployeeType employeetype);
    public abstract void deleteEmployeeTypeById(EmployeeType employeetype);
    public abstract Map<Integer, String> fillColumnEmployeeType();
    public abstract String getEmployeeTypeByName(String Emptypename);

}
