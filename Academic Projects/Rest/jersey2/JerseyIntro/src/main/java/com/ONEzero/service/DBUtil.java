package com.ONEzero.service;
import java.sql.*;

public class DBUtil {
	
	private static Connection  con;
	private static String url = "jdbc:mysql://localhost:3306/studentdb";
	private static String username = "root";
	private static String password = "thivanka@123";
	
	static {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static Connection getConnection() {
		
		return con;
	}

}
