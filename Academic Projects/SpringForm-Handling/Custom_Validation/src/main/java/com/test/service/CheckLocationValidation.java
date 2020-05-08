package com.test.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckLocationValidation implements ConstraintValidator<CheckLocation, String>{

	@Override
    public void initialize(CheckLocation status) {
		
		status.message();
    }
	@Override
	public boolean isValid(String category,ConstraintValidatorContext ctx) {
		 
		return(category.equals("hello"));
	}
	

}
