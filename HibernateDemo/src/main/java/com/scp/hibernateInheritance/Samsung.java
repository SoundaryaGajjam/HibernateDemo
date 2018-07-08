package com.scp.hibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Samsung_Info")
@DiscriminatorValue(value="Samsung_Obj")
public class Samsung extends Mobile{
	String samsungVar;

	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Samsung(String name, double price, int iMEINumber, String isBluetoothAvaliable, String samsungVar) {
		super(name, price, iMEINumber, isBluetoothAvaliable);
		this.samsungVar = samsungVar;
	}



	public String getSamsungVar() {
		return samsungVar;
	}



	public void setSamsungVar(String samsungVar) {
		this.samsungVar = samsungVar;
	}



	@Override
	public String toString() {
		return "\nSamsung [samsungVar=" + samsungVar + ", name=" + name + ", price=" + price + ", IMEINumber="
				+ IMEINumber + ", isBluetoothAvaliable=" + isBluetoothAvaliable + "]";
	}
	
	
	
}
