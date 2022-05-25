package com.Chegg.Shopping;

public class Item {

	// Attributes
	protected int id;
	protected double price;
	protected String brand;

	// Constructor
	public Item(int id, double price, String brand) {
		this.id = id;
		this.price = price;
		this.brand = brand;
	}

	// Getter method for id
	public int getId() {
		return id;
	}

	// Setter method for id
	public void setId(int id) {
		this.id = id;
	}

	// Getter method for price
	public double getPrice() {
		return price;
	}

	// Setter method for price
	public void setPrice(double price) {
		this.price = price;
	}

	// Getter method for brand
	public String getBrand() {
		return brand;
	}

	// Setter method for brand
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString() {
		return "ID: " + id + ", Price: " + price + ", Brand: " + brand;
	}

}
