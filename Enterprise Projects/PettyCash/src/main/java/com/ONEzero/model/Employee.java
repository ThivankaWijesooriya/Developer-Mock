package com.ONEzero.model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.springframework.web.multipart.MultipartFile;

import com.ONEzero.service.ResigDateMatcher;
import com.ONEzero.service.TerminateDateMatcher;



@ResigDateMatcher(first="status", second="resigdate", message="Field Cannot be Empty")
@TerminateDateMatcher(first="status",second="terminatedate",message="Field Cannot be Empty")
public class Employee {
	
	private int empid;
	
	
	private String userid;
	
    @NotNull(message="Field Cannot be Empty")
	private String employeeNo;
    
    private byte[] Image = null;
    
   
    private MultipartFile multiimage;
    
    @NotNull(message="Field Cannot be Empty")
    private String employeetype;
	
	
	@NotNull(message="Field Cannot be Empty")
	private String empfirstname;
	
	@NotNull(message="Field Cannot be Empty")
	private String emplastname;
	
	@NotNull(message="Field Cannot be Empty")
	private String empfullname;
	
	
	@NotNull(message="Field Cannot be Empty")
	private String empsex;
	
	
   @NotNull(message="Field Cannot be Empty")
	private String empMaritalStatus;
	
	/*@NotNull(message="Field Cannot be Empty")*/
	private String empmobile;
	
	/*@NotNull(message="Field Cannot be Empty")*/
	private String emptp;
	
	@NotNull(message="Field Cannot be Empty")
	@Email
	private String email;
	
	@Valid
    private Department department;
    
	@Valid
    private Designation designation;
	
    
	@NotNull(message="Field Cannot be Empty")
    private String pAddress1;
	
	@NotNull(message="Field Cannot be Empty")
    private String pAddress2;
	
    /*@NotNull(message="Field Cannot be Empty")*/
    private String pAddress3;
	
	/*@NotNull(message="Field Cannot be Empty")*/
    private String tAddress1;
	
	/*@NotNull(message="Field Cannot be Empty")*/
    private String tAddress2;
	
	/*@NotNull(message="Field Cannot be Empty")*/
    private String tAddress3;
    
    private boolean isreportingoff = false;
    
    @NotNull(message="Field Cannot be Empty")
    private String rptoffid;
    
    /*@NotNull(message="Field Cannot be Empty")*/
    private String altoffid;
	
    @NotNull(message="Field Cannot be Empty")
	private Integer status;
	
   /* @NotNull(message="Field Cannot be Empty")*/
    private String resigdate=null; // Hide
    
    /*@NotNull(message="Field Cannot be Empty")*/
    private String terminatedate=null; // Hide
    
    @NotNull(message="Field Cannot be Empty")
    private String knownname;
    
    @NotNull(message="Field Cannot be Empty")
    private String Username;
    
    @NotNull(message="Field Cannot be Empty")
    private String Password;
    
    
    /*@NotNull(message="Field Cannot be Empty")*/
    
    private String remarks;
    
    private String Imgbase64;
    
    
    
    /* used to temporary store string values of shift,dept,rptoff*/
    
    private String tempdesigname;
    
    private String tempdeptname;
    
    private String tempshiftname;
    
    private String temprptoff1;
    
    private String temprptoff2;
   
   /* used to temporary store string values of shift,dept,rptoff*/
    
    private List<Pages> pagelist = new ArrayList<>();

	private String enteredby;
	

	private Date entereddate;
	

	private String updatedby;
	

	private Date updateddate;
	
	private String deletedby;
	
	private Date deleteddate;
	



	public Employee() {}


	public Employee(String userid, String empfullname, String empmobile, Department department, Designation designation,
			 String imgbase64,String temprptoff1,String knownname,String lastname) {
		
		this.Imgbase64 = imgbase64;
		this.userid = userid;
		this.empfullname = empfullname;
		this.empmobile = empmobile;
		this.department = department;
		this.designation = designation;
		this.temprptoff1 = temprptoff1;
		this.knownname = knownname;
		this.emplastname = lastname;
		
		
	}


    public Employee(String userid,String empfullname) {
		
		this.userid = userid;
		this.empfullname = empfullname;
		
	}
	
