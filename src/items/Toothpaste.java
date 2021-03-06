package items;

import java.io.Serializable;

import api.ItemAPI;

public class Toothpaste extends ItemAPI implements Serializable {
	private int id;
	private double price;
	private String name;
	private String description;
	
	/**
	 * Initialization BLock
	 * Executed by each constructor
	 */
	public Toothpaste() {
		this.id = 8;
		this.price = 4.00;
		this.name = "Toothpaste";
		this.description = "Toothpaste - Crest toothpaste";
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
	
	public static ItemAPI getObject() {
		ItemAPI item = new ItemAPI(101, 5.99, "Toothpaste", "Crest Toothpaste");
		return item;
	}
}
