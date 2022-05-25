package com.Chegg.Doctor;

public class Person {

	// Attribute name
	private String name;

	// Constructor Which creates person object without taking any argument (null
	// object)
	public Person() {

	}

	// Constructor Which creates person object by taking name as argument
	public Person(String name) {
		this.name = name;
	}

	// Method to get person name
	public String getName() {
		return name;
	}

	// method to set person name
	public void setName(String name) {
		this.name = name;
	}

	// method to print the info about person
	public void writeOutput() {
		System.out.println("Name: " + this.name);
	}

}
