package com.masai.model;

public class OrderDTO {

	private Integer planterId;
	private Integer plantId;
	private Integer seedId;
	
	private Integer customerId;
	
	
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}


	public OrderDTO(Integer planterId, Integer plantId, Integer seedId, Integer customerId) {
		super();
		this.planterId = planterId;
		this.plantId = plantId;
		this.seedId = seedId;
		this.customerId = customerId;
	}


	public Integer getPlanterId() {
		return planterId;
	}


	public void setPlanterId(Integer planterId) {
		this.planterId = planterId;
	}


	public Integer getPlantId() {
		return plantId;
	}


	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}


	public Integer getSeedId() {
		return seedId;
	}


	public void setSeedId(Integer seedId) {
		this.seedId = seedId;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	@Override
	public String toString() {
		return "OrderDTO [planterId=" + planterId + ", plantId=" + plantId + ", seedId=" + seedId + ", customerId="
				+ customerId + "]";
	}
	
 
	
	
	
	
	
	
}
