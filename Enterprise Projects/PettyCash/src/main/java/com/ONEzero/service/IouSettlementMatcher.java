package com.ONEzero.service;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=IouSettlementMatcherValidator.class)
public @interface IouSettlementMatcher {
	
	
	String message() default "Field Cannot be Empty";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    
    String first();
    String second();
   
    
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
    	IouSettlementMatcher[] value();
    }
    

}
