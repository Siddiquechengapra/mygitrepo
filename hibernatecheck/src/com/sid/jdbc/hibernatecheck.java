package com.sid.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class hibernatecheck {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user="hbstudent";
		String pass="hbstudent";
		try {
			
			Connection myconn=DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established ");
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
