package dao_pattern;

import java.util.List;

public class Runner {

	public static void main(String[]args) {
		TeacherDAO teacherdao = new TeacherDAOImpl();
		
		Teacher t1 = new Teacher(4,"Yohan","software");
		teacherdao.createTeacher(t1);
		
		List<Teacher> teacherlist = teacherdao.getAllTeachers();
		for(Teacher t:teacherlist) {
			
			System.out.println(t.getName());
		}
	}
	
}
