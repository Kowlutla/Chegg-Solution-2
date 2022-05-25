package com.chegg.pet;

public class Pet {

	// Attributes
	private String petName;
	private String petType;
	private int age;
	private double weight;

	// Default Constructor
	public Pet() {
		this.petType = "No type yet";
		this.petName = "Jane Doe";
		this.age = 0;
		this.weight = 0.0;
	}

	// Parameterized constructor
	public Pet(String petName, String petType, int age, double weight) {
		this.petName = petName;
		this.petType = petType;
		this.age = age;
		this.weight = weight;
	}

	// setter methods
	public void setPetName(String petName) {
		this.petName = petName;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// Getter methods
	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	// Method to display about pet
	public void display() {
		System.out.println("Type:" + this.petType + "  Name: " + this.petName + "  Age: " + this.age + " years\n"
				+ "Weight: " + this.weight + " pounds");
	}
}
