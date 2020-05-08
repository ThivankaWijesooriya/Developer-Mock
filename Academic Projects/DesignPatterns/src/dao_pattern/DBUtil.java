package dao_pattern;
import java.sql.*;

public class DBUtil {
	
	private static final String url= "jdbc:mysql://localhost:3306/teacherdb?autoReconnect=true&useSSL=false";
	private static final String username="root";
	private static final String password="thivanka@123";
	
	private static DBUtil connectionFactory = null;
	
	
	private DBUtil() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public Connection getConnection() throws SQLException {
		
		Connection conn = null;
		conn = DriverManager.getConnection(url,username,password);
		
		return conn;
		
	}
	
	
	public static DBUtil getInstance() {
		
		if (connectionFactory == null) {
			
			connectionFactory = new DBUtil();
			
		}
		
		return connectionFactory;
		
	}
	
	

}
