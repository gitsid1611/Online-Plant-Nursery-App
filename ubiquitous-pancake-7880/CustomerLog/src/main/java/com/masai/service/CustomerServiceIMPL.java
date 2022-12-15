package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerEception;
import com.masai.model.Customer;
import com.masai.repository.CustomerInterface;
@Service
public class CustomerServiceIMPL implements CustomerService {
	@Autowired
	private CustomerInterface ci;

	@Override
	public Customer AddCustomer(Customer cs) throws CustomerEception {
		// TODO Auto-generated method stub
		
		Customer com = ci.save(cs);
		
		if(cs.getCustomer_name().isEmpty()) {
			throw new CustomerEception("Please Fill All Data");
		}
		else {
			return cs;
		}
		
		
		
	}

	@Override
	public Customer UpdateCustomer(Customer cs) throws CustomerEception {
		// TODO Auto-generated method stub
		
		Optional<Customer> up = ci.findById(cs.getCustomerid());
		
		if(up.isPresent()) {
			ci.save(cs);
		}
		else {
			throw new CustomerEception("Id Not Found For Update");
		}
		return up.get();
		
	
	}

	@Override
	public Customer DeleteCustomer(Customer cs) throws CustomerEception {
		// TODO Auto-generated method stub
		
Optional<Customer> del = ci.findById(cs.getCustomerid());
		
		if(del.isPresent()) {
		 ci.delete(cs);
		}
		else {
			throw new CustomerEception("Id not Found");
		}
		return del.get();
		
	}

	@Override
	public Customer ViewCustomer(int cs) throws CustomerEception {
		// TODO Auto-generated method stub
		
		Optional<Customer> id = ci.findById(cs);
		
		if(id.isEmpty()) {
			throw new CustomerEception("Id Was In-Correct");
		}
		else {
			return id.get() ;
			
		}
		
		
		
	}

	@Override
	public List<Customer> ViewAllCustomers() throws CustomerEception {
		
		List<Customer> allcus = ci.findAll();
		
		if(allcus.isEmpty()) {
			throw new CustomerEception("No Customer In The Detabase");
		}
		else {
			return allcus;
		}
		
		
	}

	@Override
	public Customer ValidatCustomer(String name, String password) throws CustomerEception {
		// TODO Auto-generated method stub
		
		Customer val = ci.validatecustomer(name, password);
		
	
		
		if(val== null) {
			throw new CustomerEception("Invalid Data");
		}
		else {
	
			return val;
		}
	
	}

}
