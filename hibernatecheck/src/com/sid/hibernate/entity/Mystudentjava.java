package com.sid.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sqltable")
public class Mystudentjava{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rollno")
	String rollno;
	@Column(name="first_name")
	 String firstname;
	@Column(name="last_name")
     String lastname;
	@Column(name="email")
     String email;
//	@Override
//	public String toString() {
//		return "Mystudentjava [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
//				+ email + "]";
//	}





	public Mystudentjava() {
		
	}
	
	
   


	public Mystudentjava(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}


	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
