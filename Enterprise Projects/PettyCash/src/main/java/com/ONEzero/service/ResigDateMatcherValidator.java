package com.ONEzero.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.PropertyUtils;

public class ResigDateMatcherValidator implements ConstraintValidator<ResigDateMatcher, Object> {

	private String status;
	private String resigDate;
	private String error;
	

	@Override
	public void initialize(ResigDateMatcher rsd) {

		status = rsd.first();
		resigDate = rsd.second();
		error = rsd.message();
	}

	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext ctx) {
		
		try {
			
			final Object statusObj = PropertyUtils.getProperty(value, status);
            final Object resigObj = PropertyUtils.getProperty(value, resigDate);
            
           
            /*ctx.disableDefaultConstraintViolation();*/
            
            String strStat = statusObj.toString();
            
            if(strStat.equalsIgnoreCase("2")&& resigObj == null )
            {
            	
            	
            	ctx.buildConstraintViolationWithTemplate(error).addPropertyNode(resigDate).addConstraintViolation();
            	
            	
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
