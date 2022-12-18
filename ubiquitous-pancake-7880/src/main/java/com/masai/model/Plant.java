package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Plant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer plantId;

	private Integer plantHeight;
	
	private String plantSpread;
	
	private String commonName;
	
	private String bloomTime;
	
	private String medicinalOrCulinaryUse;
	
	private String difficultyLevel;
	
	private String temparature;
		
	private String typeOfPlant;
	
	private String plantDescription;
		
	private Integer plantStock;
	
	private Integer plantCost;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Planter planter;
	
	
	public Plant() {
		// TODO Auto-generated constructor stub
	}


	

	public Plant(Integer plantId, Integer plantHeight, String plantSpread, String commonName, String bloomTime,
			String medicinalOrCulinaryUse, String difficultyLevel, String temparature, String typeOfPlant,
			String plantDescription, Integer plantStock, Integer plantCost, Planter planter) {
		super();
		this.plantId = plantId;
		this.plantHeight = plantHeight;
		this.plantSpread = plantSpread;
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
		this.difficultyLevel = difficultyLevel;
		this.temparature = temparature;
		this.typeOfPlant = typeOfPlant;
		this.plantDescription = plantDescription;
		this.plantStock = plantStock;
		this.plantCost = plantCost;
		this.planter = planter;
	}




	public Integer getPlantId() {
		return plantId;
	}


	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}


	public Integer getPlantHeight() {
		return plantHeight;
	}


	public void setPlantHeight(Integer plantHeight) {
		this.plantHeight = plantHeight;
	}


	public String getPlantSpread() {
		return plantSpread;
	}


	public void setPlantSpread(String plantSpread) {
		this.plantSpread = plantSpread;
	}


	public String getCommonName() {
		return commonName;
	}


	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}


	public String getBloomTime() {
		return bloomTime;
	}


	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}


	public String getMedicinalOrCulinaryUse() {
		return medicinalOrCulinaryUse;
	}


	public void setMedicinalOrCulinaryUse(String medicinalOrCulinaryUse) {
		this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
	}


	public String getDifficultyLevel() {
		return difficultyLevel;
	}


	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}


	public String getTemparature() {
		return temparature;
	}


	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}


	public String getTypeOfPlant() {
		return typeOfPlant;
	}


	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}


	public String getPlantDescription() {
		return plantDescription;
	}


	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}


	public Integer getPlantStock() {
		return plantStock;
	}


	public void setPlantStock(Integer plantStock) {
		this.plantStock = plantStock;
	}


	public Integer getPlantCost() {
		return plantCost;
	}


	public void setPlantCost(Integer plantCost) {
		this.plantCost = plantCost;
	}


	


	public Planter getPlanter() {
		return planter;
	}




	public void setPlanter(Planter planter) {
		this.planter = planter;
	}




	@Override
	public String toString() {
		return "Plant [plantId=" + plantId + ", plantHeight=" + plantHeight + ", plantSpread=" + plantSpread
				+ ", commonName=" + commonName + ", bloomTime=" + bloomTime + ", medicinalOrCulinaryUse="
				+ medicinalOrCulinaryUse + ", difficultyLevel=" + difficultyLevel + ", temparature=" + temparature
				+ ", typeOfPlant=" + typeOfPlant + ", plantDescription=" + plantDescription + ", plantStock="
				+ plantStock + ", plantCost=" + plantCost + ", planter=" + planter + "]";
	}


	
	

}
