package com.test.model;


import javax.validation.constraints.NotNull;

import com.test.service.FieldMatch;

@FieldMatch(first="category" , second="to" ,third="from", message="Field Cannot Be Empty")
public class Student {

	@NotNull(message="Field Cannot be Empty")
	private String category;
	private String to;
	private String from;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
}
