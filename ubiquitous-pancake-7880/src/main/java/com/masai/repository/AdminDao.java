package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {

	public Admin findByAdminUsername(String adminUsername);
	
	@Query("select e from Admin e where e.adminUsername = ?1 AND e.adminPassword=?2")
	public Admin validatecustomer(String name , String Pass);
}