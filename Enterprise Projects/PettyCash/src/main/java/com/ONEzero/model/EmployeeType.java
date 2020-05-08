package com.ONEzero.model;

import java.util.Date;

public class EmployeeType {
	
	private String stremptypeid;
	private int emptypeid;
	private String description;
	private int status;
	private String Stringstatus;
	private String remarks;
	private String enteredby;
	private Date entereddate;
	private String updatedby;
	private Date updateddate;
	private String deletedby;
	private Date deleteddate;
	
	
	public EmployeeType(int emptypeid, String description) {
		super();
		this.emptypeid = emptypeid;
		this.description = description;
	}
	
	
	public int getEmptypeid() {
		return emptypeid;
	}
	public void setEmptypeid(int emptypeid) {
		this.emptypeid = emptypeid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getStringstatus() {
		return Stringstatus;
	}
	public void setStringstatus(String stringstatus) {
		Stringstatus = stringstatus;
	}
	public Date getDeleteddate() {
		return deleteddate;
	}
	public void setDeleteddate(Date deleteddate) {
		this.deleteddate = deleteddate;
	}
	public EmployeeType(int emptypeid, String description, String status, String remarks) {
		super();
		this.emptypeid = emptypeid;
		this.description = description;
		this.Stringstatus = status;
		this.remarks = remarks;
	}
	
	
	public EmployeeType(String emptypeid, String description, String status, String remarks) {
		super();
		this.stremptypeid = emptypeid;
		this.description = description;
		this.Stringstatus = status;
		this.remarks = remarks;
	}
	
	
	public EmployeeType() { }
	
	
	public String getStremptypeid() {
		return stremptypeid;
	}
	public void setStremptypeid(String stremptypeid) {
		this.stremptypeid = stremptypeid;
	};
		
	

}
