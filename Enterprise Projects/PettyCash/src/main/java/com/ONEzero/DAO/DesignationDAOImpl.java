package com.ONEzero.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ONEzero.controller.HomeController;
import com.ONEzero.model.Department;
import com.ONEzero.model.Designation;

import com.ONEzero.service.DBUtil2;
import com.google.gson.Gson;

public class DesignationDAOImpl implements DesignationDAO{
	
	private Logger logger = Logger.getLogger(DesignationDAOImpl.class);
	
	
	@Override
	public void createDesignation(Designation designation) {
		
		
		/*String sql ="INSERT INTO tblRefDesignation (strDesigId,strDesigName,intStatus,strRemarks,strEnteredBy,dtmEnteredDate) VALUES (?,?,?,?,?,GETDATE()) ";*/
		String sql = "{call spInsertDesignation(?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			stmt.setString(1, designation.getDesigname());
			stmt.setInt(2, designation.getStatus());
			stmt.setString(3, designation.getRemarks());
			stmt.setString(4, designation.getEnteredby());
			
			/*stmt.setString(4, "Thivanka");*/ // UNDO during Initial Config
			
			
			int result = stmt.executeUpdate();
			
			if(result==1) {
				
				System.out.println("Record was Created");
			}
			
			else {
				
				System.out.println("Record Not Created");
			}
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
			
		}
		
	}
	
	

	@Override
	public String getAllDesignation() {
		
		/*String sql = "SELECT * From tblRefDesignation WHERE intStatus != 2 ";*/
		
		String sql = "{call spGetAllDesignation}";
		
		String StringDesiglist=null;
		
		List<Designation> desiglist = new ArrayList<Designation>();
		

		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {

			
			try(ResultSet rs  = stmt.executeQuery()) {
				
				if(rs.next()== false) {
					
					
					Designation desig = new Designation("","","","");
			    	desiglist.add(desig);
					
					
				}
				
				else {
					
					
					do {
						
						
						
						if(rs.getInt("intStatus")==1) {
					    	
					    	String state = "Active";
					    	
					    	Designation desig = new Designation(rs.getString("strDesigCode"),rs.getString("strDesigName"),state,rs.getString("strRemarks"));
					    	desiglist.add(desig);
					    	
					    }
					    
					    else if(rs.getInt("intStatus")==0){
					    	
					    	String state = "Inactive";
					    	
					    	Designation desig = new Designation(rs.getString("strDesigCode"),rs.getString("strDesigName"),state,rs.getString("strRemarks"));
					    	desiglist.add(desig);
					    }
					    
					    else {
					    	
					    	
		                    String state = "Deleted";
					    	
					    	Designation desig = new Designation(rs.getString("strDesigCode"),rs.getString("strDesigName"),state,rs.getString("strRemarks"));
					    	desiglist.add(desig);
					    	
					    	
					    }
						
						
						
						
					}while(rs.next());
					
					
				}
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			Gson gson = new Gson();
			StringDesiglist = gson.toJson(desiglist);
			

		} catch (Exception e) {

			e.printStackTrace();

		}
				

		return StringDesiglist;
	}
	
		

	@Override
	public void updateDesignationById(Designation designation) {
		
		
		/*String sql ="UPDATE tblRefDesignation SET strDesigName = ?, intStatus = ?, strRemarks = ? , strUpdatedBy = ? , dtmUpdatedDate = GETDATE()  WHERE strDesigId = ? AND (strUpdatedBy is null OR strUpdatedBy IS NOT null) AND (dtmUpdatedDate is null OR dtmUpdatedDate IS NOT null) ";*/
		String sql = "{call spUpdateDesignationById(?,?,?,?,?)}";
				
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {

			
			stmt.setString(1, designation.getDesigname());
			stmt.setInt(2, designation.getStatus());
			stmt.setString(3, designation.getRemarks());
			stmt.setString(4, designation.getUpdatedby());
			stmt.setString(5, designation.getDesigid());
			
			int result = stmt.executeUpdate();
			
			if(result==1)
				
			{
				
				System.out.println("Record is Updated");
				
			}
			
			else 
				
			{
				
				System.out.println("Record is Not Updated");
				
			}
			
		} catch (Exception e) {
			
			/*e.printStackTrace();*/
			logger.error(e);
			
		}
		
	}
		

	@Override
	public void deleteDesignationById(Designation designation) {
		
		
		/*String sql ="UPDATE tblRefDesignation SET intStatus = ?, strDeletedBy = ? , dtmDeletedDate = GETDATE() WHERE strDesigId = ? AND (strDeletedBy is null OR strDeletedBy IS NOT null) AND (dtmDeletedDate is null OR dtmDeletedDate IS NOT null)";*/
		String sql = "{call spDeleteDesignationById(?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setInt(1, designation.getStatus());
			stmt.setString(2, designation.getDeletedby());
			stmt.setString(3, designation.getDesigid());
			
			
			int result =  stmt.executeUpdate();
			
			 if(result==1)
				 
			 {
				 
				 System.out.println("Record Deleted");
				
				 
			 }
			 
			 else 
				 
			 {
				 
				  System.out.println("Record Not Deleted");
			 }
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}



	@Override
	public String getDesignationToEmployeeMast() {
		
		
		String sql = "{call spGetDesignationToEmployeeMast}";
		List<Designation> desiglist = new ArrayList<Designation>();
		
		
		String StringDesiglist=null;
		

		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {

			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
				    if(rs.getInt("intStatus")==1) {
				    	
				    	String state = "Active";
				    	
				    	Designation desig = new Designation(rs.getString("strDesigCode"),rs.getString("strDesigName"),state,rs.getString("strRemarks"));
				    	desiglist.add(desig);
				    	
				    }
				    
				    else if(rs.getInt("intStatus")==0){
				    	
				    	String state = "Inactive";
				    	
				    	Designation desig = new Designation(rs.getString("strDesigCode"),rs.getString("strDesigName"),state,rs.getString("strRemarks"));
				    	desiglist.add(desig);
				    }
				    
				    else {
				    	
				    	
	                    String state = "Deleted";
				    	
				    	Designation desig = new Designation(rs.getString("strDesigCode"),rs.getString("strDesigName"),state,rs.getString("strRemarks"));
				    	desiglist.add(desig);
				    	
				    	
				    }
													
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
			Gson gson = new Gson();
			StringDesiglist = gson.toJson(desiglist);
			

		} catch (Exception e) {

			e.printStackTrace();

		}
				

		return StringDesiglist;
		
		
	}



	@Override
	public String getDesignationByName(String Designame) {
		
		
		String sql = "{call getDesigByName(?)}";
		List <Designation> desiglist = new ArrayList<>();
		String strdesiglist = null;
		
		try (Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)){
			
			
	           if(Designame == null) {
					
					
	        	    Designame = "";
	        	    stmt.setString(1, Designame);
					
				}
				
				else {
					
					stmt.setString(1, Designame);
					
				}
			
			
	        try(ResultSet rs = stmt.executeQuery()) {
	        	
	        	
	        	while(rs.next()) {
					
	  			  Designation dobj = new Designation(rs.getString("strDesigCode"),rs.getString("strDesigName"));
	  			  desiglist.add(dobj);
	  			  
	  			}
	        	 
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			strdesiglist = gson.toJson(desiglist);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return strdesiglist;
	}



}
