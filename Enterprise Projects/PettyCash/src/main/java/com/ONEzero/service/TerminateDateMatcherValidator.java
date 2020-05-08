package com.ONEzero.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.PropertyUtils;

public class TerminateDateMatcherValidator implements ConstraintValidator<TerminateDateMatcher, Object> {

	private String status;
	private String TermDate;
	private String error;
	

	@Override
	public void initialize(TerminateDateMatcher trm) {

		status = trm.first();
		TermDate = trm.second();
		error = trm.message();
	}

	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext ctx) {
		
		try {
			
			final Object statusObj = PropertyUtils.getProperty(value, status);
            final Object termObj = PropertyUtils.getProperty(value, TermDate);
            
           
            /*ctx.disableDefaultConstraintViolation();*/
            
            String strStat = statusObj.toString();
            
            if(strStat.equalsIgnoreCase("3")&& termObj == null )
            {
            	
            	
            	ctx.buildConstraintViolationWithTemplate(error).addPropertyNode(TermDate).addConstraintViolation();
            	
            	
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
