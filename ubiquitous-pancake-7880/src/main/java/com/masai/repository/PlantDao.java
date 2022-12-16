package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Plant;

@Repository
public interface PlantDao extends JpaRepository<Plant, Integer> {

//	List<Plant> findbyname(String commonName);

//    public List<Plant> findByCommonName(String commonName);
//	
//	public List<Plant> findByTypeOfPlant(String typeOfPlant);
//	
//	List<Plant> findBycommonName(String commonName);
	
}
