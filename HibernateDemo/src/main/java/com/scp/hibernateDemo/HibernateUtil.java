package com.scp.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sFactory=null;
	public static SessionFactory getSessionFactory(){
			if(sFactory==null)
					sFactory=new Configuration().configure("hibernate_Oracle.cfg.xml").buildSessionFactory();
		return sFactory;
		
	}
	public static void FlushNCommit(Session s,Transaction tr){
		if(s!=null)
			s.flush();
		if(tr!=null)
			tr.commit();
	}
}
