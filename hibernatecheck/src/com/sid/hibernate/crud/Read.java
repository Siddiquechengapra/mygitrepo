package com.sid.hibernate.crud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sid.hibernate.entity.Mystudentjava;

public class Read {

	public static void main(String[] args) {
		
      SessionFactory sf= new Configuration().
    		  configure("hibernate.cfg.xml").
    		  addAnnotatedClass(Mystudentjava.class).buildSessionFactory();
      
      
     Session sobj = sf.getCurrentSession();
     
     try {
    	 sobj.beginTransaction();
    	 
    	 
    	 Mystudentjava obj1=sobj.get(Mystudentjava.class,"4");
    	 sobj.save(obj1);
    	 
    	 sobj.getTransaction().commit();
    	 System.out.println("the read method has been completed ");
    	 System.out.println("the name is "+ obj1.getFirstname() );
    	
     }
     
     finally {
    	 sobj.close();
    	 sf.close();
     }
     
	}

}
