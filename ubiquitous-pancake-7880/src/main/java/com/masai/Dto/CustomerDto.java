package com.masai.Dto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CustomerDto {

	private String userName;
	private String password;

	
	public CustomerDto() {
		// TODO Auto-generated constructor stub
	}


	public CustomerDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "CustomerDto [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
