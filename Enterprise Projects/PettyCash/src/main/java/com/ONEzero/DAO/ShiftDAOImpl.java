package com.ONEzero.DAO;

import com.ONEzero.model.Shift;

import com.ONEzero.service.DBUtil2;
import com.google.gson.Gson;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShiftDAOImpl implements ShiftDAO{

	@Override
	public void createShift(Shift shift) {
		
		
		/*String sql = "INSERT INTO tblRefShift (strdescription,intStatus,strRemarks,strEnteredBy,dtmEnteredDate)"
				+ " VALUES (?,?,?,?, GETDATE())";*/  
				
		String sql = "{call spInsertShift(?,?,?,?) }";		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			stmt.setString(1, shift.getDescription());
			stmt.setInt(2, shift.getStatus());
			stmt.setString(3, shift.getRemarks());
			stmt.setString(4, shift.getEnteredby());
			
			
			int result = stmt.executeUpdate();
			
			
			if(result == 1) {
				
				System.out.println("Record Created");
				
			}
			
			else {
				
				System.out.println("Record Created");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public String getAllshifts() {
		
		
		/*String sql = "SELECT * FROM tblRefShift WHERE intStatus != 2";*/
		String sql = "{call spGetAllShifts }";
		List<Shift> shiftlist = new ArrayList<>();
		String stringshift = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()==false) {
					
					Shift shift = new Shift("","","","");
					shiftlist.add(shift);
									
					
				}
				
				else {
					
					do {
						
						
						if(rs.getInt("intStatus")==1) {
							
							String state = "Active";
							
							Shift shift = new Shift(rs.getInt("intShiftId"),rs.getString("strdescription"),state,rs.getString("strRemarks"));
							shiftlist.add(shift);
						}
						
						else if(rs.getInt("intStatus")==0){
							
							String state = "Inactive";
							
							Shift shift = new Shift(rs.getInt("intShiftId"),rs.getString("strdescription"),state,rs.getString("strRemarks"));
							shiftlist.add(shift);
							
							
						}
						
						else {
							
							
		                    String state = "Deleted";
							
							Shift shift = new Shift(rs.getInt("intShiftId"),rs.getString("strdescription"),state,rs.getString("strRemarks"));
							shiftlist.add(shift);
												
							
						}
						
						
					}while(rs.next());
					
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringshift = gson.toJson(shiftlist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return stringshift;
	}
	
	

	@Override
	public void updateShiftById(Shift shift) {
		
		
		/*String sql = "UPDATE tblRefShift SET strdescription = ? , intStatus = ? , strRemarks = ? , strUpdatedBy = ? , "
				+ "dtmUpdatedDate = GETDATE() WHERE intShiftId = ? AND (strUpdatedBy is null OR strUpdatedBy IS NOT null) "
				+ "AND (dtmUpdatedDate is null OR dtmUpdatedDate IS NOT null)";*/
		
		String sql = "{call spUpdateShift(?,?,?,?,?) }";
		
		try(Connection con= DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {

			
			stmt.setString(1, shift.getDescription());
			stmt.setInt(2, shift.getStatus());
			stmt.setString(3, shift.getRemarks());
			stmt.setString(4, shift.getUpdatedby());
			stmt.setInt(5, shift.getShiftid());
			
			int result = stmt.executeUpdate();
			
			
			if(result == 1) {
				
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
	public void deleteShiftById(Shift shift) {
		
		
		/*String sql = "UPDATE tblRefShift SET intStatus = ? , strDeletedBy = ? , "
				+ "dtmDeletedDate = GETDATE() WHERE intShiftId = ? AND (strDeletedBy is null OR strDeletedBy IS NOT null) "
				+ "AND (dtmDeletedDate is null OR dtmDeletedDate IS NOT null)";*/
		
		String sql = "{call spDeleteShift(?,?,?) }";
		
		try (Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)){
			
			
			stmt.setInt(1, shift.getStatus());
			stmt.setString(2, shift.getDeletedby());
			stmt.setInt(3, shift.getShiftid());
			
			int result = stmt.executeUpdate();
			
			
			if(result == 1){
				
				
				System.out.println("Record Deleted");
				
			}
			
			else {
				
				System.out.println("Record Not Deleted");
				
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

	@Override
	public String getShiftByid(String shiftname) {
		
		
		/*String sql = "SELECT * FROM tblRefShift WHERE intStatus != 2";*/
		String sql ="{call spGetShiftsToEmployeeMast(?)}";  
		
		List<Shift> shiftlist = new ArrayList<>();
		String stringshift = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
            if(shiftname == null) {
				
            	shiftname = "";
            	stmt.setString(1, shiftname);
            	
			}
			
            else {
            	
            	stmt.setString(1, shiftname);
            	
            }
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()){
					
					Shift shiftobj = new Shift(rs.getInt("intShiftId"),rs.getString("strdescription"));
					shiftlist.add(shiftobj);
									
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringshift = gson.toJson(shiftlist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringshift;
	}


	
	
	

}
