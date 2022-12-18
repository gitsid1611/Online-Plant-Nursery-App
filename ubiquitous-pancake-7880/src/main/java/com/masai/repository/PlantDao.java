package com.masai.repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Plant;

@Repository
public interface PlantDao extends JpaRepository<Plant, Integer> {

	@Query("select p from Plant p where p.commonName = ?1")
	public Plant viewPlantBycommonName(String commonName);
	
	@Query("select p from Plant p where p.typeOfPlant = ?1")
     public List<Plant> viewPlantBytypeOfPlant(String typeOfPlant);
}
