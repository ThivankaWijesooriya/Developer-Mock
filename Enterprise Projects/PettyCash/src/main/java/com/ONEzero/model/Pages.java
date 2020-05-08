package com.ONEzero.model;

import java.util.ArrayList;
import java.util.List;

public class Pages {
	
	private int pageid;
	private String pagename;
	private int pagelist[];
	private Employee emp;
	
	
	public Pages() {};
	
	public Pages(int pageid, String pagename) {
		super();
		this.pageid = pageid;
		this.pagename = pagename;
	}
	
	
	public int getPageid() {
		return pageid;
	}
	public void setPageid(int pageid) {
		this.pageid = pageid;
	}
	public String getPagename() {
		return pagename;
	}
	public void setPagename(String pagename) {
		this.pagename = pagename;
	}

	public int[] getPagelist() {
		return pagelist;
	}

	public void setPagelist(int[] pagelist) {
		this.pagelist = pagelist;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}



}
