package com.test.jdbc;

import java.sql.*;

public class Runner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username = "hbstudent";
		String password = "hbstudent";

		try {

			Connection con = DriverManager.getConnection(url, username, password);
			if (!con.isClosed()) {
				System.out.println("Connected");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
