package com.scp.hibernateDemo;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateDemo {
	public static void main(String[] args) {
		SessionFactory sFactory=HibernateUtil.getSessionFactory();
		
		//Save & persist
		/*Session s1=sFactory.openSession();
		Transaction tr1=s1.beginTransaction();
		Student stud1=new Student(50, "ZZZ",40);//transistent
		s1.persist(stud1);//persistent
		HibernateUtil.FlushNCommit(s1, tr1);//detached
		
		Session s2=sFactory.openSession();
		Transaction tr2=s2.beginTransaction();
		
		s2.persist(stud1);
		HibernateUtil.FlushNCommit(s2, tr2);*/
		
		//getCurrentSession
		
		/*Session s1=sFactory.getCurrentSession();
		Transaction tr1=s1.beginTransaction();
		System.out.println("Before load");
		Student stud=s1.load(Student.class, 50);
		System.out.println("After load");
		System.out.println(stud);
		tr1.commit();
		
		//HibernateUtil.FlushNCommit(s1, tr1);
		
		Session s2=sFactory.getCurrentSession();
		Transaction tr2=s2.beginTransaction();
		s2.save(new Employee(101, "XXX", 50000));
		tr2.commit();
		System.out.println(s1==s2);
		
		*/
		
		//update & merge
		
		/*Session s1=sFactory.openSession();
		Transaction tr1=s1.beginTransaction();
		Student stud1=new Student(10, "AAA",20);//transitent
		Serializable ob=s1.save(stud1);//persistent
		
		//System.out.println(ob);
		HibernateUtil.FlushNCommit(s1, tr1);//detached
		stud1.studName="XXXX";//update name in memory not in db
		
		Session s2=sFactory.openSession();
		Transaction tr2=s2.beginTransaction();
		Student stud2=s2.get(Student.class,10);
		//System.out.println(stud2);
		//stud2.studName="YYYY";
		//Student obj=(Student) s2.merge(stud1);
		//System.out.println("After merger : "+obj);
		s2.update(stud1);//will fail bcoz--2 obj with same identifier
		
		HibernateUtil.FlushNCommit(s2, tr2);
		*/
		System.out.println("Hii");
		
		/*Transaction ttt=s2.getTransaction();
		System.out.println("TRANSACTION : "+ttt);
		Session sss=s2.getSession();
		System.out.println("SESSION : "+sss);
		SessionFactory sf=s2.getSessionFactory();
		System.out.println("SFACTORY : "+sf);*/
		
		//sFactory.close();
	}
}
//
//<property name="hbm2ddl.auto">create</property>