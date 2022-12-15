package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.*;
import javax.validation.constraints.Min;

import org.springframework.lang.NonNull;

@Entity
public class SeedModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer seed_id;
	@NonNull
	private String Seed_name;
	
	private String bloom_time;
	
	private String watering;
	@NonNull
	private String difficulty_level;
	
	private String temperature;
	@NonNull
	private String type_of_seeds;
	
	private String seeds_descrption;
	
	@Min(value = 0, message = "Seed's stock can't be negative")
	
	private Integer seeds_stock;
	@Min(value = 1, message = "Seed's cost can't be zero")
	
	private double seeds_cost;
	
	private Integer seeds_perpacket;
	public SeedModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SeedModel(Integer seed_id, String seed_name, String bloom_time, String watering, String difficulty_level,
			String temperature, String type_of_seeds, String seeds_descrption,
			@Min(value = 0, message = "Seed's stock can't be negative") Integer seeds_stock,
			@Min(value = 1, message = "Seed's cost can't be zero") double seeds_cost, Integer seeds_perpacket) {
		super();
		this.seed_id = seed_id;
		Seed_name = seed_name;
		this.bloom_time = bloom_time;
		this.watering = watering;
		this.difficulty_level = difficulty_level;
		this.temperature = temperature;
		this.type_of_seeds = type_of_seeds;
		this.seeds_descrption = seeds_descrption;
		this.seeds_stock = seeds_stock;
		this.seeds_cost = seeds_cost;
		this.seeds_perpacket = seeds_perpacket;
	}
	public Integer getSeed_id() {
		return seed_id;
	}
	public void setSeed_id(Integer seed_id) {
		this.seed_id = seed_id;
	}
	public String getSeed_name() {
		return Seed_name;
	}
	public void setSeed_name(String seed_name) {
		Seed_name = seed_name;
	}
	public String getBloom_time() {
		return bloom_time;
	}
	public void setBloom_time(String bloom_time) {
		this.bloom_time = bloom_time;
	}
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
	}
	public String getDifficulty_level() {
		return difficulty_level;
	}
	public void setDifficulty_level(String difficulty_level) {
		this.difficulty_level = difficulty_level;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getType_of_seeds() {
		return type_of_seeds;
	}
	public void setType_of_seeds(String type_of_seeds) {
		this.type_of_seeds = type_of_seeds;
	}
	public String getSeeds_descrption() {
		return seeds_descrption;
	}
	public void setSeeds_descrption(String seeds_descrption) {
		this.seeds_descrption = seeds_descrption;
	}
	public Integer getSeeds_stock() {
		return seeds_stock;
	}
	public void setSeeds_stock(Integer seeds_stock) {
		this.seeds_stock = seeds_stock;
	}
	public double getSeeds_cost() {
		return seeds_cost;
	}
	public void setSeeds_cost(double seeds_cost) {
		this.seeds_cost = seeds_cost;
	}
	public Integer getSeeds_perpacket() {
		return seeds_perpacket;
	}
	public void setSeeds_perpacket(Integer seeds_perpacket) {
		this.seeds_perpacket = seeds_perpacket;
	}
	@Override
	public String toString() {
		return "SeedModel [seed_id=" + seed_id + ", Seed_name=" + Seed_name + ", bloom_time=" + bloom_time
				+ ", watering=" + watering + ", difficulty_level=" + difficulty_level + ", temperature=" + temperature
				+ ", type_of_seeds=" + type_of_seeds + ", seeds_descrption=" + seeds_descrption + ", seeds_stock="
				+ seeds_stock + ", seeds_cost=" + seeds_cost + ", seeds_perpacket=" + seeds_perpacket + "]";
	}
	
	
	
	
}
