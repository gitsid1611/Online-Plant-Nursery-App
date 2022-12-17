package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	private String customer_name;
	private String username;
	private String password;
	private String address;
	private String city;
	private int pincode;
	public Customer() {
		super();
	}
	public Customer(int customerid, String customer_name, String username, String password, String address, String city,
			int pincode) {
		super();
		this.customerid = customerid;
		this.customer_name = customer_name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customer_name=" + customer_name + ", username=" + username
				+ ", password=" + password + ", address=" + address + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
