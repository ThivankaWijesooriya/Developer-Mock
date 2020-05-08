package com.ONEzero.DAO;

import com.ONEzero.model.Employee;
import com.ONEzero.model.Pages;
import com.ONEzero.service.AES_Service;

import com.ONEzero.service.DBUtil2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthoritiesDAOImpl implements AuthoritiesDAO{

	@Override
	public Boolean AuthorizedReportingOfficer(String userid) {
		
		
		String sql = "select * from tblMasEmployee where BIsRptOff = 1 AND strUserCode = ? ";
		
		try (Connection con = DBUtil2.getInstance().getConnection();PreparedStatement stmt = con.prepareStatement(sql))
		
		{
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()) {
					
					return true;
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
									
			
		} 
		
		catch (Exception e) 
		
		{
			e.printStackTrace();
		}
		
		
		return false;
	}
	

	@Override
	public List<Pages> AuthorizedPageViewer(String userid) {
		
		
		String sql ="{call spGetAccessRights(?)}";  
		
		
		List<Pages> pagelist = new ArrayList<>();
		
				
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					
					Pages page = new Pages(rs.getInt("intpageid"),rs.getString("strpagename"));
					pagelist.add(page);
					
			    }
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
					
		} catch (Exception e) {
			
			
			e.printStackTrace();
			
		}
		
		return pagelist;
	}
	
	

	@Override
	public void SubmitPageAuthorities(String userid,Pages page) {
		
		
		String sql ="{call spInsertAuthority(?,?)}";  
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				ClearCachedAuth(userid);
				
				int status;
				
				  int pageid [] = page.getPagelist();
			        
			        for(int id: pageid) {
			        	
			        	
			        	stmt.setInt(1, id);
			        	
			        	stmt.setString(2, userid);
						
						status =stmt.executeUpdate();
						con.commit();
						
						if(status==1) {
							
							System.out.println("Authority Submitted");
						}
						
						else {
							
							System.out.println("Authority Not Submitted");
							
						}
											
			      }
				
			} catch (Exception e) {
				
				e.printStackTrace();
				con.rollback();
			}
					
						
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	

	@Override
	public void ClearCachedAuth(String userid) {
		
		
		String sql ="{call spGetAuthCount(?)}";  
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, userid);
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Cached auth cleared");
				}
				
				else {
					
					System.out.println("Cached auth Not cleared");
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
				con.rollback();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	

	@Override
	public Pages getPages(String userid) {
		
		
		
		String sql = "{call spGetPages(?)}";
		int [] Pages = new int[10];
		
		Pages page = new Pages();
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
                while(rs.next()) {
					
					Pages[rs.getRow()-1] = rs.getInt("intPageId");
								
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			page.setPagelist(Pages);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return page;
		
	}


	@Override
	public Boolean isAdmin(String userid) {
		
		
		String sql = "{call spIsAdmin(?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					return true;
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}


	@Override
	public Boolean isAuthorizer(String userid) {
		
		
		String sql = "{call spIsAuthorizer(?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					return true;
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}


	@Override
	public Boolean ValidateReject(String Trnno) {
		
		
		String sql = "{call spValidateRejectButton(?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
						
			stmt.setString(1, Trnno);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()) {
					
					
					if(rs.getString("StDES").equalsIgnoreCase("IOU Authorized")) {
						
						return true;
					}
					
					else if (rs.getString("StDES").equalsIgnoreCase("Voucher Authorized")){
						
						return true;
					}
					
					
					else if (rs.getString("StDES").equalsIgnoreCase("IOU Return Authorized")) {
						
						return true;
					}
					
					else {
						
						return false;
					}
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}


	@Override
	public Boolean ValidateApproved(String Trnno) {
		
		String sql = "{call spValidateRejectButton(?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
						
			stmt.setString(1, Trnno);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()) {
					
					
					if(rs.getString("StDES").equalsIgnoreCase("IOU Approved")) {
						
						return true;
					}
					
					else if (rs.getString("StDES").equalsIgnoreCase("Voucher Approved")){
						
						return true;
					}
					
					else if(rs.getString("StDES").equalsIgnoreCase("IOU Return Approved")) {
						
						return true;
					}

					
					else {
						
						return false;
					}
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return null;
		
	}


}
