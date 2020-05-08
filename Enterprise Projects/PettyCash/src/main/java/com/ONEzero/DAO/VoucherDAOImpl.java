package com.ONEzero.DAO;


import com.ONEzero.model.Voucher;

import com.ONEzero.service.DBUtil2;
import com.google.gson.Gson;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class VoucherDAOImpl implements VoucherDAO{
	
	private Logger logger = Logger.getLogger(VoucherDAOImpl.class);

	@Override
	public void createVoucher(Voucher voucher) {
		
		
		String sql = "{call spInsertIOU(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {

			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, voucher.getEmployee().getUserid());
				stmt.setString(2, voucher.getCategory());
				stmt.setString(3,voucher.getDescription());
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(voucher.getVoucherdate());			
				java.sql.Date voudate = new java.sql.Date(date.getTime());
				//Converting Simpledate into Sqldate
				
				stmt.setDate(4, voudate);
				stmt.setString(5, voucher.getFromlocation());
				stmt.setString(6, voucher.getTolocation());
				
				stmt.setString(7, voucher.getVia());
						
				stmt.setBigDecimal(8, voucher.getAmount());
				stmt.setString(9, voucher.getRemarks());
				stmt.setString(10, voucher.getEnteredby()); 
				
	            stmt.setString(11, "VOU");
				
				stmt.setBoolean(12, voucher.isIsiousettlement());
				
				stmt.setString(13, voucher.getSettlediouno());
				
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Voucher Created");
					
				}
				
				else {
					
					
					System.out.println("Voucher Not Created");
					
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
	public Voucher getVoucherById(String voucher) {
		
		
		String sql = "{call spGetVoucherByID(?)}";
		Voucher vou = new Voucher();
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
						
			stmt.setString(1, voucher);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()) {
					
					vou.setVoucherno(rs.getString("strTrnNo"));
					vou.setCategory(rs.getString("strCatCode"));
					vou.setDescription(rs.getString("strDescription"));
					
					
					
					if(rs.getDate("dtmTrnDate")!= null) {
						
											
						
						java.sql.Date voudate= rs.getDate("dtmTrnDate");				
						DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
						String voudt = df.format(voudate);  
						vou.setVoucherdate(voudt);
						// Converting SQL date to String	
						
					
						
					}
					
					vou.setIsiousettlement(rs.getBoolean("bIsIouSettlement"));
					vou.setSettlediouno(rs.getString("strIouNo"));
					
					
	                if(rs.getString("strFrom") != null) {
						
						vou.setFromlocation(rs.getString("strFrom"));
					}
					
					if(rs.getString("strTo")!= null) {
						
						vou.setTolocation(rs.getString("strTo"));
					}
					
					
					
					if(rs.getString("strVia") != null) {
						
						
					   vou.setVia(rs.getString("strVia"));
						
					}
					
					vou.setAmount(rs.getBigDecimal("decAmount"));
					vou.setRemarks(rs.getString("strRemarks"));
					
                    if(rs.getString("strAppComments")!= null) {
						
                    	vou.setAppcomments(rs.getString("strAppComments"));
					}
					
					if(rs.getString("strAuthComments")!= null) {
						
						vou.setAuthcomments(rs.getString("strAuthComments"));
					}
					
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return vou;
	}

	@Override
	public void updateVoucherById(Voucher voucher) {
		
      
      String sql = "{call spUpdateVoucher(?,?,?,?,?,?,?,?,?,?,?,?)}";
      
      try(Connection con = DBUtil2.getInstance().getConnection()) {
    	
    	con.setAutoCommit(false);  
    	
    	try(CallableStatement stmt = con.prepareCall(sql)) {
    		
    		  stmt.setString(1, voucher.getVoucherno());
	      	  stmt.setString(2, voucher.getCategory());
	      	  stmt.setString(3, voucher.getDescription());
      	  

  			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
  			Date date = formatter.parse(voucher.getVoucherdate());			
  			java.sql.Date voudate = new java.sql.Date(date.getTime());
  			//Converting Simpledate into Sqldate
  			
  			stmt.setDate(4, voudate);
  			stmt.setString(5, voucher.getFromlocation());
  			stmt.setString(6, voucher.getTolocation());
  			
  			stmt.setString(7, voucher.getVia());
  			
  			
  			stmt.setBoolean(8, voucher.isIsiousettlement());
  			
  			stmt.setString(9, voucher.getSettlediouno());
  			
  			
  			stmt.setBigDecimal(10, voucher.getAmount());
  			stmt.setString(11, voucher.getRemarks());
  			stmt.setString(12, voucher.getUpdatedby()); // hardcoded role
      	  
      	  int status = stmt.executeUpdate();
      	  con.commit();
      	  
      	  if(status==1) {
      		  
      		  System.out.println("Voucher Updated");
      	  }
      	  
      	  else {
      		  
      		  System.out.println("Voucher Not Updated");
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
	public void deleteVoucherById(Voucher voucher) {
		
		
		String sql = "{call spDeleteIOU(?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, voucher.getVoucherno());
				stmt.setString(2, voucher.getDeletedby()); // HardCoded Role 
				stmt.setString(3, "VOU");
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Voucher Deleted");
				}
				
				else {
					
					System.out.println("Voucher Not Deleted");

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
	public void ApproveVoucherById(Voucher voucher) {
		
		String sql = "{call spApproveIOU(?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, voucher.getVoucherno());
				
				stmt.setString(2, voucher.getApprovedby()); // HardCoded Role 
				
				stmt.setString(3, voucher.getComments());
				
				stmt.setString(4, "VOU");
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Voucher Approved");
				}
				
				else {
					
					System.out.println("Voucher Not Approved");
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
	public void RejectVoucherById(Voucher voucher, String action) {
		

		
		String sql = "{call spRejectIOU(?,?,?,?)}";
				
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, voucher.getVoucherno());
				
				stmt.setString(2, voucher.getApprovedby()); // HardCoded Role 
				
				stmt.setString(3, voucher.getComments());
				
				stmt.setString(4, action);
				
				
				int result = stmt.executeUpdate();
				con.commit();
				
				if(result==1) {
					
					System.out.println("VOU Rejected");
				}
				
				else {
					
					System.out.println("VOU Not Rejected");
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
	public void AuthorizeVoucherById(Voucher voucher) {

		
		String sql = "{call spAuthorizeIOU(?,?,?,?)}";
				
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, voucher.getVoucherno());
				stmt.setString(2, voucher.getAuthorizedby()); // HardCoded Role 
				stmt.setString(3, voucher.getComments());
				stmt.setString(4, "VOU");
				
				
				int result = stmt.executeUpdate();
				con.commit();
				
				if(result==1) {
					
					System.out.println("Voucher Authorized");
				}
				
				else {
					
					System.out.println("Voucher Not Authorized");
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
	public String getAllTransaction() 
	{
		
		
		String sql = "{call spGetAllTransaction}";
		List<Voucher> voulist = new ArrayList<Voucher>();
		String stringVoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					 java.sql.Date RqstDt = rs.getDate("RqstDt");				
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
					 String requestedDate = df.format(RqstDt); 
					
					 if(rs.getString("strType")== "IOU") {
						 
						 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
						 voulist.add(vouobj);
						 
					 }
					 
					 else {
						 
						 if(rs.getString("iounum")==null) {
							
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
							 voulist.add(vouobj);
							 
						 }
						 
						 else {
							 
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,rs.getString("iounum"),rs.getString("Approver"),rs.getString("IouBeforeSettle"));
							 voulist.add(vouobj);
							 
						 }
						 
					 }
									
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringVoulist = gson.toJson(voulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringVoulist;
		
	}



	@Override
	public String getAllVoucher() {
		
		
		String sql = "{call spGetAllVoucher}";
		List<Voucher> voulist = new ArrayList<Voucher>();
		String stringVoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"));
					voulist.add(vouobj);
									
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringVoulist = gson.toJson(voulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringVoulist;
		
		
	}



	@Override
	public String getAllAuthorizedVouchers(String userid) {
		
		
		String sql = "{call spGetAuthorizedVOU(?)}";
		List<Voucher> voulist = new ArrayList<>();
		String jsonvoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection(); CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"));
					voulist.add(vouobj);
					
				}
				
				Gson gson = new Gson();
				jsonvoulist = gson.toJson(voulist);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		return jsonvoulist;
				
	}



	@Override
	public String getAllVoucherByUserId(String userid) {
		
		String sql = "{call spGetAllVoucherByUserId(?)}";
		List<Voucher> voulist = new ArrayList<Voucher>();
		String stringVoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"));
					voulist.add(vouobj);
									
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringVoulist = gson.toJson(voulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringVoulist;
		
	}



	@Override
	public String getAllTransactionByRptOfficer(String userid) {
		
		String sql = "{call spGetAllTransactionByOfficer(?)}";
		List<Voucher> voulist = new ArrayList<Voucher>();
		String stringVoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					
					 java.sql.Date RqstDt = rs.getDate("RqstDt");				
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
					 String requestedDate = df.format(RqstDt); 
					
					 /*Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate);
					 voulist.add(vouobj);*/
					 
                     if(rs.getString("strType")== "IOU") {
						 
						 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
						 voulist.add(vouobj);
						 
					 }
					 
					 else {
						 
						 if(rs.getString("iounum")==null) {
							
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
							 voulist.add(vouobj);
							 
						 }
						 
						 else {
							 
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,rs.getString("iounum"),rs.getString("Approver"),rs.getString("IouBeforeSettle"));
							 voulist.add(vouobj);
							 
						 }
						 
					 }
									
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringVoulist = gson.toJson(voulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringVoulist;
		
	}



	@Override
	public String getAllTransactionVoucher() {
		
		String sql = "{call spGetAllTransactionVoucher}";
		List<Voucher> voulist = new ArrayList<Voucher>();
		String stringVoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					
					
					 java.sql.Date RqstDt = rs.getDate("RqstDt");				
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
					 String requestedDate = df.format(RqstDt); 
					

						 if(rs.getString("approver")==null) {
							 
							 
							 if(rs.getString("iounum")==null) {
								 
								 Voucher vou = new Voucher(rs.getString("TNO"),requestedDate,rs.getString("EnteredBy"),rs.getString("CNM"),rs.getString("StDES"),rs.getBigDecimal("AMT"),"","","");
									
								 voulist.add(vou);
								 
							 }
							 
                             else {
								 
								 Voucher vou = new Voucher(rs.getString("TNO"),requestedDate,rs.getString("EnteredBy"),rs.getString("CNM"),rs.getString("StDES"),rs.getBigDecimal("AMT"),"",rs.getString("iounum"),rs.getString("IouBeforeSettle"));
									
								 voulist.add(vou);
								 
							 }
							 
							 
						 }
						 
						 else {
							 
							 
                            if(rs.getString("iounum")==null) {
								 
								 Voucher vou = new Voucher(rs.getString("TNO"),requestedDate,rs.getString("EnteredBy"),rs.getString("CNM"),rs.getString("StDES"),rs.getBigDecimal("AMT"),rs.getString("approver"),"","");
									
								 voulist.add(vou);
								 
							 }
							 
                             else {
								 
                            	 Voucher vou = new Voucher(rs.getString("TNO"),requestedDate,rs.getString("EnteredBy"),rs.getString("CNM"),rs.getString("StDES"),rs.getBigDecimal("AMT"),rs.getString("approver"),rs.getString("iounum"),rs.getString("IouBeforeSettle"));
 								
    							 voulist.add(vou);
								 
							 }
							 
							 
							 
						 }
						

					 									
					
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringVoulist = gson.toJson(voulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringVoulist;
		
		
	}



	@Override
	public String getAllInquiryByStatus(String status) {
		
		String sql = "{call spGetAllTransactionsByStatus(?)}";
		List<Voucher> voulist = new ArrayList<Voucher>();
		String stringVoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, status);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					 java.sql.Date RqstDt = rs.getDate("RqstDt");				
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
					 String requestedDate = df.format(RqstDt); 
					
					 if(rs.getString("strType")== "IOU") {
						 
						 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
						 voulist.add(vouobj);
						 
					 }
					 
					 else {
						 
						 if(rs.getString("iounum")==null) {
							
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
							 voulist.add(vouobj);
							 
						 }
						 
						 else {
							 
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,rs.getString("iounum"),rs.getString("Approver"),rs.getString("IouBeforeSettle"));
							 voulist.add(vouobj);
							 
						 }
						 
					 }
					
									
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringVoulist = gson.toJson(voulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringVoulist;
		
	}



	@Override
	public String getAllInquiryBySearch(String fromDate, String toDate, String status) {
		
		String sql = "{call spGetAllTransactionsBySearch(?,?,?)}";
		List<Voucher> voulist = new ArrayList<Voucher>();
		String stringVoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				
				if(fromDate==null) {
					
					stmt.setDate(1, null);
				}
				
				else {
					
					Date date = formatter.parse(fromDate);
					
					java.sql.Date fromDt = new java.sql.Date(date.getTime());
					stmt.setDate(1, fromDt);
					
				}
				
				
				if(toDate==null) {
					
					stmt.setDate(2, null);
				}
				
				else {
					
					Date date2 = formatter.parse(toDate);
					
					java.sql.Date toDt = new java.sql.Date(date2.getTime());
					stmt.setDate(2, toDt);
					
					
				}
          
           
                stmt.setString(3, status);
           
 			
			    try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					 java.sql.Date RqstDt = rs.getDate("RqstDt");				
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
					 String requestedDate = df.format(RqstDt); 
					 
					 if(rs.getString("strType")== "IOU") {
						 
						 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
						 voulist.add(vouobj);
						 
					 }
					 
					 else {
						 
						 if(rs.getString("iounum")==null) {
							
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,"",rs.getString("Approver"),"");
							 voulist.add(vouobj);
							 
						 }
						 
						 else {
							 
							 Voucher vouobj = new Voucher(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"), rs.getString("StDES"),rs.getString("EnteredBy"),requestedDate,rs.getString("iounum"),rs.getString("Approver"),rs.getString("IouBeforeSettle"));
							 voulist.add(vouobj);
							 
						 }
						 
					 }
														
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringVoulist = gson.toJson(voulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringVoulist;
		
	}
	
	
	

}
