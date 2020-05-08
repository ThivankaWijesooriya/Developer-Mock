package com.test.service;

import java.io.InputStream;
import java.util.Properties;
import java.sql.*;

public class DBconnect {
	
	private static String resources="DBconfig.properties";
	private static Connection con = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	

	public static void main(String[] args) {
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties prop = new Properties();
		
		try {
			
			InputStream rs = loader.getResourceAsStream(resources);
			prop.load(rs);
			
			url = prop.getProperty("DB.url");
			username = prop.getProperty("DB.username");
			password = prop.getProperty("DB.password");
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Database is Connected");
			
		} catch (Exception e) {
			
			System.out.println("Database is Not Connected");
			e.printStackTrace();
		}

	}

}
