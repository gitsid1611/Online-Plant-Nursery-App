package com.masai.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	private Plants plants;
	private Seeds seeds;
	
	public Planter() {
		// TODO Auto-generated constructor stub
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

	public Plants getPlants() {
		return plants;
	}

	public void setPlants(Plants plants) {
		this.plants = plants;
	}

	public Seeds getSeeds() {
		return seeds;
	}

	public void setSeeds(Seeds seeds) {
		this.seeds = seeds;
	}

	@Override
	public String toString() {
		return "Planter [planterId=" + planterId + ", planterHeight=" + planterHeight + ", planterCapacity="
				+ planterCapacity + ", dranageHoles=" + dranageHoles + ", planterColor=" + planterColor
				+ ", planterShape=" + planterShape + ", planterStock=" + planterStock + ", planterCost=" + planterCost
				+ "]";
	}

	
	
}
