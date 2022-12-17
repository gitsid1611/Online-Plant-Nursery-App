package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Customer;

@Repository
public interface CustomerInterface extends JpaRepository<Customer, Integer> {
	
	
	@Query("select e from Customer e where e.username = ?1 AND e.password=?2")
	public Customer validatecustomer(String name , String Pass);

}
