package com.scp.hibernateInheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;



@Entity
@Table(name="Mobile_Info")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.JOINED)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="which_type_of_obj")
@DiscriminatorValue(value="Mobile_Obj")
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int mId;
	String name;
	double price;
	int IMEINumber;
	String isBluetoothAvaliable;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mobile(String name, double price, int iMEINumber, String isBluetoothAvaliable) {
		super();
		this.name = name;
		this.price = price;
		IMEINumber = iMEINumber;
		this.isBluetoothAvaliable = isBluetoothAvaliable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIMEINumber() {
		return IMEINumber;
	}

	public void setIMEINumber(int iMEINumber) {
		IMEINumber = iMEINumber;
	}

	public String getIsBluetoothAvaliable() {
		return isBluetoothAvaliable;
	}

	public void setIsBluetoothAvaliable(String isBluetoothAvaliable) {
		this.isBluetoothAvaliable = isBluetoothAvaliable;
	}

	@Override
	public String toString() {
		return "\nMobile [name=" + name + ", price=" + price + ", IMEINumber=" + IMEINumber + ", isBluetoothAvaliable="
				+ isBluetoothAvaliable + "]";
	}
	
	
	
}
