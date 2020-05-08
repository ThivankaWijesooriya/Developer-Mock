package com.ONEzero.model;


import java.util.Date;


import javax.validation.constraints.NotNull;

public class Department {
	
@NotNull(message="Field Cannot be Empty")	
private String deptid;


	
private String deptname;


private int status;

	
private String remarks;

private String stringstatus;

private String enteredby;
private Date entereddate;
private String updatedby;
private Date updateddate;
private String deletedby;
private Date deleteddate;


public Department() {}

public Department(String deptid, String deptname, String stringstatus, String remarks) {
	super();
	this.deptid = deptid;
	this.deptname = deptname;
	this.stringstatus = stringstatus;
	this.remarks = remarks;
}


public Department(String deptname) {
	
	super();
	this.deptname = deptname;
	
}



public Department(String deptid, String deptname) {
	super();
	this.deptid = deptid;
	this.deptname = deptname;
}

public String getDeptname() {
	return deptname;
}


public void setDeptname(String deptname) {
	this.deptname = deptname;
}


public int getStatus() {
	return status;
}


public void setStatus(int status) {
	this.status = status;
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

public String getDeptid() {
	return deptid;
}

public void setDeptid(String deptid) {
	this.deptid = deptid;
}

public String getStringstatus() {
	return stringstatus;
}

public void setStringstatus(String stringstatus) {
	this.stringstatus = stringstatus;
}













}
