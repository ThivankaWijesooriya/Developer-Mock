package com.ONEzero.service;

import com.ONEzero.DAO.StudentDAO;
import com.ONEzero.DAO.StudentDAOImpl;
import com.ONEzero.model.Student;

public class Runner {

	public static void main(String[] args) {
		
		StudentDAO stdao = new StudentDAOImpl();
		
		Student st1 = new Student(1,"Thivanka","Royal");
		stdao.createStudent(st1);

	}

}
