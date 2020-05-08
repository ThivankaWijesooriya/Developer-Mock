package com.ONEzero.model;

import java.math.BigDecimal;

public class SummaryReport {
	
	private BigDecimal total;
	private String deptname;
	private String catname;
	
	
	public SummaryReport(BigDecimal total, String deptname, String catname) {
		super();
		this.total = total;
		this.deptname = deptname;
		this.catname = catname;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}

}
