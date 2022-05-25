package com.Chegg.Ring;

public class KeyRing extends Ring {
	// private data fields
	private String model;
	private int capacity;

	// Constructor that creates KeyRing with all its parameters
	public KeyRing(double diameter, String model, int capacity) {
		super(diameter);
		this.model = model;
		this.capacity = capacity;
	}

	// toString method
	public String toString() {
		return "Key" + super.toString() + ",model =" + this.model + ",capacity=" + this.capacity;
	}
}
