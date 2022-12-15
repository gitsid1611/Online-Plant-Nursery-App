package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exception.SeedException;
import com.masai.model.SeedModel;

public interface SeedService {

	public SeedModel addSeed(SeedModel seed) throws SeedException;
	
	public SeedModel updateSeed(SeedModel seed) throws SeedException;
	
	public SeedModel DeleteSeed(Integer seed_id) throws SeedException;
	
	public SeedModel viewSeed(Integer seed_id) throws SeedException;
	
	public List<SeedModel> viewAllSeed() throws SeedException;
	
	public List<SeedModel> findSeedByName(String s_name) throws SeedException;
}
