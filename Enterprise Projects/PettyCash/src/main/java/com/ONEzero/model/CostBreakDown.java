package com.ONEzero.model;

import java.math.BigDecimal;

public class CostBreakDown {
	
	
	private String catname;
	private BigDecimal supportcost;
	private BigDecimal softwarecost;
	private BigDecimal admincost;
	
	public CostBreakDown() {};
	
	public CostBreakDown(String catname, BigDecimal supportcost, BigDecimal softwarecost, BigDecimal admincost) {
		super();
		this.catname = catname;
		this.supportcost = supportcost;
		this.softwarecost = softwarecost;
		this.admincost = admincost;
	}
	
	
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public BigDecimal getSupportcost() {
		return supportcost;
	}
	public void setSupportcost(BigDecimal supportcost) {
		this.supportcost = supportcost;
	}
	public BigDecimal getSoftwarecost() {
		return softwarecost;
	}
	public void setSoftwarecost(BigDecimal softwarecost) {
		this.softwarecost = softwarecost;
	}
	public BigDecimal getAdmincost() {
		return admincost;
	}
	public void setAdmincost(BigDecimal admincost) {
		this.admincost = admincost;
	}
	

}
