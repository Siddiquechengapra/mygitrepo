package com.sid.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sid.hibernate.entity.Mystudentjava;


public class Query {

	public static void main(String[] args) {
		
      SessionFactory sf= new Configuration().
    		  configure("hibernate.cfg.xml").
    		  addAnnotatedClass(Mystudentjava.class).buildSessionFactory();
      
      
     Session sobj = sf.getCurrentSession();
     
     try {
    	 sobj.beginTransaction();
    	 
    	 List<Mystudentjava> qobj=sobj.createQuery("from Mystudentjava where first_name='Siddique' or first_name='Delna' ").getResultList();
    	 System.out.println("done");
    	 Display(qobj);
    	 qobj=sobj.createQuery("from Mystudentjava where first_name='Delna' ").getResultList();
    	 System.out.println("done1");
    	 Display(qobj);
    	 qobj=sobj.createQuery("from Mystudentjava where rollno='4' ").getResultList();
    	 System.out.println("done2");
    	 Display(qobj);
    	 
    	 
    	 
    	 
    	 
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
