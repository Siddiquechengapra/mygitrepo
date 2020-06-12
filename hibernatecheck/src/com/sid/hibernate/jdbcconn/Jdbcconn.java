package com.sid.hibernate.jdbcconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbcconn {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String pass="hbstudent";
		
	try {	
	Connection myconn = DriverManager.getConnection(url, user, pass);
	System.out.println("Connection sucessfull");
	
	}
	catch(Exception exc) {
		exc.printStackTrace();
	}

}
}
