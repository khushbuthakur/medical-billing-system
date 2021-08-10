package items;

import java.io.Serializable;

import api.ItemAPI;

public class Tylenol extends ItemAPI implements Serializable {
	private int id;
	private double price;
	private String name;
	private String description;
	
	/**
	 * Initialization BLock
	 * Executed by each constructor
	 */
	public Tylenol() {
		this.id = 6;
		this.price = 19.00;
		this.name = "Tylenol";
		this.description = "Tylenol for health purposes";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	//Getters and Setters
	
	
}
