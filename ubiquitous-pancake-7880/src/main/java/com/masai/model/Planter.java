package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Planter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer planterId;
	private Float planterHeight;
	private Integer planterCapacity;
	private Integer dranageHoles;
	private String planterColor;
	private String planterShape;
	private Integer planterStock;
	private Integer planterCost;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "plantId")
	@JsonIgnore
	private List<Plant> plants = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "seed_id")
	@JsonIgnore
	private List<SeedModel> seeds = new ArrayList<>();
	
	public Planter() {
		// TODO Auto-generated constructor stub
	}

	public Planter(Integer planterId, Float planterHeight, Integer planterCapacity, Integer dranageHoles,
			String planterColor, String planterShape, Integer planterStock, Integer planterCost, List<Plant> plants,
			List<SeedModel> seeds) {
		super();
		this.planterId = planterId;
		this.planterHeight = planterHeight;
		this.planterCapacity = planterCapacity;
		this.dranageHoles = dranageHoles;
		this.planterColor = planterColor;
		this.planterShape = planterShape;
		this.planterStock = planterStock;
		this.planterCost = planterCost;
		this.plants = plants;
		this.seeds = seeds;
	}

	public Integer getPlanterId() {
		return planterId;
	}

	public void setPlanterId(Integer planterId) {
		this.planterId = planterId;
	}

	public Float getPlanterHeight() {
		return planterHeight;
	}

	public void setPlanterHeight(Float planterHeight) {
		this.planterHeight = planterHeight;
	}

	public Integer getPlanterCapacity() {
		return planterCapacity;
	}

	public void setPlanterCapacity(Integer planterCapacity) {
		this.planterCapacity = planterCapacity;
	}

	public Integer getDranageHoles() {
		return dranageHoles;
	}

	public void setDranageHoles(Integer dranageHoles) {
		this.dranageHoles = dranageHoles;
	}

	public String getPlanterColor() {
		return planterColor;
	}

	public void setPlanterColor(String planterColor) {
		this.planterColor = planterColor;
	}

	public String getPlanterShape() {
		return planterShape;
	}

	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}

	public Integer getPlanterStock() {
		return planterStock;
	}

	public void setPlanterStock(Integer planterStock) {
		this.planterStock = planterStock;
	}

	public Integer getPlanterCost() {
		return planterCost;
	}

	public void setPlanterCost(Integer planterCost) {
		this.planterCost = planterCost;
	}

	public List<Plant> getPlants() {
		return plants;
	}

	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}

	public List<SeedModel> getSeeds() {
		return seeds;
	}

	public void setSeeds(List<SeedModel> seeds) {
		this.seeds = seeds;
	}

	@Override
	public String toString() {
		return "Planter [planterId=" + planterId + ", planterHeight=" + planterHeight + ", planterCapacity="
				+ planterCapacity + ", dranageHoles=" + dranageHoles + ", planterColor=" + planterColor
				+ ", planterShape=" + planterShape + ", planterStock=" + planterStock + ", planterCost=" + planterCost
				+ ", plants=" + plants + ", seeds=" + seeds + "]";
	}

	
	

	
	
}
