package com.scp.hibernateDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Student {
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	int studId;
	String studName;
	int age;
	public Student(int studId, String studName, int age) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.age = age;
	}
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", studName=" + studName + ", age=" + age + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
