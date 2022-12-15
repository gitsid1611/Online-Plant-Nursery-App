package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PlantException;
import com.masai.model.Plant;
import com.masai.service.PlantService;

@RestController
public class PlantController {

	@Autowired
	private PlantService ps;
	
	
	@PostMapping("/plant")
	public ResponseEntity<Plant> addPlant(@RequestBody Plant cs) throws PlantException{
		
		Plant add = ps.addPlant(cs);
		
		return new ResponseEntity<Plant>(add,HttpStatus.ACCEPTED);
		
	}
	
	
}
