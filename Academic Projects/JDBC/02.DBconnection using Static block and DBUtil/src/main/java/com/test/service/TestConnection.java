package com.test.service;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		
		 Connection con =DBUtil.getConnection();
		 // Database is Connected
		 //Additionally can store in a local connection variable

	}

}
