package com.ONEzero.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.ONEzero.service.IouSettlementMatcher;
import com.ONEzero.service.TravelMatcher;


@TravelMatcher(first="category",second="tolocation",third="fromlocation" , message="Field Cannot be Empty")
@IouSettlementMatcher(first="isiousettlement",second="settlediouno",message="Field Cannot be Empty")
public class Voucher {
	
	
	private String voucherno;

	private Employee employee;
	
	private String type;

	@NotNull(message="Field Cannot be Empty")
	private String category;

	@NotNull(message="Field Cannot be Empty")
	private String description;

	@NotNull(message="Field Cannot be Empty")
	private String voucherdate;
	
	private String IouBeforeSettle;
	
	private boolean isiousettlement = false;
	
	/*@NotNull(message="Field Cannot be Empty")*/
	private String settlediouno;

	/*@NotNull(message="Field Cannot be Empty")*/
	private String tolocation;

	/*@NotNull(message="Field Cannot be Empty")*/
	private String fromlocation;

	/*@NotNull(message="Field Cannot be Empty")*/
	private String via;

	@NotNull(message="Field Cannot be Empty")
	private BigDecimal amount ;

    private String tempamount;
    
	/*@NotNull(message="Field Cannot be Empty")*/
	private String remarks ;

	private String comments;
	private String appcomments;
	private String authcomments;

	private String voucherstatus;

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
	
	
	public Voucher() {};
	
	
	public Voucher(String voucherno,String type, String category, String description, BigDecimal amount, String voucherstatus) {
		super();
		this.voucherno = voucherno;
		this.type = type;
		this.category = category;
		this.description = description;
		this.amount = amount;
		this.voucherstatus = voucherstatus;
	}
	
	
	public Voucher(String voucherno,String type ,String category, String description, String amount, String voucherstatus) {
		super();
		this.voucherno = voucherno;
		this.type = type;
		this.category = category;
		this.description = description;
		this.tempamount = amount;
		this.voucherstatus = voucherstatus;
	}


	public Voucher(String voucherno,String voucherdate, String enteredby ,String category, String voucherstatus, BigDecimal amount,String approvedby,String iouno,String ioubeforesettle) {
		super();
		this.voucherno = voucherno;
		this.voucherdate = voucherdate;
		this.enteredby = enteredby;
		this.category = category;
		this.voucherstatus = voucherstatus;
		this.amount = amount;
		this.approvedby = approvedby;
		this.settlediouno = iouno;
		this.IouBeforeSettle = ioubeforesettle;
		
	}


	


	public Voucher(String voucherno, String type, String category, String description, BigDecimal amount, String voucherstatus,
			String enteredby, String voucherdate) {
		
		this.voucherno = voucherno;
		this.type = type;
		this.category = category;
		this.description = description;
		this.amount = amount;
		this.voucherstatus = voucherstatus;
		this.enteredby = enteredby;
		this.voucherdate = voucherdate;
		
		
	}
	
	public Voucher(String voucherno, String type, String category, String description, BigDecimal amount, String voucherstatus,
			String enteredby, String voucherdate,String iouno,String approvedby,String iousettle) {
		
		this.voucherno = voucherno;
		this.type = type;
		this.category = category;
		this.description = description;
		this.amount = amount;
		this.voucherstatus = voucherstatus;
		this.enteredby = enteredby;
		this.voucherdate = voucherdate;
		this.settlediouno = iouno;
		this.approvedby = approvedby;
		this.IouBeforeSettle = iousettle;
		
		
	}


	


	public String getVoucherno() {
		return voucherno;
	}
	public void setVoucherno(String voucherno) {
		this.voucherno = voucherno;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
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
	public String getVoucherdate() {
		return voucherdate;
	}
	public void setVoucherdate(String voucherdate) {
		this.voucherdate = voucherdate;
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
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getVoucherstatus() {
		return voucherstatus;
	}
	public void setVoucherstatus(String voucherstatus) {
		this.voucherstatus = voucherstatus;
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
	public boolean isIsiousettlement() {
		return isiousettlement;
	}
	public void setIsiousettlement(boolean isiousettlement) {
		this.isiousettlement = isiousettlement;
	}
	public String getSettlediouno() {
		return settlediouno;
	}
	public void setSettlediouno(String settlediouno) {
		this.settlediouno = settlediouno;
	}


	public String getTempamount() {
		return tempamount;
	}


	public void setTempamount(String tempamount) {
		this.tempamount = tempamount;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getAppcomments() {
		return appcomments;
	}


	public void setAppcomments(String appcomments) {
		this.appcomments = appcomments;
	}


	public String getAuthcomments() {
		return authcomments;
	}


	public void setAuthcomments(String authcomments) {
		this.authcomments = authcomments;
	}


	public String getIouBeforeSettle() {
		return IouBeforeSettle;
	}


	public void setIouBeforeSettle(String iouBeforeSettle) {
		IouBeforeSettle = iouBeforeSettle;
	}
	

}
