package com.masai.service;

import java.util.List;

import com.masai.exception.CustomerEception;
import com.masai.model.Customer;

public interface CustomerService {
	
	public Customer AddCustomer(Customer cs) throws CustomerEception;
	public Customer UpdateCustomer(Customer cs) throws CustomerEception;
	public Customer DeleteCustomer(Customer cs)throws CustomerEception;
	public Customer ViewCustomer(int cs) throws CustomerEception;
	public List<Customer> ViewAllCustomers() throws CustomerEception;
	public Customer ValidatCustomer(String name, String password)throws CustomerEception;
	

}
