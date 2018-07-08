package com.scp.hibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", salary=" + salary  + "]";
	}
	
}
