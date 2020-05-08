package com.ONEzero.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Shift {
	
	private String strshiftid;

	
	private Integer shiftid;
	
	private String description;
	
	private int status;
	private String stringstate;
	private String remarks;
	private String enteredby;
	private Date entereddate;
	private String updatedby;
	private Date updateddate;
	private String deletedby;
	private Date deleteddate;
	

	public Shift() {};
	
	
	public Shift(Integer shiftid, String description, String stringstate, String remarks) {
		super();
		this.shiftid = shiftid;
		this.description = description;
		this.stringstate = stringstate;
		this.remarks = remarks;
	}
	
	
	public Shift(String shiftid, String description, String stringstate, String remarks) {
		super();
		this.strshiftid = shiftid;
		this.description = description;
		this.stringstate = stringstate;
		this.remarks = remarks;
	}
	
	public Shift(Integer shiftid,String description) {
		
		super();
		this.shiftid = shiftid;
		this.description = description;
		
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

	public Date getDeleteddate() {
		return deleteddate;
	}

	public void setDeleteddate(Date deleteddate) {
		this.deleteddate = deleteddate;
	}


	public Integer getShiftid() {
		return shiftid;
	}


	public void setShiftid(Integer shiftid) {
		this.shiftid = shiftid;
	}


	public String getStringstate() {
		return stringstate;
	}


	public void setStringstate(String stringstate) {
		this.stringstate = stringstate;
	}


	public String getStrshiftid() {
		return strshiftid;
	}


	public void setStrshiftid(String strshiftid) {
		this.strshiftid = strshiftid;
	}

}
