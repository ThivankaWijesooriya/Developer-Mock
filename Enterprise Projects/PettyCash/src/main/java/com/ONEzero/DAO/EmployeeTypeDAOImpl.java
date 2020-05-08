package com.ONEzero.DAO;

import com.ONEzero.model.Department;
import com.ONEzero.model.EmployeeType;
import com.ONEzero.model.Shift;

import com.ONEzero.service.DBUtil2;
import com.google.gson.Gson;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTypeDAOImpl implements EmployeeTypeDAO{

	@Override
	public void createEmployeeType(EmployeeType employeetype) {
		
		
		/*String sql = "INSERT INTO tblRefEmployeeType (strdescription,intStatus,strRemarks,strEnteredBy,dtmEnteredDate) VALUES (?,?,?,?,GETDATE())";*/
		
		String sql = "{call spInsertEmployeeType(?,?,?,?)}";		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, employeetype.getDescription());
			stmt.setInt(2, employeetype.getStatus());
			stmt.setString(3, employeetype.getRemarks());
			stmt.setString(4, employeetype.getEnteredby());
			
			
			
			int result =  stmt.executeUpdate();
			
			
			if(result==1) {
				
				System.out.println("Record Created");
				
			}
			
			else {
				
				System.out.println("Record Not Created");
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	@Override
	public String getAllEmployeeTypes() {
		
		
		List<EmployeeType> EmpTypeList = new ArrayList<>();
		String EmpTypelist = null;
		
		
		/*String sql = "SELECT * FROM tblRefEmployeeType WHERE intStatus != 2";*/
		String sql = "{call spGetAllEmployeeTypes}";
		
		try (Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)){
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()==false) {
					
					
					EmployeeType emptype = new EmployeeType("","","","");
					EmpTypeList.add(emptype);
					
					
				}
				
				
				else {
					
					
					
					do {
						
						
						if(rs.getInt("intStatus")==1) {
							
							
							String state = "Active";
							
							
							EmployeeType emptype = new EmployeeType(rs.getInt("intEmpType"),rs.getString("strdescription"),state,rs.getString("strRemarks"));
		    				EmpTypeList.add(emptype);
		    				
						}
						
						else if(rs.getInt("intStatus")==0){
							
							
							String state = "Inactive";
							
							
							EmployeeType emptype = new EmployeeType(rs.getInt("intEmpType"),rs.getString("strdescription"),state,rs.getString("strRemarks"));
		    				EmpTypeList.add(emptype);
							
							
						}
						
						else {
							
							
		                    String state = "Deleted";
		                    
		            
							
		                    EmployeeType emptype = new EmployeeType(rs.getInt("intEmpType"),rs.getString("strdescription"),state,rs.getString("strRemarks"));
		    				EmpTypeList.add(emptype);
							
							
							
						}
						
						
					}while(rs.next());
					
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
			Gson gson = new Gson();
		    EmpTypelist = gson.toJson(EmpTypeList);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return EmpTypelist;
		
	}
	
		

	@Override
	public void updateEmployeeTypeById(EmployeeType employeetype) {
		
		
		/*String sql = "UPDATE tblRefEmployeeType SET strdescription = ? , intStatus = ? , strRemarks = ? , strUpdatedBy =  ? , dtmUpdatedDate = GETDATE() "
				+ "WHERE intEmpType = ? AND (strUpdatedBy is null OR strUpdatedBy IS NOT null) "
				+ "AND (dtmUpdatedDate is null OR dtmUpdatedDate IS NOT null)";*/
		
		String sql = "{call spUpdateEmployeeType(?,?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, employeetype.getDescription());
			stmt.setInt(2, employeetype.getStatus());
			stmt.setString(3, employeetype.getRemarks());
			stmt.setString(4, employeetype.getUpdatedby());
			stmt.setInt(5, employeetype.getEmptypeid());
			
			
			int result = stmt.executeUpdate();
			
			if(result==1) {
				
				
				System.out.println("Record Updated");
				
			}
			
			else {
				
				
				System.out.println("Record Not Updated");
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	

	@Override
	public void deleteEmployeeTypeById(EmployeeType employeetype) {
		
		
		/*String sql = "UPDATE tblRefEmployeeType SET intStatus = ? , strDeletedBy =  ? , dtmDeletedDate = GETDATE() "
				+ "WHERE intEmpType = ? AND (strDeletedBy is null OR strDeletedBy IS NOT null) "
				+ "AND (dtmDeletedDate is null OR dtmDeletedDate IS NOT null)";*/
		
		String sql = "{call spDeleteEmployeeType(?,?,?)}";
		
		try (Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)){
		  
		  
		  stmt.setInt(1, employeetype.getStatus());
		  stmt.setString(2, employeetype.getDeletedby());
		  stmt.setInt(3, employeetype.getEmptypeid());
		  
		  int result = stmt.executeUpdate();
		  
		  if(result==1) {
			  
			  System.out.println("Record is Deleted");
		  }
		  
		  else {
			  
			  System.out.println("Record is Not Deleted");
		  }
		  		  
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	

	@Override
	public Map<Integer, String> fillColumnEmployeeType() {
		
		/*String sql ="SELECT * FROM tblRefEmployeeType";*/
		String sql = "{call spfillColumnEmployeeType}";
		
		
		Map<Integer,String> EmployeeTypeMap = new HashMap<Integer,String>();
		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()){
					
					
					EmployeeTypeMap.put(rs.getInt("intEmpType"), rs.getString("strdescription"));
					
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		return EmployeeTypeMap ;
		
	}

	@Override
	public String getEmployeeTypeByName(String Emptypename) {
		
		
		String sql = "{call getEmptypeByName(?)}";
		List<EmployeeType> emptypelist = new ArrayList<>();
		String stremptypelist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
							
			stmt.setString(1, Emptypename);
			
		    try(ResultSet rs = stmt.executeQuery()) {
		    	
		    	while(rs.next()) {
					
					EmployeeType emptype = new EmployeeType(rs.getInt("intEmpType"),rs.getString("strDescription"));
					emptypelist.add(emptype);
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stremptypelist = gson.toJson(emptypelist);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return stremptypelist;
	}
	
	
	

}
