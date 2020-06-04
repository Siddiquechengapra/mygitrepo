package com.sid.myselfpackage;


import javax.validation.constraints.Size;

import com.sid.customvalidation.Mycustomvalidator;

public class Try {
	@Mycustomvalidator(Value="CM", message="Doesnt contain CM")
	private String tryfname;
	@Size(min=1, max=10, message="Last name Should be of length minimum 1 & max 10")
	private String trylname;
	public String getTryfname() {
		return tryfname;
	}
	public void setTryfname(String tryfname) {
		this.tryfname = tryfname.strip();
	}
	public String getTrylname() {
		return trylname;
	}
	public void setTrylname(String trylname) {
		this.trylname = trylname.strip();
	}
	
	
	

}
