package com.Chegg.Shopping;

public class Tshirt extends Item
{
	String color;

	public Tshirt(int id, double price, String brand, String color) {
		super(id, price, brand);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
