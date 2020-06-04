package com.sid.myselfpackage;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	public Student() {
		countryOptions.put("BR", "Britain");
		countryOptions.put("IN","India");
		countryOptions.put("GR", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("JN", "Japan");
		countryOptions.put("CN", "China");
		
		
		
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private LinkedHashMap<String,String> countryOptions = new LinkedHashMap<String, String>();
	
	private String country;
	@NotNull(message="Dont leave the field blank")
	private String entefirstname;
	
	
	@Size(min=5, max=10,message = "Is needed ")
	private String entelastname;
	private String entecourse;
	private String[] entecourses;
	
	
	
	
	public String getEntecourse() {
		return entecourse;
	}
	public void setEntecourse(String entecourse) {
		this.entecourse = entecourse.toUpperCase();
	}
	
	public String[] getEntecourses() {
		return entecourses;
	}
	public void setEntecourses(String[] entecourses) {
		this.entecourses = entecourses;
	}
	public String getEntefirstname() {
		
		return entefirstname;
	}
	public void setEntefirstname(String entefirstname) {
		this.entefirstname = entefirstname.toUpperCase();
	}
	public String getEntelastname() {
		return entelastname;
	}
	public void setEntelastname(String entelastname) {
		this.entelastname = entelastname.toUpperCase();
	}
	
	
	

}
