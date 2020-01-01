package com.onezero.model;

public class Statistics {
	
	
	private int totalaverage;
	private int totalneedattention;
	private int totalnoissues;
	
	public Statistics() {
		super();
	}

	public Statistics(int totalaverage, int totalneedattention, int totalnoissues) {
		super();
		this.totalaverage = totalaverage;
		this.totalneedattention = totalneedattention;
		this.totalnoissues = totalnoissues;
	}
	
	public int getTotalaverage() {
		return totalaverage;
	}
	public void setTotalaverage(int totalaverage) {
		this.totalaverage = totalaverage;
	}
	public int getTotalneedattention() {
		return totalneedattention;
	}
	public void setTotalneedattention(int totalneedattention) {
		this.totalneedattention = totalneedattention;
	}
	public int getTotalnoissues() {
		return totalnoissues;
	}
	public void setTotalnoissues(int totalnoissues) {
		this.totalnoissues = totalnoissues;
	}

	@Override
	public String toString() {
		return "Statistics [totalaverage=" + totalaverage + ", totalneedattention=" + totalneedattention
				+ ", totalnoissues=" + totalnoissues + "]";
	}

}
