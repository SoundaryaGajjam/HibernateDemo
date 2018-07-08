package com.scp.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmpNStudentDemo {
	public static void main(String[] args) {
		
		SessionFactory sFactory=HibernateUtil.getSessionFactory();
		Session s1=sFactory.openSession();
		Transaction tr1=s1.beginTransaction();
		//this tr1 is for inserting emp info into db
		s1.save(new Employee(101, "AAA", 50000));
		//aleardy created Employee table in db...
			
		//s1.flush();
		tr1.commit();
		
		Transaction tr2=s1.beginTransaction();
		//this tr2 is for retriving student info frm db ---
		System.out.println("Before get");
		Student st1=s1.get(Student.class,10);
		System.out.println("After get");
		tr2.commit();
		//s1.flush();
		System.out.println(st1);
		System.out.println("Hiiii");
		
		
	}
}
