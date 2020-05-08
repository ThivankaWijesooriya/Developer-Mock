package com.ONEzero.DAO;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.Date;

import com.ONEzero.model.Department;
import com.ONEzero.model.Designation;
import com.ONEzero.model.Employee;
import com.ONEzero.model.Shift;
import com.ONEzero.service.AES_Service;

import com.ONEzero.service.DBUtil2;
import com.google.gson.Gson;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void createEmployee(Employee employee) {

		
		String sql="INSERT INTO tblMasEmployee (strUserCode,strEmployeeCode,blobimage,intEmpType,"
				+ "strEmpFirstName,strEmpLastName,strEmpFullName,strPermanentAddress1,strPermanentAddress2,"
				+ "strPermanentAddress3,strTempAddress1,strTempAddress2,strTempAddress3,strEmpMobile,"
				+ "strEmpTP,strEmail,intStatus,dateDateofTerm,dateDateofResig,BIsRptOff,strRptOffId,strRptOffName,"
				+ "strAltOffId,strAltOffName,strSex,strMaritalStatus,strDeptCode,strDesigCode,strKnownName,"
				+ "strUserName,strPassWord,strRemarks,strEnteredBy,dtmEnteredDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,?,GETDATE())";
		
		try(Connection con = DBUtil2.getInstance().getConnection();PreparedStatement stmt = con.prepareStatement(sql)) {
			
						
		/*	int EmpintType = Integer.parseInt(employee.getEmployeetype());
			if(EmpintType == 2) {
				
				stmt.setString(1, "ONZ"+employee.getUserid());
			}
			
			else {
				
				stmt.setString(1, employee.getUserid());
			}*/
			
			stmt.setString(1, employee.getUserid());
			stmt.setString(2, employee.getEmployeeNo());
			
								
			if(employee.getImage()== null) {
				
				InputStream inputStream = null;
				
				stmt.setBinaryStream(3, inputStream);
				
			}
			
			else {
				
				
			try (InputStream inputStream = new ByteArrayInputStream(employee.getImage())){
					
					
				  stmt.setBinaryStream(3, inputStream);
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				
				
			}
			
			
			
			stmt.setInt(4, Integer.parseInt(employee.getEmployeetype()));
			
			/*stmt.setString(5, employee.getEmpinitials());*/
			stmt.setString(5, employee.getEmpfirstname());
			stmt.setString(6, employee.getEmplastname());
			stmt.setString(7, employee.getEmpfullname());
			stmt.setString(8, employee.getpAddress1());
			stmt.setString(9, employee.getpAddress2());
			stmt.setString(10, employee.getpAddress3());
			stmt.setString(11, employee.gettAddress1());
			stmt.setString(12, employee.gettAddress2());
			stmt.setString(13, employee.gettAddress3());
			stmt.setString(14, employee.getEmpmobile());
			stmt.setString(15, employee.getEmptp());
			stmt.setString(16, employee.getEmail());
			stmt.setInt(17, employee.getStatus());
			
			
			if(employee.getTerminatedate() != null) {
				
				
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(employee.getTerminatedate());
				
				java.sql.Date TerminationDate = new java.sql.Date(date.getTime());
				
				stmt.setDate(18, TerminationDate);
				
				
			}
			
			else {
				
				java.sql.Date TerminationDate = null;
				stmt.setDate(18, TerminationDate);
				
						
				
			}
			
			
			if(employee.getResigdate() != null) {
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(employee.getResigdate());
				
				java.sql.Date ResignationDate = new java.sql.Date(date.getTime());
				
				stmt.setDate(19, ResignationDate);
				
			}
			
			else {
				
				java.sql.Date ResignationDate = null;
				stmt.setDate(19, ResignationDate);
				
				
			}
			
						
			
            stmt.setBoolean(20, employee.isIsreportingoff());
			
			stmt.setString(21, employee.getRptoffid());
			
			stmt.setString(22, employee.getTemprptoff1());
			
			stmt.setString(23, employee.getAltoffid());
			
			stmt.setString(24, employee.getTemprptoff2());
			
			stmt.setString(25, employee.getEmpsex());
			
			stmt.setString(26, employee.getEmpMaritalStatus());
			
			/*stmt.setInt(28, employee.getShift().getShiftid());*/
			
			stmt.setString(27, employee.getDepartment().getDeptid());
			
			stmt.setString(28, employee.getDesignation().getDesigid());
			
			stmt.setString(29,employee.getKnownname());
			
			String tempPassword = employee.getPassword();
			AES_Service service = new AES_Service();
			
			String encryptedString = service.encrypt(tempPassword);
			
			
			/*String decryptedString = service.decrypt(encryptedString);
			System.out.println("Decrypted String: "+decryptedString);*/
			stmt.setString(30, employee.getUsername());
			
			stmt.setString(31, encryptedString);
						
			
			stmt.setString(32, employee.getRemarks());
			
			
			stmt.setString(33, employee.getEnteredby());
			
			/*stmt.setString(35, "Thivanka");*/ //UNDO for Initial config
			

			
			int state = stmt.executeUpdate();
			
			if(state == 1) {
				
				System.out.println("Employee is Created");
			}
			
			else {
				
				System.out.println("Employee Not Created");
				
			}

		} catch (Exception e) {
			
			e.printStackTrace();

		}

	}

	

	@Override
	public String getAllEmployee() {
		
		
		/*String sql = "SELECT * FROM tblMasEmployee ";*/
		
		String sql ="{call spGetAllEmployee}";  
		List<Employee> emplist = new ArrayList<>();
		String empliststring = null;
		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					
					if(rs.getBytes("blobimage")!= null) {
																
						
						byte[] imgByte= null;
						imgByte = rs.getBytes("blobimage");
						Base64 codec = new Base64();
						String encoded = codec.encodeBase64String(imgByte);
						/*System.out.println(encoded);*/
						
						
						Employee emp = new Employee(rs.getString("strUserCode"),rs.getString("strEmpFullName"),rs.getString("strEmpMobile"),new Department(rs.getString("strDeptName")),new Designation(rs.getString("strDesigName")),encoded,rs.getString("strRptOffName"),rs.getString("strKnownName"),rs.getString("strEmpLastName"));
						emplist.add(emp);
						
						
					}
					
					else {
						
						
						Employee emp = new Employee(rs.getString("strUserCode"),rs.getString("strEmpFullName"),rs.getString("strEmpMobile"),new Department(rs.getString("strDeptName")),new Designation(rs.getString("strDesigName")),"",rs.getString("strRptOffName"),rs.getString("strKnownName"),rs.getString("strEmpLastName"));
						emplist.add(emp);
						
						
					}
					
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		    Gson gson = new Gson();
			empliststring = gson.toJson(emplist);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
		return empliststring;
	}
	
	

	@Override
	public Employee getEmployeeById(String empid) {
		
		
		/*String sql = "SELECT * FROM tblMasEmployee WHERE strUserID = ?";*/
		
		String sql ="{call spGetEmployeeById(?)}";  
		
		Employee emp = new Employee();
		
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			stmt.setString(1, empid);
			
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				if(rs.next()) {
					
					emp.setEmployeeNo(rs.getString("strEmployeeCode"));
					/*emp.setEmpinitials(rs.getString("strEmpInitials"));*/
					emp.setEmpfirstname(rs.getString("strEmpFirstName"));
					emp.setEmplastname(rs.getString("strEmpLastName"));
					emp.setEmpfullname(rs.getString("strEmpFullName"));
					emp.setEmpmobile(rs.getString("strEmpMobile"));
					emp.setEmptp(rs.getString("strEmpTP"));
				    emp.setEmail(rs.getString("strEmail"));
					emp.setpAddress1(rs.getString("strPermanentAddress1"));
					emp.setpAddress2(rs.getString("strPermanentAddress2"));
					emp.setpAddress3(rs.getString("strPermanentAddress3"));
					emp.settAddress1(rs.getString("strTempAddress1"));
					emp.settAddress2(rs.getString("strTempAddress2"));
					emp.settAddress3(rs.getString("strTempAddress3"));
					emp.setKnownname(rs.getString("strKnownName"));
					emp.setUsername(rs.getString("strUserName"));
					emp.setRemarks(rs.getString("strRemarks"));
					
					if(rs.getString("strPassWord")!= null) {
						
						AES_Service service = new AES_Service();
						
						String encryptedString = rs.getString("strPassWord");
						
						String decryptedString = service.decrypt(encryptedString);
						
						emp.setPassword(decryptedString);
						
					}
					
					if(rs.getDate("dateDateofResig")!= null) {
						
											
						
						java.sql.Date ResignationDate= rs.getDate("dateDateofResig");				
						DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
						String resig = df.format(ResignationDate);  
						emp.setResigdate(resig);
						// Converting SQL date to String					
						
					}
					
					if(rs.getDate("dateDateofTerm")!= null) {
						
						java.sql.Date TerminationDate = rs.getDate("dateDateofTerm");				
						DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
						String termin = df.format(TerminationDate);  
						emp.setTerminatedate(termin);
											
						
					}
					
					emp.setRptoffid(rs.getString("strRptOffId"));
					emp.setTemprptoff1(rs.getString("strRptOffName"));
					emp.setAltoffid(rs.getString("strAltOffId"));
					emp.setTemprptoff2(rs.getString("strAltOffName"));
					
					/*Shift shift = new Shift();
					shift.setShiftid(rs.getInt("intShiftId"));
					shift.setDescription(rs.getString("strdescription"));
					emp.setShift(shift);*/
					
					Department dept = new Department();
					dept.setDeptid(rs.getString("strDeptCode"));
					dept.setDeptname(rs.getString("strDeptName"));
					emp.setDepartment(dept);
					
					Designation desig = new Designation();
					desig.setDesigid(rs.getString("strDesigCode"));
					desig.setDesigname(rs.getString("strDesigName"));
					emp.setDesignation(desig);
					
					
					
					emp.setEmpMaritalStatus(rs.getString("strMaritalStatus"));
					emp.setEmpsex(rs.getString("strSex"));
					emp.setEmployeetype(String.valueOf(rs.getInt("intEmpType")));
					
					emp.setStatus(rs.getInt("intStatus"));
					
					emp.setIsreportingoff(rs.getBoolean("BIsRptOff"));
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

							
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return emp;
	}

	
	@Override
	public void updateEmployeeById(Employee employee) {
		
		
		String sql ="{call spUpdateEmployeeMas(?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?)}";  			
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
					
			
			if(employee.getImage()== null) {
				
				InputStream inputStream = null;
				
				stmt.setBinaryStream(1, inputStream);
				
			}
			
			
			else {
				
				try(InputStream inputStream = new ByteArrayInputStream(employee.getImage())) {
										
					stmt.setBinaryStream(1, inputStream);
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				
			}
			
			
			
			stmt.setInt(2, Integer.parseInt(employee.getEmployeetype()));		
			/*stmt.setString(3, employee.getEmpinitials());*/
			stmt.setString(3, employee.getEmpfirstname());
			stmt.setString(4, employee.getEmplastname());
			stmt.setString(5, employee.getEmpfullname());
			stmt.setString(6, employee.getpAddress1());
			stmt.setString(7, employee.getpAddress2());
			stmt.setString(8, employee.getpAddress3());
			stmt.setString(9, employee.gettAddress1());
			stmt.setString(10, employee.gettAddress2());
			stmt.setString(11, employee.gettAddress3());
			stmt.setString(12, employee.getEmpmobile());
			stmt.setString(13, employee.getEmptp());
			stmt.setString(14, employee.getEmail());
			stmt.setInt(15, employee.getStatus());
			
			
			if(employee.getTerminatedate() != null) {
				
				
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(employee.getTerminatedate());
				
				java.sql.Date TerminationDate = new java.sql.Date(date.getTime());
				
				stmt.setDate(16, TerminationDate);
				
				
			}
			
			else {
				
				java.sql.Date TerminationDate = null;
				stmt.setDate(16, TerminationDate);
										
				
			}
			
			
			
			if(employee.getResigdate() != null) {
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(employee.getResigdate());
				
				java.sql.Date ResignationDate = new java.sql.Date(date.getTime());
				
				stmt.setDate(17, ResignationDate);
				
			}
			
			else {
				
				java.sql.Date ResignationDate = null;
				stmt.setDate(17, ResignationDate);
				
				
			}
			
								
			
	        stmt.setBoolean(18, employee.isIsreportingoff());
			
			stmt.setString(19, employee.getRptoffid());
			
			stmt.setString(20, employee.getTemprptoff1());
			
			stmt.setString(21, employee.getAltoffid());
			
			stmt.setString(22, employee.getTemprptoff2());
			
			stmt.setString(23, employee.getEmpsex());
			
			stmt.setString(24, employee.getEmpMaritalStatus());
			
			/*stmt.setInt(26, employee.getShift().getShiftid());*/
			
			stmt.setString(25, employee.getDepartment().getDeptid());
			
			stmt.setString(26, employee.getDesignation().getDesigid());
			
			stmt.setString(27,employee.getKnownname());
			
			
			String tempPassword = employee.getPassword();
			AES_Service service = new AES_Service();
			
			String encryptedString = service.encrypt(tempPassword);
			/*System.out.println("Encrypted String: "+encryptedString);*/
			
			/*String decryptedString = service.decrypt(encryptedString);
			System.out.println("Decrypted String: "+decryptedString);*/
			
			
			stmt.setString(28, employee.getUsername());
			
			stmt.setString(29, encryptedString);
						
			
			stmt.setString(30, employee.getRemarks());
			
			stmt.setString(31, employee.getUpdatedby());
			
			
			stmt.setString(32, employee.getEmployeeNo());
			
						
			
			int result = stmt.executeUpdate();
			
			if(result==1) {
				
				System.out.println("Record is Updated");
				
			}
			
			else {
				
				System.out.println("Record is Not Updated");
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	
	
	@Override
	public String getAllReportingOfficers(String name) {
		
		List <Employee> emplist = new ArrayList<>();
		/*String sql = "SELECT * FROM tblMasEmployee WHERE BIsRptOff = 1 ";  */
		String sql ="{call spIsReportingOfficer(?)}";  
		
		
		String reportinglist = null;
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {
			
			
			if(name==null) {
				
				stmt.setString(1, "");
				
			}
			
			else {
				
				stmt.setString(1, name);
				
			}
			
			
			try(ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					
					Employee emp = new Employee(rs.getString("strUserCode"),rs.getString("strEmpFullName"));
					emplist.add(emp);
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			Gson gson = new Gson();
			reportinglist = gson.toJson(emplist);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return reportinglist;
	}



	@Override
	public Employee authenticateUser(String username, String password) {
				
		AES_Service service = new AES_Service();
		String encryptedString = service.encrypt(password);
		
		String sql = "select * from tblMasEmployee where strUserName=? AND strPassWord=? AND intStatus = 1 ";
		Employee emp = new Employee();
		
		try(Connection con = DBUtil2.getInstance().getConnection();PreparedStatement stmt = con.prepareStatement(sql)) {
			
			
			stmt.setString(1, username);
			stmt.setString(2, encryptedString);
			
			try(ResultSet rs  = stmt.executeQuery()) {
				
				if(rs.next()) {
					
					emp.setUserid(rs.getString("strUserCode"));
					emp.setEmpfirstname(rs.getString("strEmpFirstName"));
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return emp;
	}



	@Override
	public void changePassword(String userid,String newPass) {
		
		
		AES_Service service = new AES_Service();
		String sql = "{call spChangePassword(?,?)}";
		
		try(Connection con = DBUtil2.getInstance().getConnection();CallableStatement stmt = con.prepareCall(sql)) {

			
		  stmt.setString(1, userid);
		  
		  stmt.setString(2, service.encrypt(newPass));
		  
		  int status = stmt.executeUpdate();
		  
		  if(status==1) {
			  
			  System.out.println("Password Changed");
		  }
		  
		  else {
			  
			  System.out.println("Password Not Changed");
		  }
		  
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
