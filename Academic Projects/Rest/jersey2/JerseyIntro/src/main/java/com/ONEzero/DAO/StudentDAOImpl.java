package com.ONEzero.DAO;

import com.ONEzero.model.Student;
import com.ONEzero.service.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public void createStudent(Student st) {
		
		Connection con = DBUtil.getConnection();
		String sql = "{call spCreateStudent(?,?,?)}";
		
		try {
			
			CallableStatement stmt = con.prepareCall(sql);
			
			stmt.setInt(1, st.getId());
			stmt.setString(2, st.getName());
			stmt.setString(3, st.getSchool());
			
			int status = stmt.executeUpdate();
			
			if(status==1) {
				
				System.out.println("Student Created");
			}
			
			else {
				
				System.out.println("Student Not Created");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		Connection con = DBUtil.getConnection();
		String sql = "{call spGetAllStudents}";
		List<Student> stlist = new ArrayList<>();
		
		try {
			
			CallableStatement stmt = con.prepareCall(sql);
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {
				
				Student st = new Student(rs.getInt("id"),rs.getString("name"),rs.getString("school"));
				stlist.add(st);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stlist;
	}

	@Override
	public void updateStudent(Student st) {
		Connection con = DBUtil.getConnection();
		String sql = "{call spUpdateStudent(?,?,?)}";
		
		try {
			
			CallableStatement stmt = con.prepareCall(sql);
			
			stmt.setInt(1, st.getId());
			stmt.setString(2, st.getName());
			stmt.setString(3, st.getSchool());
			
			int status = stmt.executeUpdate();
			
			if(status==1) {
				
				System.out.println("Student Updated");
			}
			
			else {
				
				System.out.println("Student Not Updated");
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent(int id) {
		
		Connection con = DBUtil.getConnection();
		String sql = "{call spDeleteStudent(?)}";
		
		try {
			
			CallableStatement stmt = con.prepareCall(sql);
			stmt.setInt(1, id);
			int status = stmt.executeUpdate();
			
			if(status==1) {
				
				System.out.println("Student Deleted");
			}
			
			else {
				
				System.out.println("Student not Deleted");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public Student getStudent(int id) {
		
		Connection con = DBUtil.getConnection();
		String sql = "{call spGetStudent(?)}";
		Student st = new Student();
		
		try {
			
			CallableStatement stmt = con.prepareCall(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setSchool(rs.getString("school"));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return st;
	}

}
