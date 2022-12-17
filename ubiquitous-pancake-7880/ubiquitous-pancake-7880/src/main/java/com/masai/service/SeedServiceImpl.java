package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.exception.SeedException;
import com.masai.model.SeedModel;
import com.masai.repository.SeedRepo;


@Service
public class SeedServiceImpl implements SeedService {

	@Autowired
	private SeedRepo seedrepo;
	
	@Override
	public SeedModel addSeed(SeedModel seed) throws SeedException {
		// TODO Auto-generated method stub
		
	SeedModel addseed =seedrepo.save(seed);
		
		if(addseed!=null) {
			return addseed;
		}
		else {
			throw new SeedException("Input is not Correct");
		}
	
	}

	@Override
	public SeedModel updateSeed(SeedModel seed) throws SeedException {
		// TODO Auto-generated method stub
			
//			Integer seed_id=seed.getSeed_id();
			Optional<SeedModel>opt=seedrepo.findById(seed.getSeed_id());
					
					if(opt.isPresent())
					{
						seedrepo.save(seed);
						return seed;
					}
				
				
				else {
			        throw new SeedException("Seed with given id is not presesnt........");

				}
					
				}
	
	@Override
	public List<SeedModel> viewAllSeed() throws SeedException {
		// TODO Auto-generated method stub
		List<SeedModel> allSeeds=seedrepo.findAll();
		if(allSeeds.size()==0) {
			throw new SeedException("No Seed");
		}
		else {
			seedrepo.findAll();
			return allSeeds;
		}
		
	}
	
	@Override
	public SeedModel viewSeed(Integer seed_id) throws SeedException {
		// TODO Auto-generated method stub
		
		Optional<SeedModel> option=seedrepo.findById(seed_id);
		return option.orElseThrow( ()-> new SeedException(
				"Unable to find Seed with id "+seed_id));
	}
	
	


	@Override
	public SeedModel DeleteSeed(Integer seed_id) throws SeedException {
		// TODO Auto-generated method stub
		
		
		Optional<SeedModel> found = seedrepo.findById(seed_id);
		
		
		if(found.isPresent()) {
			SeedModel sm=found.get();
			seedrepo.delete(sm);
			return sm;
		}
		else {
			throw new SeedException("Cant delete this because no such seed is present here");
		}
	}

	@Override
	public List<SeedModel> getSeedBycommonName(String commonName) throws SeedException {
		
		List<SeedModel> p =seedrepo.getSeedBycommonName(commonName);
		 
		 System.out.println(p);

		if(p.size()>0)
		{
		 System.out.println(p);
			return p;
		}
		else {
	        throw new SeedException("This Seed with given Common name is not present ........");

		}
		
		
	}
	@Override
	public List<SeedModel> getseedByTypeOfSeed(String typeOfSeeds) throws SeedException {
		
		List<SeedModel>list=seedrepo.getSeedBytypeOfSeeds(typeOfSeeds);
		if(list.size()>0)
		{
			return list;
		}
		else {
			throw new SeedException("List of given type of seed is not present");
		}
		
	}


}
