package com.test.service;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=CheckLocationValidation.class)
public @interface CheckLocation {
	
	String message() default "Category Cannot Be Empty";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
