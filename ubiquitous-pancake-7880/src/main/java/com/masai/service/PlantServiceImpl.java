package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.PlantException;
import com.masai.model.Plant;
import com.masai.repository.PlantDao;

@Service
public class PlantServiceImpl implements PlantService {

	@Autowired
	private PlantDao pl;
	
	@Override
	public Plant addPlant(Plant plant) throws PlantException {
 
		Plant mod = pl.save(plant);
		
		if(mod!=null)
		{
			return mod;
		}
		else {
			throw new PlantException("Input is Not Correct");
		}
		
		
	}

	@Override
	public Plant updatePlant(Plant plant) throws PlantException {
		// TODO Auto-generated method stub
		Optional<Plant>opt=pl.findById(plant.getPlantId());
		
		if(opt.isPresent())
		{
			pl.save(plant);
			
		}
	
	
	else {
        throw new PlantException("Plant with given id is not presesnt........");

	}
		
		return opt.get();
	}

	@Override
	public Plant DeletePlant(Plant plantId) throws PlantException {
		// TODO Auto-generated method stub
        Optional<Plant> found = pl.findById(plantId.getPlantId());
		
		
		if(found.isPresent()) {
			pl.delete(plantId);
			
			
		}
		else {
			throw new PlantException("Cant delete this because no such plant is present here");
		}
		
		return found.get();
	}

	@Override
	public Plant viewPlant(Integer seed_id) throws PlantException {
		// TODO Auto-generated method stub
		Optional<Plant> id = pl.findById(seed_id);

		if(id.isEmpty()) {
			throw new PlantException("Id Was In-Correct");
		}
		else {
			return id.get() ;

		}
	}

	@Override
	public List<Plant> viewAllPlant() throws PlantException {
		// TODO Auto-generated method stub
		List<Plant> allcus = pl.findAll();

		if(allcus.isEmpty()) {
			throw new PlantException("No Customer In The Detabase");
		}
		else {
			return allcus;
		}
	}

//	@Override
//	public List<Plant> findPlantByName(String commonName) throws PlantException {
//		// TODO Auto-generated method stub
//		List<Plant> s=pl.findbyname(commonName);
//		if(s.isEmpty()) {
//			throw new PlantException("Not found");
//		}
//		
//		else {
//			return s;
//		}
//
//	}

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
