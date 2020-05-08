package com.ONEzero.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Designation {
	
	@NotNull(message="Field Cannot be Empty")
	private String desigid;
	
	
	private String designame;
	private int status;
	private String Stringstatus;
	private String remarks;
	private String enteredby;
	private Date entereddate;
	private String updatedby;
	private Date updateddate;
	private String deletedby;
	private Date deleteddate;
	
	public Designation(String desigid, String designame) {
		super();
		this.desigid = desigid;
		this.designame = designame;
	}

	public Designation() {}

	public Designation(String desigid, String designame, String Stringstatus, String remarks) {
		super();
		this.desigid = desigid;
		this.designame = designame;
		this.Stringstatus = Stringstatus;
		this.remarks = remarks;
	}
	
	
	public Designation(String designame) {
		super();
		this.designame = designame;
		
	}

	public String getDesigid() {
		return desigid;
	}
	
	

	public void setDesigid(String desigid) {
		this.desigid = desigid;
	}

	public String getDesigname() {
		return designame;
	}

	public void setDesigname(String designame) {
		this.designame = designame;
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

	public String getStringstatus() {
		return Stringstatus;
	}

	public void setStringstatus(String stringstatus) {
		Stringstatus = stringstatus;
	}

	
	
	

}
