package com.sid.customvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CheckingConstraintValidator.class)
@Target({ElementType.METHOD , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Mycustomvalidator {
	
	public String Value() default "Sid";
	public String message() default "Doesnt contain Sid ";
	
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};
	
	
	

}
