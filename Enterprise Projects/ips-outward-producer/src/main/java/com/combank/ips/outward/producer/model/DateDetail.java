package com.combank.ips.outward.producer.model;

public class DateDetail {

	private int date;
	private int time;
	private String timeStamp;

	public DateDetail() {
	}

	public DateDetail(int date, int time, String timeStamp) {
		super();
		this.date = date;
		this.time = time;
		this.timeStamp = timeStamp;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "DateDetail [date=" + date + ", time=" + time + ", timeStamp=" + timeStamp + "]";
	}

}
