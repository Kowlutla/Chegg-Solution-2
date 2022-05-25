package com.Chegg.Ring;

public class WeddingRing extends Ring {
	// private data fields
	private int width;
	private int stones;

	// Constructor that creates WeddingRing with all its parameters
	public WeddingRing(double diameter, int width, int stones) {
		super(diameter);
		this.width = width;
		this.stones = stones;
	}

	// toString method
	public String toString() {
		return "Wedding" + super.toString() + ",width=" + this.width + ",stones=" + this.stones;
	}
}
