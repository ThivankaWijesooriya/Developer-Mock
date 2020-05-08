package com.ONEzero.DAO;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import com.ONEzero.controller.PettycashFloatController;
import com.ONEzero.model.Category;
import com.ONEzero.model.Cheque;
import com.ONEzero.model.Iou;
import com.ONEzero.model.SummaryReport;
import com.ONEzero.model.Voucher;
import com.ONEzero.service.DBUtil2;
import com.google.gson.Gson;

public class IouDAOImpl implements IouDAO{

	private Logger logger = Logger.getLogger(IouDAOImpl.class);
	
	@Override
	public void createIOU(Iou iou) {
		
		
		String sql ="{call spInsertIOU(?,?,?,?,?,?,?,?,?,?,?,?,?)}";  
						
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				
				stmt.setString(1, iou.getEmployee().getUserid()); // HardCoded Employee UserID (complete using roles)
				stmt.setString(2, iou.getCategory());
				stmt.setString(3,iou.getDescription());
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(iou.getIoudate());			
				java.sql.Date ioudate = new java.sql.Date(date.getTime());
				//Converting Simpledate into Sqldate
				
				stmt.setDate(4, ioudate);
				stmt.setString(5, iou.getFromlocation());
				stmt.setString(6, iou.getTolocation());
				
				stmt.setString(7, iou.getVia());
				
				
				stmt.setBigDecimal(8, iou.getAmount());
				stmt.setString(9, iou.getRemarks());
				stmt.setString(10, iou.getEnteredby()); 
				
	            stmt.setString(11, "IOU");
				
				stmt.setBoolean(12, false); // bIsIouSettlement
				
				stmt.setString(13, null); // strIouNo
				
				
				int result =stmt.executeUpdate();
				
				con.commit();
				
				if(result==1) {
					
					System.out.println("IOU Created");
					
				}
				
				else {
					
					System.out.println("IOU Not Created");
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
	public String getAlliou() {
		
		
		String sql = "{call spGetAllIOU}";
		List<Iou> ioulist = new ArrayList<Iou>();
		String stringioulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Iou iouobj = new Iou(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"),rs.getString("RMK"), rs.getString("StDES"));
					ioulist.add(iouobj);
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringioulist = gson.toJson(ioulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringioulist;
	}
	
	

	@Override
	public Iou getiouById(String iou) {
		
		
		Iou iouobj = new Iou();
		
		String sql = "{call spGetIOUByID(?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			stmt.setString(1, iou);
			
			try(ResultSet rs =stmt.executeQuery()) {
				
				if(rs.next()) {
					
					iouobj.setIouno(rs.getString("strTrnNo"));
					iouobj.setCategory(rs.getString("strCatCode"));
					iouobj.setDescription(rs.getString("strDescription"));
					
					
					if(rs.getDate("dtmTrnDate")!= null) {
						
											
						
						java.sql.Date ioudate= rs.getDate("dtmTrnDate");				
						DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
						String ioudt = df.format(ioudate);  
						iouobj.setIoudate(ioudt);
						// Converting SQL date to String	
						
					
						
					}
					
					
	                if(rs.getString("strFrom") != null) {
						
						iouobj.setFromlocation(rs.getString("strFrom"));
					}
					
					if(rs.getString("strTo")!= null) {
						
						iouobj.setTolocation(rs.getString("strTo"));
					}
					
					
					
					if(rs.getString("strVia") != null) {
						
						
					   iouobj.setVia(rs.getString("strVia"));
						
					}
					
					
					iouobj.setIsIouReturn(rs.getBoolean("blsIouReturn"));
					iouobj.setReturnComments(rs.getString("strReturnComments"));
					
					iouobj.setAmount(rs.getBigDecimal("decAmount"));
					iouobj.setremarks(rs.getString("strRemarks"));
					
					if(rs.getString("strAppComments")!= null) {
						
						iouobj.setApprovalComments(rs.getString("strAppComments"));
					}
					
					if(rs.getString("strAuthComments")!= null) {
						
						iouobj.setAuthorizeComments(rs.getString("strAuthComments"));
					}
					
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return iouobj;
	}
	
	

	@Override
	public void updateIouById(Iou iou) {
		
		
		String sql = "{call spUpdateIOU(?,?,?,?,?,?,?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, iou.getIouno());
				stmt.setString(2, iou.getCategory());
				stmt.setString(3, iou.getDescription());
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(iou.getIoudate());			
				java.sql.Date ioudate = new java.sql.Date(date.getTime());
				//Converting Simpledate into Sqldate
				
				stmt.setDate(4, ioudate);
				stmt.setString(5, iou.getFromlocation());
				stmt.setString(6, iou.getTolocation());
				stmt.setString(7, iou.getVia());
				
				
				
				stmt.setBigDecimal(8, iou.getAmount());
				stmt.setString(9, iou.getremarks());
				stmt.setString(10, iou.getUpdatedby()); //Hardcoded role
				
				int result = stmt.executeUpdate();
				
				con.commit();
				
				if(result == 1) {
					
					System.out.println("Iou Updated");
				}
				
				else {
					
					System.out.println("Iou Not Updated");
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
	public void deleteIouById(Iou iou) {
		
		
		String sql = "{call spDeleteIOU(?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, iou.getIouno());
				stmt.setString(2, iou.getDeletedby()); // HardCoded Role 
				stmt.setString(3, "IOU");
				
				int result = stmt.executeUpdate();
				con.commit();
				
				if(result==1) {
					
					System.out.println("IOU Deleted");
				}
				
				else {
					
					System.out.println("IOU Not Deleted");
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
	public Map<String, String> fillColumnCategoryType() {
		
		
		String sql = "{call spGetCategory}";
		Map<String,String> CategoryTypeMap = new HashMap<String,String>();
		
		
		try (Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)){
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()){
					
					
					CategoryTypeMap.put(rs.getString("strCatCode"), rs.getString("strCatName"));
					
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		return CategoryTypeMap ;
		
		
		
	}

	@Override
	public void ApproveIouById(Iou iou) {
		
		String sql = "{call spApproveIOU(?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, iou.getIouno());
				stmt.setString(2, iou.getApprovedby()); // HardCoded Role 
				stmt.setString(3, iou.getComments());
				stmt.setString(4, "IOU");
				
				int result = stmt.executeUpdate();
				con.commit();
				
				if(result==1) {
					
					System.out.println("IOU Approved");
				}
				
				else {
					
					System.out.println("IOU Not Approved");
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
	public void RejectIouById(Iou iou,String action) {
		
		
		String sql = "{call spRejectIOU(?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, iou.getIouno());
				stmt.setString(2, iou.getRejectedby()); // HardCoded Role 
				stmt.setString(3, iou.getComments());
				stmt.setString(4, action);
				
				int result = stmt.executeUpdate();
				con.commit();
				
				if(result==1) {
					
					System.out.println("IOU Rejected");
				}
				
				else {
					
					System.out.println("IOU Not Rejected");
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
	public void AuthorizeIouById(Iou iou) {
		
		
		String sql = "{call spAuthorizeIOU(?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, iou.getIouno());
				stmt.setString(2, iou.getAuthorizedby()); // HardCoded Role 
				stmt.setString(3, iou.getComments());
				stmt.setString(4, "IOU");
				
				int result = stmt.executeUpdate();
				con.commit();
				
				if(result==1) {
					
					System.out.println("IOU Authorized");
				}
				
				else {
					
					System.out.println("IOU Not Authorized");
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
	public void CreatePettyCashFloat(Cheque cheque) {
		
		
		String sql = "{call spInsertPettyCashFloat(?,?,?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1,cheque.getChequeno());
				stmt.setBigDecimal(2,cheque.getAmount());
				
				if(cheque.getDate()!= null) {
					
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					Date date = formatter.parse(cheque.getDate());
					
					java.sql.Date chequedate = new java.sql.Date(date.getTime());
					
					stmt.setDate(3,chequedate);
					
					
				}
				
				
				if(cheque.getByteimage()!=null) {
					
					try(InputStream is = new ByteArrayInputStream(cheque.getByteimage())) {
											
						stmt.setBinaryStream(4,is);
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					
				}
				
				stmt.setString(5,cheque.getEnteredby());
				
				stmt.setBigDecimal(6, cheque.getReorderamount());
				
				
				int status = stmt.executeUpdate();
				
				con.commit();
				
				if(status==1) {
					
					System.out.println("Pettycash Float Created");
				}
				
				else {
					
					System.out.println("Pettycash Float Not Created");
				}
				
			} catch (Exception e) {
				
				logger.error(e);
				con.rollback();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void UpdatePettyCashFloat(Cheque cheque) {
		
		
		String sql = "{call spUpdatePettyCashFloat(?,?,?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1,cheque.getChequeno());
				stmt.setBigDecimal(2,cheque.getAmount());
				
				if(cheque.getDate()!= null) {
					
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					Date date = formatter.parse(cheque.getDate());
					
					java.sql.Date chequedate = new java.sql.Date(date.getTime());
					
					stmt.setDate(3,chequedate);
					
					
				}
				
				
				if(cheque.getByteimage()!= null) {
					
					try(InputStream is = new ByteArrayInputStream(cheque.getByteimage())) {
											
						stmt.setBinaryStream(4,is);
						
						
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					
				}
				
				else {
					
					stmt.setBinaryStream(4,null);
					
				}
				

				
				stmt.setString(5,cheque.getUpdatedby());
				
				stmt.setBigDecimal(6, cheque.getReorderamount());
				
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Pettycash Float Updated");
				}
				
				else {
					
					System.out.println("Pettycash Float Not Updated");
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
	public String getAllpettycashfloat() {
		
		
		String sql = "{call spGetAllPettyCashFloat}";
		String floatinglist = null;
		List<Cheque> chequelist = new ArrayList<>();
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()==false) {
					
					
					Cheque chq = new Cheque("","","","");
					chequelist.add(chq);
					
					
				}
				
				else {
					
					
					do {
						
					 if(rs.getBytes("binImage")!= null) {
						 
						 // Converting Bytes to base65 string ( serialize back to image )
						 byte [] byteimage = rs.getBytes("binImage");
						 Base64 encoder = new Base64();
						 String Image64 = encoder.encodeBase64String(byteimage);
						 					
						
						 // Converting Sql date to String Date
						 java.sql.Date chequedate = rs.getDate("dtmDate");				
						 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
						 String chequedt = df.format(chequedate); 
								
								
						Cheque chq = new Cheque(rs.getString("strChequeNo"),rs.getBigDecimal("decAmount"),chequedt,Image64);
						
						chequelist.add(chq);
																		 				  
						 
					 }
						
					}while(rs.next());
					
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			Gson gson = new Gson();
			floatinglist = gson.toJson(chequelist);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return floatinglist;
	}
	
	

	@Override
	public Cheque getchequeById(String cheqid) {
		
		
		String sql = "{call spGetPettyCashFloatById(?)}";
		Cheque chq = new Cheque();
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
						
			stmt.setString(1, cheqid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					chq.setChequeno(rs.getString("strChequeNo"));
					
					
					 java.sql.Date chequedate = rs.getDate("dtmDate");				
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
					 String chequedt = df.format(chequedate); 
					 
					 Date chkdate = chequedate;
					 
					 chq.setChequedt(chkdate);
					
					chq.setDate(chequedt);
					
					chq.setAmount(rs.getBigDecimal("decAmount"));
					
					chq.setReorderamount(rs.getBigDecimal("decReOrderAmount"));
					
					
					byte [] byteimage = rs.getBytes("binImage");
					Base64 encoder = new Base64();
					String Image64 = encoder.encodeBase64String(byteimage);
					
					chq.setBase64image(Image64);
					
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return chq;
	}

	@Override
	public Map<String, String> fillColumnIOU(String userid) {
		
		
		String sql = "{call spGetIOUColumn(?)}";
		// Retieves only Authorized IOU's
		
		Map <String,String> IOU = new HashMap<>();
		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					
					IOU.put(rs.getString("ioucol"), rs.getString("ioucol"));
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return IOU;
	}
	
	
	
	@Override
	public String getPettyCashBalance() {
		
		
		String sql = "{call spGetTransactionBalance(?)}";
		String Balance = null;
		String RealBalance = null;
		
		try (Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)){
			
					
			stmt.registerOutParameter("PettyCashBalance", java.sql.Types.DECIMAL);
			
			stmt.executeUpdate();
			
			BigDecimal bal = stmt.getBigDecimal("PettyCashBalance");
			String numberAsString = String.format("%,f", bal);
			
			/*Balance = (stmt.getBigDecimal("PettyCashBalance")).toString();*/
			
			String [] BalanceParts = numberAsString.trim().split("\\.");
			RealBalance =  BalanceParts[0]+".00";
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return RealBalance;
	}
	
	
	@Override
	public BigDecimal getPettyCashBalanceReorder() {
		
		BigDecimal bal=null;
		String sql = "{call spGetTransactionBalance(?)}";
		
		
		try (Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)){
			
					
			stmt.registerOutParameter("PettyCashBalance", java.sql.Types.DECIMAL);
			
			stmt.executeUpdate();
			
			bal = stmt.getBigDecimal("PettyCashBalance");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return bal;
	}

	@Override
	public void createReturnIou(Iou iou) {
		
		
		String sql = "";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
						
			int status = stmt.executeUpdate();
			
			if(status==1) {
				
				
				System.out.println("Iou Return Created");
				
			}
			
			
			else {
				
				
				System.out.println("Iou Return Not Created");
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public BigDecimal getAmount(String iou) {
		
		
		String sql = "{call spGetIouAmount(?)}";
		BigDecimal amount = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
					   
		   stmt.setString(1, iou);
		   
		   try(ResultSet rs = stmt.executeQuery()) {
			   
			   if(rs.next()) {
				   
				   amount = rs.getBigDecimal("decAmount");
			   }
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		   
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
		return amount;
	}

	@Override
	public void IOUreturn(Iou iou) {
		
		
		String sql = "{call spReturnIou(?,?,?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setBoolean(1, iou.getIsIouReturn());
				stmt.setString(2, iou.getReturnedby());
				stmt.setString(3, iou.getIouno());
				stmt.setString(4, iou.getReturnComments());
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("IOU Returned");
				}
				
				else {
					
					System.out.println("IOU Not Returned");
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
	public String getAlliouReturns() {
		
		
		String sql = "{call spGetAllReturnIou}";
		List<Iou> ioulist = new ArrayList<Iou>();
		String stringioulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Iou iouobj = new Iou(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"),rs.getString("RMK"), rs.getString("StDES"));
					ioulist.add(iouobj);
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringioulist = gson.toJson(ioulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringioulist;
		
	}

	@Override
	public Map<String, String> fillColumnIouWithReturns() {
		
		
		String sql = "{call spGetIOUColumnWithReturns}";
		
		// To display all Iou's for View Iou Page
		
		Map <String,String> IOU = new HashMap<>();
		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {

			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					IOU.put(rs.getString("strTrnNo"), rs.getString("strTrnNo"));
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return IOU;
	}

	@Override
	public void AuthorizeIouReturn(Iou iou) {
		
		
		String sql = "{call spAuthorizeIouReturn(?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
		 
		    con.setAutoCommit(false);
		    
			try(CallableStatement stmt = con.prepareCall(sql)) {
			 
			 stmt.setBoolean(1, iou.getIsIouReturn());
			 stmt.setString(2, iou.getIouno());
			 
			 
			 int status = stmt.executeUpdate();
			 con.commit();
			 
			 if(status==1) {
				 
				 System.out.println("Returned Iou Authorized");
			 }
			 
			 else {
				 
				 System.out.println("Returned Iou Not Authorized");
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
	public void RejectIouReturn(Iou iou) {
		
		
		String sql = "{call spRejectIouReturn(?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, iou.getIouno());
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Returned Iou Rejected");
				}
				
				else {
					
					System.out.println("Returned Iou Not Rejected");
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
	public void MailSchedule() {
		
		String sql = "{call spScheduleTopupMail(?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				BigDecimal balance = getPettyCashBalanceReorder();
				
				stmt.setBigDecimal(1, balance);
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Mail sent");
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
	public String getAllAuthorizedIOU(String userid) {
		
		String sql = "{call spGetAuthorizedIOU(?)}";
		List<Iou> ioulist = new ArrayList<>();
		String jsonioulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Iou iouobj = new Iou(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"),rs.getString("RMK"), rs.getString("StDES"));
					ioulist.add(iouobj);
					
				}
				
				Gson gson = new Gson();
				jsonioulist = gson.toJson(ioulist);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return jsonioulist;
	}

	@Override
	public void IouReminder() {
		
		String sql = "{call spScheduleIouReminder}";
		try(Connection con = DBUtil2.getInstance().getConnection()) {
			
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				int status = stmt.executeUpdate();
				con.commit();
				
				if(status==1) {
					
					System.out.println("Mail Sent");
				}
				
				else {
					
					System.out.println("Mail Not Sent");
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
	public String getIouByUserId(String userid) {
		
		String sql = "{call spGetAllIouByUserId(?)}";
		List<Iou> ioulist = new ArrayList<Iou>();
		String stringioulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Iou iouobj = new Iou(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"),rs.getString("RMK"), rs.getString("StDES"));
					ioulist.add(iouobj);
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringioulist = gson.toJson(ioulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringioulist;
	}

	@Override
	public String getAlliouReturnsById(String userid) {
		
		String sql = "{call spGetAllReturnIouById(?)}";
		List<Iou> ioulist = new ArrayList<Iou>();
		String stringioulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Iou iouobj = new Iou(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"),rs.getString("RMK"), rs.getString("StDES"));
					ioulist.add(iouobj);
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringioulist = gson.toJson(ioulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringioulist;
	}

	@Override
	public String getallTransactionIOUandReturns() {
		
		String sql = "{call spGetAllTransactionIOUandReturns}";
		List<Iou> ioulist = new ArrayList<Iou>();
		String stringIoulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					 java.sql.Date RqstDt = rs.getDate("RqstDt");				
					 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
					 String requestedDate = df.format(RqstDt); 
					
					 if(rs.getString("Approver")==null) {
						
						 Iou iou = new Iou(rs.getString("TNO"),requestedDate,rs.getString("EnteredBy"),rs.getString("CNM"),rs.getString("StDES"),rs.getBigDecimal("AMT"),"");
							
						 ioulist.add(iou);
						 
						 
					 }
					 
					 else {
						 
						 Iou iou = new Iou(rs.getString("TNO"),requestedDate,rs.getString("EnteredBy"),rs.getString("CNM"),rs.getString("StDES"),rs.getBigDecimal("AMT"),rs.getString("Approver"));
							
						 ioulist.add(iou);
						 
						 
					 }
					 
									
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringIoulist = gson.toJson(ioulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringIoulist;
		
	}

	@Override
	public String getAllAuthorizediouReturnsById(String userid) {
		
		String sql = "{call spGetAllAuthorizedReturnIouById(?)}";
		List<Iou> ioulist = new ArrayList<Iou>();
		String stringioulist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			stmt.setString(1, userid);
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Iou iouobj = new Iou(rs.getString("TNO"),rs.getString("strType"),rs.getString("CNM"),rs.getString("TDES"),rs.getBigDecimal("AMT"),rs.getString("RMK"), rs.getString("StDES"));
					ioulist.add(iouobj);
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			stringioulist = gson.toJson(ioulist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return stringioulist;
	}

	@Override
	public void ApproveIouReturn(Iou iou) {
		
		String sql = "{call spApproveiouReturn(?)}";
		try(Connection con = DBUtil2.getInstance().getConnection()) {
		
			con.setAutoCommit(false);
			
			try(CallableStatement stmt = con.prepareCall(sql)) {
				
				stmt.setString(1, iou.getIouno());
				
	            int status = stmt.executeUpdate();
	            con.commit();
				
				if(status==1) {
					
					System.out.println("Iou Return Approved");
				}
				
				else {
					
					System.out.println("Iou Return Not Approved");
				}	
				
			} catch (Exception e) {
				
				e.printStackTrace();
				con.rollback();
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}



}
