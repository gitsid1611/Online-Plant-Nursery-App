package com.masai.service;

import com.masai.Dto.AdminDto;
import com.masai.Dto.CustomerDto;
import com.masai.exception.LoginException;
import com.masai.model.Admin;

public interface LoginService {

	public Admin ValidatAdmin(String name, String password)throws LoginException;
	
	public String loginAdmin(AdminDto admin) throws LoginException;
	
	public String logoutAdmin(String key) throws LoginException;
	
//	
//	public String loginCustomer(CustomerDto user) throws LoginException;
//	
//	public String logoutCustomer(String key) throws LoginException;
//	
}
