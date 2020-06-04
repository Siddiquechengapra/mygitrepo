package com.sid.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckingConstraintValidator 
implements ConstraintValidator<Mycustomvalidator,String>{
	
	private String prefix;
	
	

	
	@Override
	public void initialize(Mycustomvalidator mycvobj) {
		prefix=mycvobj.Value();
		
	}

	@Override
	public boolean isValid(String userinput, ConstraintValidatorContext C) {
		
		if (userinput.startsWith(prefix)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	

}
