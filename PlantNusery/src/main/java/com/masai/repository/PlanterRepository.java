package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.exception.PlanterException;
import com.masai.model.Planter;

@Repository
public interface PlanterRepository extends JpaRepository<Planter, Integer>{

	public Planter findByPlanterShape(String planterShape)throws PlanterException;
	
	
	//@Query("select e from Planter e where e.planterCost BETWEEN e.planterCost=?1 AND e.planterCost=?2 ")
	public List<Planter> findByPlanterCostBetween(Integer minCost, Integer maxCost) throws PlanterException;
}

