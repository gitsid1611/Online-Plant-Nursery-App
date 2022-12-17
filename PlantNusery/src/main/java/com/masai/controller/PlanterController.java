package com.masai.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PlanterException;
import com.masai.model.Planter;
import com.masai.service.PlanterServiceImpl;

@RestController
public class PlanterController {
	
	@Autowired
	private PlanterServiceImpl psImpl;
	
	@PutMapping("/addPlanter")
	public Planter addPlanter(@RequestBody Planter planter) {
		Planter p = psImpl.addPlanter(planter);
		return p;
	}
	
	@PostMapping("/updatePlanter")
	public ResponseEntity<Planter> updatePlanter(@RequestBody Planter planter) throws PlanterException {
		
		Planter updatedPlanter = psImpl.updatePlanter(planter);
		
		return new ResponseEntity<Planter>(updatedPlanter, HttpStatus.OK);
	}
	
	@DeleteMapping("/deletePlanter")
	public ResponseEntity<Planter> deletedPlanter(@RequestBody Planter planter) throws PlanterException{
		Planter deletedPlanter = psImpl.deletePlanter(planter);
		return new ResponseEntity<Planter>(deletedPlanter,HttpStatus.OK);
	}
	
	@GetMapping("/getPlanterById/{id}")
	public ResponseEntity<Planter> getPlanterById(@PathVariable("id") Integer planterId) throws PlanterException{
		Planter planter = psImpl.viewPlanter(planterId);
		return new ResponseEntity<Planter>(planter,HttpStatus.FOUND);
	}
	
	@GetMapping("/getAllPlanters")
	public ResponseEntity<List<Planter>> getAllPlanter() throws PlanterException{
		List<Planter> allPlanters = psImpl.viewAllPlanters();
		return new ResponseEntity<List<Planter>>(allPlanters,HttpStatus.FOUND);
	}
	
	@GetMapping("getPlanterByShape/{shape}")
	public ResponseEntity<Planter> getPlanterByShape(@PathVariable("shape") String planterShape) throws PlanterException{
		Planter p = psImpl.viewPlanter(planterShape); 
		return new ResponseEntity <Planter>(p,HttpStatus.FOUND);
	}
	
	@GetMapping("/getPlanterByCost")
	public ResponseEntity<List<Planter>> getPlanterByCost(@RequestParam Integer minCost,
													@RequestParam Integer maxCost) throws PlanterException{
		List<Planter> out_list = psImpl.viewAllPlanters(minCost, maxCost);
		return new ResponseEntity<List<Planter>>(out_list, HttpStatus.FOUND);
	}

}
