package dao_pattern;

import java.util.List;

public interface TeacherDAO {
	
	public abstract void createTeacher(Teacher teacherobj);
	public abstract List<Teacher> getAllTeachers();
	public abstract Teacher getTeacher();
	public abstract void updateTeacher();
	public abstract void deleteTeacher();
	

}
