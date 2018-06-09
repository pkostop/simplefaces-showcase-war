package com.sf;

public class Country {
	int id;
	String name;
	String continent;		
	public Country(int id, String name, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
}
