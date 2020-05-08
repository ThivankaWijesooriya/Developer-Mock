package com.ONEzero.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.PropertyUtils;

public class TravelMatcherValidator implements ConstraintValidator<TravelMatcher, Object> {

	private String category;
	private String to;
	private String from;
	private String error;

	@Override
	public void initialize(TravelMatcher tm) {

		category = tm.first();
		to=tm.second();
		from=tm.third();
		error=tm.message();
	}

	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext ctx) {
		
		try {
			
			final Object catObj = PropertyUtils.getProperty(value, this.category);
            final Object toobj = PropertyUtils.getProperty(value, this.to);
            final Object fromobj = PropertyUtils.getProperty(value, this.from);
            
            
            /*ctx.disableDefaultConstraintViolation();*/
            
            if(catObj.equals("CAT00002")&&(toobj == null && fromobj == null ))
            {
            	
            	
            	ctx.buildConstraintViolationWithTemplate(error).addPropertyNode(to).addConstraintViolation();
            	ctx.buildConstraintViolationWithTemplate(error).addPropertyNode(from).addConstraintViolation();
            	
            	
            	return false;
            	
            }
            
            else if(catObj.equals("CAT00002") && toobj == null) {
            	
            	ctx.buildConstraintViolationWithTemplate(error).addPropertyNode(to).addConstraintViolation();
            	
            	return false;
            }
            
            else if(catObj.equals("CAT00002") && fromobj == null) {
            	
            	ctx.buildConstraintViolationWithTemplate(error).addPropertyNode(from).addConstraintViolation();
            	
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
