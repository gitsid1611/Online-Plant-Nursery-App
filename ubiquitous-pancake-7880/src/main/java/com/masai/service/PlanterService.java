package com.masai.service;

import java.util.List;

import com.masai.exception.PlanterException;
import com.masai.model.Planter;

public interface PlanterService {
	
	public Planter addPlanter(Planter planter);
	
	public Planter updatePlanter(Planter planter) throws PlanterException;
	
	public Planter deletePlanter(Planter planter) throws PlanterException;
	
	public Planter viewPlanter(Integer planterId) throws PlanterException;
	
	public Planter viewPlanter(String planterShape) throws PlanterException;
	
	public List<Planter> viewAllPlanters() throws PlanterException;
	
	public List<Planter> viewAllPlanters(Integer minCost, Integer maxCost) throws PlanterException;

}
