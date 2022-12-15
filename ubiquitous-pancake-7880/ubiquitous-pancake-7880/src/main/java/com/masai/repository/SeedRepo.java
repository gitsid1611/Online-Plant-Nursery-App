package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.SeedModel;
@Repository
public interface SeedRepo extends JpaRepository<SeedModel, Integer> {

	
	
public List<SeedModel> findbyname(String seed_name);	
	
	
	
}