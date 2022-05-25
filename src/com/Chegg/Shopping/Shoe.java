package com.Chegg.Shopping;

public class Shoe extends Item {
	// Special Attribute Shoe
	private int size;

	// Constructor
	public Shoe(int id, double price, String brand, int size) {
		super(id, price, brand);
		this.size = size;
	}

	// Getter method to size
	public int getSize() {
		return size;
	}

	// Setter method to Size
	public void setSize(int size) {
		this.size = size;
	}

	// toString method to return shoe object as string form
	public String toString() {
		return "Shoe: " + super.toString() + ", Size: " + size;
	}

}
