package com.test.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.PropertyUtils;


public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object>{

	 private String category;
	 private String to;
	 private String from;
	 private String errormsg;
	
	@Override
    public void initialize(FieldMatch fm) {
	
		   this.category = fm.first();
		   this.to = fm.second();
		   this.from = fm.third();
		   this.errormsg = fm.message();
		
    }

	@Override
	public boolean isValid(final Object value,final ConstraintValidatorContext ctx) {
		
		try {
			
			final Object catObj = PropertyUtils.getProperty(value, this.category);
                        final Object toObj = PropertyUtils.getProperty(value, this.to);
                        final Object fromObj = PropertyUtils.getProperty(value, this.from);
            
            /*ctx.disableDefaultConstraintViolation();*/
            
            /*If not using default validation annotation like @notnull , @size etc uncomment above disable command*/
            
            if(catObj.equals("Travelling")&& (toObj==null && fromObj == null)) {
            	  	
            	/*ctx.buildConstraintViolationWithTemplate(errormsg).addNode(category).addConstraintViolation();*/
            	
            	ctx.buildConstraintViolationWithTemplate(errormsg).addPropertyNode(to).addConstraintViolation();
            	ctx.buildConstraintViolationWithTemplate(errormsg).addPropertyNode(from).addConstraintViolation();
            	
            	return false;
            }
            
            else if(catObj.equals("Travelling")&& toObj==null) {
            	
            	ctx.buildConstraintViolationWithTemplate(errormsg).addPropertyNode(to).addConstraintViolation();
            	return false;
            }
            
            else if(catObj.equals("Travelling")&& fromObj==null) {
            	
            	ctx.buildConstraintViolationWithTemplate(errormsg).addPropertyNode(from).addConstraintViolation();
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
