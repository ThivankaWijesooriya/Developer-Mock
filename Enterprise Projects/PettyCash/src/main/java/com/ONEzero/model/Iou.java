package com.ONEzero.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.ONEzero.service.TravelMatcher;

@TravelMatcher(first="category",second="tolocation",third="fromlocation" , message="Field Cannot be Empty")
public class Iou {
	

private String iouno;

private String type;

private Employee employee;

@NotNull(message="Field Cannot be Empty")
private String category;

@NotNull(message="Field Cannot be Empty")
private String description;

@NotNull(message="Field Cannot be Empty")
private String ioudate;

private String tolocation;

private String fromlocation;

private String via;

@NotNull(message="Field Cannot be Empty")
private BigDecimal amount ;

private Boolean IsIouReturn;

/*@NotNull(message="Field Cannot be Empty")*/
private String remarks ;

private String comments;
private String ApprovalComments;
private String AuthorizeComments;

@NotNull(message="Field Cannot be Empty")
private String returnComments; // Iou return comments

private String ioustatus;

private String enteredby;
private Date entereddate;
private String updatedby;
private Date updateddate;
private String deletedby;
private Date deleteddate;
private String approvedby;
private Date approveddate;
private String authorizedby;
private Date authorizeddate;
private String rejectedby;
private Date rejecteddate;
private String returnedby;
private Date returneddate;

public Iou() {};

public Iou(String iouno,String type, String category, String description, BigDecimal amount, String remarks, String ioustatus) {
	super();
	this.iouno = iouno;
	this.type = type;
	this.category = category;
	this.description = description;
	this.amount = amount;
	this.remarks = remarks;
	this.ioustatus = ioustatus;
}


public Iou(String iouno, String ioudate, String enteredby, String category, String ioustatus, BigDecimal amount,String approvedBy) {

	this.iouno = iouno;
	this.ioudate = ioudate;
	this.enteredby = enteredby;
	this.category = category;
	this.ioustatus = ioustatus;
	this.amount = amount;
	this.approvedby = approvedBy;
	
}

public String getIouno() {
	return iouno;
}
public void setIouno(String iouno) {
	this.iouno = iouno;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public BigDecimal getAmount() {
	return amount;
}
public void setAmount(BigDecimal amount) {
	this.amount = amount;
}
public String getremarks() {
	return remarks;
}
public void setremarks(String remarks) {
	this.remarks = remarks;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}

public String getIoustatus() {
	return ioustatus;
}

public void setIoustatus(String ioustatus) {
	this.ioustatus = ioustatus;
}

public String getIoudate() {
	return ioudate;
}

public void setIoudate(String ioudate) {
	this.ioudate = ioudate;
}

public String getTolocation() {
	return tolocation;
}

public void setTolocation(String tolocation) {
	this.tolocation = tolocation;
}

public String getFromlocation() {
	return fromlocation;
}

public void setFromlocation(String fromlocation) {
	this.fromlocation = fromlocation;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

public String getEnteredby() {
	return enteredby;
}

public Date getEntereddate() {
	return entereddate;
}

public String getUpdatedby() {
	return updatedby;
}

public Date getUpdateddate() {
	return updateddate;
}

public String getDeletedby() {
	return deletedby;
}

public Date getDeleteddate() {
	return deleteddate;
}

public void setEnteredby(String enteredby) {
	this.enteredby = enteredby;
}

public void setEntereddate(Date entereddate) {
	this.entereddate = entereddate;
}

public void setUpdatedby(String updatedby) {
	this.updatedby = updatedby;
}

public void setUpdateddate(Date updateddate) {
	this.updateddate = updateddate;
}

public void setDeletedby(String deletedby) {
	this.deletedby = deletedby;
}

public void setDeleteddate(Date deleteddate) {
	this.deleteddate = deleteddate;
}

public String getApprovedby() {
	return approvedby;
}

public void setApprovedby(String approvedby) {
	this.approvedby = approvedby;
}

public Date getApproveddate() {
	return approveddate;
}

public void setApproveddate(Date approveddate) {
	this.approveddate = approveddate;
}

public String getAuthorizedby() {
	return authorizedby;
}

public void setAuthorizedby(String authorizedby) {
	this.authorizedby = authorizedby;
}

public Date getAuthorizeddate() {
	return authorizeddate;
}

public void setAuthorizeddate(Date authorizeddate) {
	this.authorizeddate = authorizeddate;
}

public String getRejectedby() {
	return rejectedby;
}

public void setRejectedby(String rejectedby) {
	this.rejectedby = rejectedby;
}

public Date getRejecteddate() {
	return rejecteddate;
}

public void setRejecteddate(Date rejecteddate) {
	this.rejecteddate = rejecteddate;
}

public String getVia() {
	return via;
}

public void setVia(String via) {
	this.via = via;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Boolean getIsIouReturn() {
	return IsIouReturn;
}

public void setIsIouReturn(Boolean isIouReturn) {
	IsIouReturn = isIouReturn;
}

public String getReturnComments() {
	return returnComments;
}

public void setReturnComments(String returnComments) {
	this.returnComments = returnComments;
}

public String getReturnedby() {
	return returnedby;
}

public void setReturnedby(String returnedby) {
	this.returnedby = returnedby;
}

public Date getReturneddate() {
	return returneddate;
}

public void setReturneddate(Date returneddate) {
	this.returneddate = returneddate;
}

public String getApprovalComments() {
	return ApprovalComments;
}

public void setApprovalComments(String approvalComments) {
	ApprovalComments = approvalComments;
}

public String getAuthorizeComments() {
	return AuthorizeComments;
}

public void setAuthorizeComments(String authorizeComments) {
	AuthorizeComments = authorizeComments;
}






}
