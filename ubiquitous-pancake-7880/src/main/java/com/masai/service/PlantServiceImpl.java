package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.exception.PlantException;
import com.masai.model.Plant;
import com.masai.repository.PlantDao;

public class PlantServiceImpl implements PlantService {

	@Autowired
	private PlantDao pl;
	
	@Override
	public Plant addPlant(Plant plant) throws PlantException {
 
		Plant plan = pl.save(plant);
		
		if(plant.getCommonName().isEmpty())
		{
			throw new PlantException("Please Enter Correct data");
		}
		else
		{
			return plant;
		}
	
		
		
	}

//	@Override
//	public Plant updatePlant(Plant plant)throws PlantException {
//		 Plant obj = pl.findById(plant.getPlantId()).orElseThrow(() -> new PlantException("Plant not found "));
//	        
//		 return pl.save(plant);
//	       
//		
//	}
//
//	@Override
//	public Plant deletePlant(Plant plant) throws PlantException {
//		Plant existingPlant= pl.findById(plant.getPlantId()).orElseThrow(() -> new PlantException("Plant does not exist with Plant Id "+plant.getPlantId()));;
//		
//		plantDao.delete(existingPlant);
//				
//		return existingPlant;
//	}
//
//	@Override
//	public Plant viewPlant(Integer plantId) throws PlantException{
//		Plant obj= plantDao.findById(plantId).orElseThrow(() -> new PlantException("Plant does not exist with Plant Id "+plantId) );
//	
//		return obj;
//	}
//
//	@Override
//	public List<Plant> viewPlant(String commonName) throws PlantException {
//
//		List<Plant> plants= plantDao.findByCommonName(commonName);
//		
//		if(plants.size() > 0)
//			return plants;
//		else
//			throw new PlantException("Plant does not exist with Name "+commonName);
//		
//	}
//
//	@Override
//	public List<Plant> viewAllPlants() throws PlantException {
//		List<Plant> plants= plantDao.findAll();
//		
//		if(plants.size() > 0)
//			return plants;
//		else
//			throw new PlantException("No Plant found..");
//		
//	}
//
//	@Override
//	public List<Plant> viewAllPlants(String typeOfPlant) throws PlantException {
//		List<Plant> plants= plantDao.findByTypeOfPlant(typeOfPlant);
//		
//		if(plants.size() > 0)
//			return plants;
//		else
//			throw new PlantException("Plant does not exist with Type "+typeOfPlant);
//	}

}
