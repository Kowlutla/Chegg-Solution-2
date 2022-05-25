package com.Chegg.npc;

//abstract class NPC
public abstract class NPC {
	// fields
	private int weight;
	private int height;
	
	// Getter method for weight
	public int getWeight() {
		return weight;
	}
	// Getter method for height
	public int getHeight() {
		return height;
	}
	
	// Setter method for weight
	public void setWeight(int weight) {
		this.weight = weight;
	}

	// Setter method for height
	public void setHeight(int height) {
		this.height = height;
	}

	// constructor that takes weight and height
	public NPC(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	// abstract method speak
	public abstract void speak();
}
