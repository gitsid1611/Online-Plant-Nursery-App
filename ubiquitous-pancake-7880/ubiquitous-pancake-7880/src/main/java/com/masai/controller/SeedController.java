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

import com.masai.exception.SeedException;
import com.masai.model.SeedModel;
import com.masai.repository.SeedRepo;
import com.masai.service.SeedService;

@RestController
@RequestMapping("/seed")
public class SeedController {

	@Autowired
	private SeedService seedService;
	
	

	@Autowired
	private SeedRepo rp;
	
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
//	ADD Seed ->
	
	
	@PostMapping("/add")
	public ResponseEntity<SeedModel> addSeedHandler(@Valid @RequestBody SeedModel seed ) throws SeedException{
		
			if(seed==null) {
				throw new SeedException("not saved!");
			}
			else {
		 SeedModel	as=seedService.addSeed(seed);
		
		return new ResponseEntity<SeedModel>(as ,HttpStatus.CREATED);
			}
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------	
//	update Seed->
	
	
	@PutMapping("/update")
	public ResponseEntity<SeedModel> updateSeed(@Valid @RequestBody SeedModel seed)throws SeedException{
		
//		Seed updatedSeed = null;
		
		if(seed!=null) {
		SeedModel	updatedSeed = seedService.updateSeed(seed);
		return new ResponseEntity<SeedModel>(updatedSeed, HttpStatus.CREATED);
		}
		else {
			throw new SeedException("No such seed exist");
		}
		
			
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------		
	
	
	@GetMapping("/viewall")
	public ResponseEntity <List<SeedModel>> getAllSeeds() throws SeedException{
		List<SeedModel> viewall=seedService.viewAllSeed();
		return new ResponseEntity<List<SeedModel>>(viewall,HttpStatus.OK);
	}
	

	



//----------------------------------------------------------------------------------------------------------------------------------------------------------------------	

//Specific seed by id ->

	@GetMapping("/id/{seed_id}")
	public ResponseEntity<SeedModel> getSpecificSeed(@PathVariable("seed_id") Integer seed_id)
			throws SeedException{

		SeedModel specificSeed = seedService.viewSeed(seed_id);

		return new ResponseEntity<SeedModel>(specificSeed, HttpStatus.OK);
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------	


//	DeleteSeed->
	
	@DeleteMapping("/delete/{seedId}")
	public ResponseEntity<SeedModel> deleteSeed(@PathVariable("seedId") Integer seedId)throws SeedException{
		
		SeedModel deletedSeed = null;
		if(seedId!=null) {
			deletedSeed = seedService.DeleteSeed(seedId);
			return new ResponseEntity<SeedModel>(deletedSeed, HttpStatus.OK);
		}
		else {
			throw new SeedException("Cannot Delete this seed, No such Seed present ");
		}
	}
	
	@GetMapping("/viewall/{id}")
	public ResponseEntity<List<SeedModel>> namefind(@PathVariable("id") String s ) throws SeedException{
		List<SeedModel> result=seedService.findSeedByName(s);
		return new ResponseEntity<>(result,HttpStatus.ACCEPTED);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
