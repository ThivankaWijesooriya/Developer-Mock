package com.ONEzero.DAO;

import java.util.List;

import com.ONEzero.model.Student;

public interface StudentDAO {

	public abstract void createStudent(Student st);
    public abstract List<Student> getAllStudents();
    public abstract Student getStudent(int id);
    public abstract void updateStudent(Student st);
    public abstract void deleteStudent(int id);
				
	
}
