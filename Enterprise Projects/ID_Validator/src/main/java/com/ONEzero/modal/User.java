package com.ONEzero.modal;

import javax.validation.constraints.NotNull;

public class User {
	
	@NotNull(message="ID Cannot Be Empty")
	private Long customerId;
	
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		
	}



}
