package com.letsdevlope.blog.ConnectionUtill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtill {
	private static final SessionFactory sf;
	private static final  Configuration cfg;
	static{
		  try {
		cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}catch (Throwable ex) {
        System.err.println("Initial SessionFactory creation failed." + ex);
        throw new ExceptionInInitializerError(ex);
    }
	}
	
	  public static Session openSession() {
	        return sf.openSession();
	    }
	

}
