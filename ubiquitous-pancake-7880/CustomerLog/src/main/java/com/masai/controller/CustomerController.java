package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerEception;
import com.masai.model.Customer;
import com.masai.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService ci;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> AddCustomer(@RequestBody Customer cs) throws CustomerEception{
		
		Customer add = ci.AddCustomer(cs);
		
		return new ResponseEntity<Customer>(add,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> allcustomers()throws CustomerEception{
		
		List<Customer> find = ci.ViewAllCustomers();
		
		return new ResponseEntity<List<Customer>>(find,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> findbyid(@PathVariable("id") int id)throws CustomerEception{
		
		Customer byid = ci.ViewCustomer(id);
		
		return new ResponseEntity<Customer>(byid,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Customer> deletecutomer(@PathVariable("id") Customer cs)throws CustomerEception{
		
		Customer del = ci.DeleteCustomer(cs);
		
		return new  ResponseEntity<Customer>(del,HttpStatus.ACCEPTED);
		
		
	}
	
	@PutMapping("/customer")
	ResponseEntity<Customer> updatecus(  @RequestBody Customer cs   )throws CustomerEception{
	
		
		
		
		Customer upd = ci.UpdateCustomer(cs);
		
		return new ResponseEntity<Customer>(upd,HttpStatus.ACCEPTED);
		
		
	}
	
	 @GetMapping("/login")
	public ResponseEntity<Customer> validateCustomer(@RequestParam String name,@RequestParam String password)throws CustomerEception{
		
		Customer val = ci.ValidatCustomer(name, password);
		
		return new ResponseEntity<Customer>(val,HttpStatus.ACCEPTED);
		
		
	}
	

}
