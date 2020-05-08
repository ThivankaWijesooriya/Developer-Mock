package com.onezero.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;



public class DBconnect {
	private Connection con=null;
	
	public DBconnect(byte [] mp) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","thivanka@123");
			System.out.println("connected");
			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO tblpic (picture) values (?)");

			InputStream inputStream = new ByteArrayInputStream(mp);
			stmt.setBinaryStream(1, inputStream);
			stmt.executeUpdate();
			
			
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*public String Retrieve() {
		String sql = "SELECT * FROM tblpic";
		List<File> filelist = new ArrayList<>();
		String list= null;
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {
				
				File f = new File(rs.getBytes("picture"));
				filelist.add(f);
			}
			
			Gson gobj = new Gson();
			list = gobj.toJson(filelist);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}*/
	


}
