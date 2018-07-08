package com.scp.hibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="iPhone_Info")
@DiscriminatorValue(value="iPhone_Obj")
public class iPhone extends Mobile {
	String iphVar;

	public iPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public iPhone(String name, double price, int iMEINumber, String isBluetoothAvaliable, String iphVar) {
		super(name, price, iMEINumber, isBluetoothAvaliable);
		this.iphVar = iphVar;
	}

	

	public String getIphVar() {
		return iphVar;
	}

	public void setIphVar(String iphVar) {
		this.iphVar = iphVar;
	}
	
	@Override
	public String toString() {
		return "iPhone [iphVar=" + iphVar + ", name=" + name + ", price=" + price + ", IMEINumber=" + IMEINumber
				+ ", isBluetoothAvaliable=" + isBluetoothAvaliable + "]";
	}
	
}
