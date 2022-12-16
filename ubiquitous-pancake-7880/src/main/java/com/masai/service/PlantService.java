package com.masai.service;

import java.util.List;



import com.masai.exception.PlantException;
import com.masai.model.Plant;


public interface PlantService {

	
//	public Plant addPlant(Plant plant)throws PlantException;
	
	public Plant addPlant (Plant cs) throws PlantException;
	
	public Plant updatePlant(Plant plant) throws PlantException;
	
	public Plant DeletePlant(Plant plantId) throws PlantException;
	
	public Plant viewPlant(Integer seed_id) throws PlantException;
	
	public List<Plant> viewAllPlant() throws PlantException;
	
//	public List<Plant> findPlantByName(String commonName) throws PlantException;
	
//	public Planter getPlanterByPlantId(Integer Id) throws PlantException;
	
	
	
}
