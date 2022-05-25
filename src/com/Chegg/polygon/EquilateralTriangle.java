package com.Chegg.polygon;

public class EquilateralTriangle implements RegularPolygon {

	// instance variable length
	private double length;

	// Constructor
	public EquilateralTriangle(double length) {
			this.length = length;
		}

	// Method to return no of sides
	@Override
	public int getNumSides() {

		return 3;
	}

	// Method to return length of side
	@Override
	public double getSideLength() {
		return this.length;
	}

	// toString method to return Square object as string form

	@Override
	public String toString() {
		return "EquilateralTriangle [length=" + length + " Perimeter=" + getPerimeter()+"]";
	}

}
