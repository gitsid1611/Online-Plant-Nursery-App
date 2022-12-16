package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PlantException;
import com.masai.model.Plant;
import com.masai.service.PlantService;

@RestController
//@RequestMapping("/plants")
public class PlantController {

	@Autowired
	private PlantService ps;
	
	
	@PostMapping("/add")
	public ResponseEntity<Plant> AddPlant(@Valid @RequestBody Plant cs) throws PlantException{
		
		if(cs==null)
		{
			throw new PlantException("Not Saved");
		}
		else {
			Plant add = ps.addPlant(cs);
			
			return new ResponseEntity<Plant>(add,HttpStatus.ACCEPTED);
		}
		
	
		
	}
	
	
	
//	................Plant
	
	@PutMapping("/update")
	ResponseEntity<Plant> updatePlant(@RequestBody Plant plant)throws PlantException{
		

		
		
			Plant updated = ps.updatePlant(plant);
		return new ResponseEntity<Plant>(updated, HttpStatus.ACCEPTED);
		
		
			
	}
	
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<Plant> DeletePlant(@PathVariable("id") Plant plant) throws PlantException{
		
		Plant pe = ps.DeletePlant(plant);
	
		return new ResponseEntity<Plant>(pe ,HttpStatus.ACCEPTED);
		
	}
	
	
	@GetMapping("/viewAllplant")
	public ResponseEntity<List<Plant>> viewAll()throws PlantException{

		List<Plant> find = ps.viewAllPlant();

		return new ResponseEntity<List<Plant>>(find,HttpStatus.ACCEPTED);

	}
	
	
	
	@GetMapping("/viewPlantById/{id}")
	public ResponseEntity<Plant> findbyid(@PathVariable("id") int id)throws PlantException{

		Plant byid = ps.viewPlant(id);

		return new ResponseEntity<Plant>(byid,HttpStatus.ACCEPTED);

	}
	
	
	
	
	
	
}
