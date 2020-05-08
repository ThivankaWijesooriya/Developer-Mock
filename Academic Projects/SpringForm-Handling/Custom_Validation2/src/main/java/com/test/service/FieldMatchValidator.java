package com.test.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.PropertyUtils;


public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object>{

	 private String category;
	 private String location;
	 private String errormsg;
	
	@Override
    public void initialize(FieldMatch fm) {
	
		   this.category = fm.first();
		   this.location = fm.second();
		   this.errormsg = fm.message();
		
    }

	@Override
	public boolean isValid(final Object value,final ConstraintValidatorContext ctx) {
		
		try {
			
			final Object catObj = PropertyUtils.getProperty(value, this.category);
            final Object locObj = PropertyUtils.getProperty(value, this.location);
            
            if(catObj.equals("travel")&& locObj==null) {
            	
            	ctx.disableDefaultConstraintViolation();
            	/*ctx.buildConstraintViolationWithTemplate(errormsg).addNode(category).addConstraintViolation();*/
            	ctx.buildConstraintViolationWithTemplate(errormsg).addPropertyNode(category).addConstraintViolation();
            	return false;
            }
            
            else {
            	
            	return true;
            }
			
		} catch (Exception e) {
			
			return false;
		}
	}
	
	
	

}
