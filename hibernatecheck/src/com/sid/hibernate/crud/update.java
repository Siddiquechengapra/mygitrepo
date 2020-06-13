package com.sid.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sid.hibernate.entity.Mystudentjava;


public class update {

	public static void main(String[] args) {
		
      SessionFactory sf= new Configuration().
    		  configure("hibernate.cfg.xml").
    		  addAnnotatedClass(Mystudentjava.class).buildSessionFactory();
      
      
     Session sobj = sf.getCurrentSession();
     
     try {
    	 sobj.beginTransaction();
    	 Mystudentjava classobj = sobj.get(Mystudentjava.class,"1");
    	 sobj.createQuery("update Mystudentjava set email='iamcmsid@gmail.com' ").executeUpdate();
    	 
    	 
    	 sobj.getTransaction().commit();
    	 } 
     
     finally {
    	 sobj.close();
    	 sf.close();
     }
     
     
	}
	public static void Display(List<Mystudentjava> obj) {
	 	for (Mystudentjava temp : obj) {
	 			System.out.println(temp);
					
	 	}
 

}
}
