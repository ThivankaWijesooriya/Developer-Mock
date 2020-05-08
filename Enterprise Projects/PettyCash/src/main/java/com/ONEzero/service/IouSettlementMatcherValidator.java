package com.ONEzero.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.PropertyUtils;

public class IouSettlementMatcherValidator implements ConstraintValidator<IouSettlementMatcher, Object> {

	private String isSettlement;
	private String iouNo;
	private String error;
	

	@Override
	public void initialize(IouSettlementMatcher ioumatcher) {

		isSettlement = ioumatcher.first();
		iouNo = ioumatcher.second();
		error = ioumatcher.message();
	}

	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext ctx) {
		
		try {
			
			final Object status = PropertyUtils.getProperty(value, isSettlement);
            final Object iou = PropertyUtils.getProperty(value, iouNo);
            
            String stat = status.toString();
            /*ctx.disableDefaultConstraintViolation();*/
            
            if(stat.equalsIgnoreCase("true")&& iou == null )
            {
            	
            	
            	ctx.buildConstraintViolationWithTemplate(error).addPropertyNode(iouNo).addConstraintViolation();
            	
            	
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
