package com.ONEzero.DAO;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ONEzero.model.Category;
import com.ONEzero.model.Department;
import com.ONEzero.model.Report;
import com.ONEzero.model.SummaryReport;
import com.ONEzero.service.DBUtil2;
import com.google.gson.Gson;

public class ReportDAOImpl implements ReportDAO{

	@Override
	public String getReimbursement(String fromDate, String toDate) {
		
		String sql = "{call spGetReimbursement(?,?)}";
		List<Report> reportList = new ArrayList<Report>();
		String reimburseList = null;
		
		
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
          
           			
			 try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					

					
					     java.sql.Date paiddate = rs.getDate("dtmDate");				
						 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
						 String pdate = df.format(paiddate); 
					 
					 
						 Department dept = new Department();
						 dept.setDeptname(rs.getString("strDeptName"));
						 						 
						 						 
						 Report reportObj = new Report(rs.getString("strTrnNo"),pdate,rs.getString("strKnownName"),rs.getString("strDescription"),rs.getString("strCatName"),dept,rs.getBigDecimal("decTransAmount"),getPettycashFloatTotal(),getUnsettledIouTotal());
						 System.out.println(getUnsettledIouTotal());
						 reportList.add(reportObj);
						 						 
												 										 																			
				}
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			Gson gson = new Gson();
			reimburseList = gson.toJson(reportList);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return reimburseList;
	}

	@Override
	public String getPettycashFloatTotal() {
		
		String sql = "{call spGetPettycashTotal}";
		String StrTotal= null;
				
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
        ResultSet rs = stmt.executeQuery();
        
        BigDecimal Total = null;
        
		if(rs.next()) {
			
			if(rs.getBigDecimal("total")==null) {
				
				Total = BigDecimal.ZERO;
				StrTotal = Total.toString();
			}
			
			else {
				
				Total = rs.getBigDecimal("total");		
				StrTotal = Total.toString();
				
			}
			
		}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return StrTotal;
				
		
	}

	@Override
	public String getUnsettledIouTotal() {
		
		String sql = "{call spGetTotalOutstandingIou}";
		String StrTotal= null;
				
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
        ResultSet rs = stmt.executeQuery();
        
        BigDecimal Total= null;
		if(rs.next()) {
			
			if(rs.getBigDecimal("Total")==null) {
				
				Total = BigDecimal.ZERO;
				StrTotal = Total.toString();
				
			}
			
			else {
				
				Total = rs.getBigDecimal("Total");
				StrTotal = Total.toString();
				
			}
			
		}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return StrTotal;
	}
	
	
	@Override
	public List<SummaryReport> getDeptSummary() {
		
		String sql = "{call spGetDeptSummary}";
		List<SummaryReport> rptlist = new ArrayList<SummaryReport>();
		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
						
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					SummaryReport cat = new SummaryReport(rs.getBigDecimal("Total"),rs.getString("strDeptName"),rs.getString("strCatName"));
					rptlist.add(cat);
										
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
						
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return rptlist;
	}
	
	
	@Override
	public List<Category> getCategoryList() {
		
		String sql = "{call spGetCategory}";
		List<Category> catlist = new ArrayList<Category>();
		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
						
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Category cat = new Category(rs.getString("strCatName"));
					catlist.add(cat);
										
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return catlist;
	}

}
