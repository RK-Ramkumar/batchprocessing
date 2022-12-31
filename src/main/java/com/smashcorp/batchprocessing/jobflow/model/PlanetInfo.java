package com.smashcorp.batchprocessing.jobflow.model;

public class PlanetInfo {
	
	private int Id;
	private String Name;
	private String Category;
	private String Habitable;
	private String Sector;
	
	public String getName() {
		return Name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getHabitable() {
		return Habitable;
	}
	public void setHabitable(String habitable) {
		Habitable = habitable;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}

}
