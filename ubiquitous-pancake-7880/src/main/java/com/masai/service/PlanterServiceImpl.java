package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.PlanterException;
import com.masai.model.Planter;
import com.masai.repository.PlanterRepository;

@Service
public class PlanterServiceImpl implements PlanterService{
	
	@Autowired
	private PlanterRepository pr;

	@Override
	public Planter addPlanter(Planter planter) {
		Planter savedPlanter = pr.save(planter);
		return savedPlanter;
	}

	@Override
	public Planter updatePlanter(Planter planter) throws PlanterException {
		Optional<Planter> op = pr.findById(planter.getPlanterId());
		if(op.isPresent()) {
			return pr.save(planter);
		}
		throw new PlanterException("Plant not updated...");
	}

	@Override
	public Planter deletePlanter(Planter planter) throws PlanterException {
		Optional<Planter> op = pr.findById(planter.getPlanterId());
		if(op.isPresent()) {
			Planter existingPlanter = op.get();
			 pr.delete(existingPlanter);
			 return existingPlanter;
		}
		throw new PlanterException("Planter not deleted");
	}

	@Override
	public Planter viewPlanter(Integer planterId) throws PlanterException {
		Optional<Planter> op =  pr.findById(planterId);
		if(op.isPresent()) {
			return op.get();
		}
		throw new PlanterException("No Planter exist with Id: "+planterId);
	}

	@Override
	public Planter viewPlanter(String planterShape) throws PlanterException {
	Planter p = pr.findByPlanterShape(planterShape);
		if(p!=null) {
			return p;
		}
		throw new PlanterException("No Planter found with PlanterShape: "+planterShape);
	}

	@Override
	public List<Planter> viewAllPlanters() throws PlanterException {
		List<Planter> allPlanters = pr.findAll();
		if(allPlanters.size()>0) {
			return allPlanters;
		}
		throw new PlanterException("No Planter found...");
	}

	@Override
	public List<Planter> viewAllPlanters(Integer minCost, Integer maxCost) throws PlanterException {
		List<Planter> listPlanter = pr.findByPlanterCostBetween(minCost, maxCost);
		if(listPlanter != null) {
			return listPlanter;
		}
		throw new PlanterException("Not found...");
	}

}
