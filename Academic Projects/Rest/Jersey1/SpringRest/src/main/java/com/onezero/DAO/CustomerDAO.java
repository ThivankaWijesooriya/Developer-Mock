package com.onezero.DAO;

import java.util.ArrayList;
import java.sql.*;

import com.onezero.modal.Customer;

public class CustomerDAO {
	
	private Connection con= null;
	private String URL ="jdbc:mysql://localhost:3306/cutomerdb";
	private String username ="root";
	private String password="thivanka@123";
	
	
	private ArrayList<Customer> customerlist;
	
	public CustomerDAO() {
		
		 customerlist = new ArrayList<Customer>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection(URL,username,password);
				System.out.println("Database is connected");
			} catch (SQLException e) {
				
				System.out.println("Database is Not connected");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public Customer getCustomer(int id) {
		
		Customer cusobj = new Customer();
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * from customertbl where custid='"+id+"'");
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				
				cusobj.setId(rs.getInt(1));
				cusobj.setName(rs.getString(2));
				cusobj.setAge(rs.getInt(3));
				
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cusobj;
		
		
	}

	public ArrayList<Customer> getALLCustomer() {
		
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * from customertbl");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				Customer cusobj = new Customer();
				cusobj.setId(rs.getInt(1));
				cusobj.setName(rs.getString(2));
				cusobj.setAge(rs.getInt(3));
				
				customerlist.add(cusobj);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customerlist;
	}

	public Customer createCustomer(Customer newcustomer) {
		try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO customertbl VALUES (?,?,?)");
			stmt.setInt(1, newcustomer.getId());
			stmt.setString(2, newcustomer.getName());
			stmt.setInt(3, newcustomer.getAge());

	        stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newcustomer;
		
	}

	public Customer updateCustomer(Customer updatedcustomer) {
		try {
			PreparedStatement stmt = con.prepareStatement("UPDATE customertbl SET custname=?,custage=? WHERE custid=? ");
			
			stmt.setString(1, updatedcustomer.getName());
			stmt.setInt(2, updatedcustomer.getAge());
			stmt.setInt(3, updatedcustomer.getId());

	        stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updatedcustomer;
		
	}

	public void deleteCustomer(int custid) {
		try {
			PreparedStatement stmt = con.prepareStatement("DELETE from customertbl where custid='"+custid+"'");
	        stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
