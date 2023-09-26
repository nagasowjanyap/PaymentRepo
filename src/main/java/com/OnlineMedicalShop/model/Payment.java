package com.OnlineMedicalShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int paymentId;
	public String name;
	public String address;
	public long mobileNumber;
	public String paymentType;
	public int getId() {
		return paymentId;
	}
	public void setId(int id) {
		this.paymentId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobilenumber() {
		return mobileNumber;
	}
	public void setMobilenumber( long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentId + ", name=" + name + ", address=" + address + ", mobilenumber="
				+ mobileNumber + ", paymentType=" + paymentType + "]";
	}
	public Payment(String name, String address, long mobilenumber, float amount, String paymentType) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNumber = mobilenumber;
		this.paymentType = paymentType;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


   
}
