package com.sid.hibernate.crud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sid.hibernate.entity.Mystudentjava;

public class Create {

	public static void main(String[] args) {
		
      SessionFactory sf= new Configuration().
    		  configure("hibernate.cfg.xml").
    		  addAnnotatedClass(Mystudentjava.class).buildSessionFactory();
      
      
     Session sobj = sf.getCurrentSession();
     
     try {
    	 
    	 Mystudentjava obj=new Mystudentjava("Siddique","Chengapara","iamcmsid@gmail.com");
    	 Mystudentjava obj1=new Mystudentjava("delna","mathew","delnam@gmail.com");
    	 Mystudentjava obj2=new Mystudentjava("Bincy","john","bj@gmail.com");
    	 Mystudentjava obj3=new Mystudentjava("anna","kamu","annakamu@gmail.com");
    	 sobj.beginTransaction();
    	 
    	 sobj.save(obj);
    	 sobj.save(obj1);
    	 sobj.save(obj2);
    	 sobj.save(obj3);
    	 System.out.println("the whole transaction has been completed ");
    	  Mystudentjava getobj=sobj.get(Mystudentjava.class,obj2.getRollno());
    	 sobj.save(getobj);
    	 
    	 sobj.getTransaction().commit();
    	System.out.println(getobj.getFirstname());
    	 
    	 
    	 
     }
     
     finally {
    	 sobj.close();
    	 sf.close();
     }
     
	}

}
