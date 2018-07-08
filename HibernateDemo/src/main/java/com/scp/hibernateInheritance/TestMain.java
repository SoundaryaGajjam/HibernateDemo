package com.scp.hibernateInheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.scp.hibernateDemo.HibernateUtil;

public class TestMain {
	public static void main(String[] args) {
		Mobile m1=new Mobile("MName", 18000, 1111, null);
		Mobile m2=new iPhone("iPhone", 80000, 2222, null, "iphVar");
		Mobile m3=new Samsung("Samsung", 25000, 3333, "Yes", "samsungVar");
		//Mobile m4=new iPhone("iPhone", 85000, 2222, "No", "iphVar2");
		Session session1=HibernateUtil.getSessionFactory().openSession();
		Transaction tr1=session1.beginTransaction();
		session1.save(m1);
		session1.save(m2);
		session1.save(m3);
		//session1.save(m4);
		HibernateUtil.FlushNCommit(session1, tr1);
		System.out.println("Hiiiii");
	}
}
