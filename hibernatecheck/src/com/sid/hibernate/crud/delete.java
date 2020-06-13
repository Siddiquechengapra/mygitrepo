package com.sid.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sid.hibernate.entity.Mystudentjava;


public class delete {

	public static void main(String[] args) {
		
      SessionFactory sf= new Configuration().
    		  configure("hibernate.cfg.xml").
    		  addAnnotatedClass(Mystudentjava.class).buildSessionFactory();
      
      
     Session sobj = sf.getCurrentSession();
     
     try {
    	 sobj.beginTransaction();
    
    	 sobj.createQuery("delete Mystudentjava where id='4'").executeUpdate();
    	 
    	 
    	 sobj.getTransaction().commit();
    	 } 
     
     finally {
    	 sobj.close();
    	 sf.close();
     }
     
     
	}
	
					
	 
 

}
