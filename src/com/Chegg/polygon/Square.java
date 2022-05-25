package com.Chegg.polygon;

public class Square implements RegularPolygon {

	//instance variable length
	private double length;
	
	//Constructor
	public Square(double length) {
		this.length = length;
	}

	//Method to return no of sides
	@Override
	public int getNumSides() {
		
		return 4;
	}

	//Method to return length of side
	@Override
	public double getSideLength() {
		return this.length;
	}

	//toString method to return Square object as string form
	@Override
	public String toString() {
		return "Square [length=" + length + " Perimeter="+getPerimeter()+"]";
	}
}
