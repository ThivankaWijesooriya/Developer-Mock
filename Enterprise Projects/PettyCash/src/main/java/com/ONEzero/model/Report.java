package com.ONEzero.model;

import java.math.BigDecimal;
import java.util.Date;

public class Report {
	
	private String tid;
	private String paiddate;
	private String username;
	private String description;
	private String category;
	private Department department;
	private BigDecimal amount;
	private String TotalFloat;
	private String TotalUnsettledIou;
	
	public Report() {};
	
	public Report(String tid, String paiddate, String username, String description, String category,
			Department department, BigDecimal amount,String TotalFloat,String TotalUnsettledIou) {
		super();
		this.tid = tid;
		this.paiddate = paiddate;
		this.username = username;
		this.description = description;
		this.category = category;
		this.department = department;
		this.amount = amount;
		this.TotalFloat = TotalFloat;
		this.TotalUnsettledIou = TotalUnsettledIou;
	}
	
	
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getPaiddate() {
		return paiddate;
	}
	public void setPaiddate(String paiddate) {
		this.paiddate = paiddate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTotalFloat() {
		return TotalFloat;
	}

	public void setTotalFloat(String TotalFloat) {
		TotalFloat = TotalFloat;
	}

	public String getTotalUnsettledIou() {
		return TotalUnsettledIou;
	}

	public void setTotalUnsettledIou(String totalUnsettledIou) {
		TotalUnsettledIou = totalUnsettledIou;
	}
	
	

}