	public Employee(String imgbase) {
		
		
		this.Imgbase64 = imgbase;
		
	}
	
		

	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpfirstname() {
		return empfirstname;
	}



	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}



	public String getEmplastname() {
		return emplastname;
	}



	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}



	public String getEmpfullname() {
		return empfullname;
	}



	public void setEmpfullname(String empfullname) {
		this.empfullname = empfullname;
	}



	public String getEmpmobile() {
		return empmobile;
	}



	public void setEmpmobile(String empmobile) {
		this.empmobile = empmobile;
	}



	public String getEmptp() {
		return emptp;
	}



	public void setEmptp(String emptp) {
		this.emptp = emptp;
	}



	public String getImgbase64() {
		return Imgbase64;
	}


	public void setImgbase64(String imgbase64) {
		Imgbase64 = imgbase64;
	}


	public String getEmail() {
		return email;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public Designation getDesignation() {
		return designation;
	}



	public void setDesignation(Designation designation) {
		this.designation = designation;
	}



	public String getpAddress1() {
		return pAddress1;
	}



	public void setpAddress1(String pAddress1) {
		this.pAddress1 = pAddress1;
	}



	public String getpAddress2() {
		return pAddress2;
	}



	public void setpAddress2(String pAddress2) {
		this.pAddress2 = pAddress2;
	}



	public String getpAddress3() {
		return pAddress3;
	}



	public void setpAddress3(String pAddress3) {
		this.pAddress3 = pAddress3;
	}



	public String gettAddress1() {
		return tAddress1;
	}



	public void settAddress1(String tAddress1) {
		this.tAddress1 = tAddress1;
	}



	public String gettAddress2() {
		return tAddress2;
	}



	public void settAddress2(String tAddress2) {
		this.tAddress2 = tAddress2;
	}



	public String gettAddress3() {
		return tAddress3;
	}



	public void settAddress3(String tAddress3) {
		this.tAddress3 = tAddress3;
	}



	public boolean isIsreportingoff() {
		return isreportingoff;
	}



	public void setIsreportingoff(boolean isreportingoff) {
		this.isreportingoff = isreportingoff;
	}




	public String getAltoffid() {
		return altoffid;
	}



	public void setAltoffid(String altoffid) {
		this.altoffid = altoffid;
	}




	public String getRemarks() {
		return remarks;
	}



	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	public String getEnteredby() {
		return enteredby;
	}



	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}



	public Date getEntereddate() {
		return entereddate;
	}



	public void setEntereddate(Date entereddate) {
		this.entereddate = entereddate;
	}



	public String getUpdatedby() {
		return updatedby;
	}



	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}



	public Date getUpdateddate() {
		return updateddate;
	}



	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}



	public String getDeletedby() {
		return deletedby;
	}



	public void setDeletedby(String deletedby) {
		this.deletedby = deletedby;
	}



	public Date getDeleteddate() {
		return deleteddate;
	}



	public void setDeleteddate(Date deleteddate) {
		this.deleteddate = deleteddate;
	}


	public String getEmpsex() {
		return empsex;
	}



	public String getEmpMaritalStatus() {
		return empMaritalStatus;
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public void setEmpMaritalStatus(String empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}



	public void setEmpsex(String empsex) {
		this.empsex = empsex;
	}



	public String getEmployeetype() {
		return employeetype;
	}



	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}



	public String getResigdate() {
		return resigdate;
	}



	public void setResigdate(String resigdate) {
		
		
		this.resigdate = resigdate;
		
		
	}



	public byte[] getImage() {
		return Image;
	}



	public void setImage(byte[] image) {
		Image = image;
	}




	public String getRptoffid() {
		return rptoffid;
	}



	public void setRptoffid(String rptoffid) {
		this.rptoffid = rptoffid;
	}



	public String getEmployeeNo() {
		return employeeNo;
	}



	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}



	public String getTerminatedate() {
		return terminatedate;
	}



	public void setTerminatedate(String terminatedate) {
		this.terminatedate = terminatedate;
	}



	public String getKnownname() {
		return knownname;
	}



	public void setKnownname(String knownname) {
		this.knownname = knownname;
	}



	public MultipartFile getMultiimage() {
		return multiimage;
	}



	public void setMultiimage(MultipartFile multiimage) {
		this.multiimage = multiimage;
	}


	public String getTempdesigname() {
		return tempdesigname;
	}


	public void setTempdesigname(String tempdesigname) {
		this.tempdesigname = tempdesigname;
	}


	public String getTempdeptname() {
		return tempdeptname;
	}


	public void setTempdeptname(String tempdeptname) {
		this.tempdeptname = tempdeptname;
	}


	public String getTempshiftname() {
		return tempshiftname;
	}


	public void setTempshiftname(String tempshiftname) {
		this.tempshiftname = tempshiftname;
	}


	public String getTemprptoff1() {
		return temprptoff1;
	}


	public void setTemprptoff1(String temprptoff1) {
		this.temprptoff1 = temprptoff1;
	}


	public String getTemprptoff2() {
		return temprptoff2;
	}


	public void setTemprptoff2(String temprptoff2) {
		this.temprptoff2 = temprptoff2;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public List<Pages> getPagelist() {
		return pagelist;
	}


	public void setPagelist(List<Pages> pagelist) {
		this.pagelist = pagelist;
	}





}
