package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.SeedModel;
@Repository
public interface SeedRepo extends JpaRepository<SeedModel, Integer> {

	
	@Query("select s from SeedModel s where s.Seed_name = ?1")
	public List<SeedModel> getSeedBycommonName(String commonName);
	
	
	@Query("select s from SeedModel s where s.type_of_seeds = ?1")
    public List<SeedModel> getSeedBytypeOfSeeds(String typeOfSeeds);
	
	
}