package com.Chegg.Ring;

public class Ring {

	// private double data field diameter
	private double diameter;

	// A constructor that creates a ring with the specified diameter
	public Ring(double diameter) {
		this.diameter = diameter;
	}

	// A method resize
	public void resize(double offset, char sign) {
		// if sign is '+' the diameter increased by offset value
		if (sign == '+') {
			diameter += offset;
		}
		// if sign is '-' the diameter decreased by offset value
		else if (sign == '-') {
			diameter -= offset;
		}
	}

	// toString method
	public String toString() {
		return "Ring: diameter = " + this.diameter;
	}

}
