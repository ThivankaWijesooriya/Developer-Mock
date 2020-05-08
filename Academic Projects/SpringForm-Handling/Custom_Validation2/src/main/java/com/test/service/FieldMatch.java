package com.test.service;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=FieldMatchValidator.class)
public @interface FieldMatch {
	
	String message() default "Location Cannot Be Empty";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    String first();
    String second();
    
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        FieldMatch[] value();
    }

}
