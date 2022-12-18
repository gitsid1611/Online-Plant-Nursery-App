package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Admin;
import com.masai.model.CurrentUserSession;

public interface CurrentUserSessionDao extends JpaRepository<CurrentUserSession, Integer>{
	
	public Optional<CurrentUserSession>findByuuid(String uuid);
	
	public CurrentUserSession findByUuid(String uuid);
	

}
