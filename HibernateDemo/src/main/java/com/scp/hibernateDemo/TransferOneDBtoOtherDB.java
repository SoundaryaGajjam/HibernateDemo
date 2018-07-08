package com.scp.hibernateDemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TransferOneDBtoOtherDB {
	public static void main(String[] args) {
		SessionFactory SFOracle=new Configuration().configure("hibernate_Oracle.cfg.xml").buildSessionFactory();
		Session SOracle=SFOracle.openSession();
		Transaction tran1=SOracle.beginTransaction();
		
		SessionFactory SFMysql=new Configuration().configure("hibernate_Mysql.cfg.xml").buildSessionFactory();
		Session SMysql=SFMysql.openSession();
		Transaction tran2=SMysql.beginTransaction();
		
		SOracle.save(new Student(10, "Smith",20));
		SOracle.save(new Student(20, "John",30));
		SOracle.save(new Student(30, "Ashu",23));
		
		Student studOb1=(Student)SOracle.get(Student.class, 10);
		
		System.out.println("from Oracle ..."+studOb1);
		
		
		SMysql.save(studOb1);
		
		Student studOb2=(Student)SMysql.load(Student.class, 10);
		
		System.out.println("from Mysql ..."+studOb2);
		
		SOracle.flush();
		tran1.commit();
		SMysql.flush();
		tran2.commit();
		//SFMysql.close();
		//SFOracle.close();
		System.out.println(".......");
	}
}
