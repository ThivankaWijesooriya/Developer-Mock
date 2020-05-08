package com.test.DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.test.DAO.EmployeeDAO;
import com.test.model.Employee;
import com.test.service.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void createEmployee(Employee emp) {

		String sql = "INSERT INTO employee (employee_name,date_of_joining,salary,bonus) VALUES (?,?,?,?)";
		try {

			Connection con = DBUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, emp.getEmployeename());
			stmt.setString(2, emp.getDatejoined());
			stmt.setDouble(3, emp.getSalary());
			stmt.setBigDecimal(4, emp.getBonus());

			int result = stmt.executeUpdate();

			if (result == 1) {

				System.out.println("Employee is created");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> emplist = new ArrayList<>();
		String sql = "select * FROM employee";

		try {

			Connection con = DBUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			if (rs.next() == false) {

				System.out.println("ResultSet is empty ");

			}

			else {

				do

				{

					Employee obj = new Employee();
					
					obj.setEmployeename(rs.getString("employee_name"));
					obj.setDatejoined(rs.getString("date_of_joining"));
					obj.setSalary(rs.getDouble("salary"));
					obj.setBonus(rs.getBigDecimal("bonus"));
					
					emplist.add(obj);

				} while (rs.next());

			}
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}

		return emplist;
		
	}

	@Override
	public Employee getEmployeeById(Employee employee) {
		
		String sql = "SELECT * FROM employee WHERE employee_id = ? ";
		try {
			
			Connection con = DBUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, employee.getEmployeeid());
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				
				employee.setEmployeename(rs.getString("employee_name"));
				employee.setDatejoined(rs.getString("date_of_joining"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setBonus(rs.getBigDecimal("bonus"));
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return employee;
		
	}

	@Override
	public void updateEmployeeById(Employee employee) {
		String sql = "UPDATE employee SET employee_name=?,date_of_joining=?,salary=?,bonus=? WHERE employee_id = ? ";
		
		try {
			
			Connection con = DBUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,employee.getEmployeename() );
			stmt.setString(2,employee.getDatejoined() );
			stmt.setDouble(3,employee.getSalary() );
			stmt.setBigDecimal(4,employee.getBonus() );
			stmt.setInt(5,employee.getEmployeeid() );
			
			int result =stmt.executeUpdate();
			
			if(result==1) {
				
				System.out.println("Employee is Updated");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployeeById(Employee employee) {
		
	String sql = "DELETE FROM employee WHERE employee_id = ? ";
		
		try {
			
			Connection con = DBUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1,employee.getEmployeeid() );
			
			
			int result =stmt.executeUpdate();
			
			if(result==1) {
				
				System.out.println("Employee is Deleted");
			}
			else {
				
				System.out.println("Employee is Not Deleted");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
