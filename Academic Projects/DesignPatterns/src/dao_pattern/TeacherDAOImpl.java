package dao_pattern;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;;

public class TeacherDAOImpl implements TeacherDAO{

	
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = DBUtil.getInstance().getConnection();
		return conn;
	}
	
	@Override
	public void createTeacher(Teacher teacherobj) {
		
		
		String sql = "{call spCreateTeacher(?,?,?)}";
		
		
		try(Connection con = getConnection();CallableStatement stmt= con.prepareCall(sql)){
			
	
		stmt.setInt(1, teacherobj.getId());	
		stmt.setString(2, teacherobj.getName());	
		stmt.setString(3, teacherobj.getSubject());	
		
		int status = stmt.executeUpdate();
		
		if(status==1) {
			
			System.out.println("Teacher Created");
		}
		
		} catch (Exception e) {
			
			System.out.println("Teacher Not Created");
			e.printStackTrace();
		}
		
	}
	

	@Override
	public List<Teacher> getAllTeachers() {
		
		String sql = "select * from teacherTbl";
		List<Teacher> teacherlist = new ArrayList<>();
		
		try(Connection con = getConnection();PreparedStatement stmt = con.prepareStatement(sql)) {			
		
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Teacher tobj = new Teacher(rs.getInt("id"),rs.getString("name"),rs.getString("subject"));
					teacherlist.add(tobj);
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			
			System.out.println("Teacher Not Created");
			e.printStackTrace();
		}
		

		return teacherlist;
	}
	
	

	@Override
	public Teacher getTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTeacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeacher() {
		// TODO Auto-generated method stub
		
	}

}
