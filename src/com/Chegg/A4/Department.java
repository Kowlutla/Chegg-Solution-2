package com.Chegg.A4;

public class Department {

	// Data members
	private String name;
	private int size;

	// default constructor
	public Department() {

	}

	// Constructor to create Department object by taking department name
	public Department(String name) {
		this.name = name;
	}

	// Constructor to create Department object by taking department name and size
	public Department(String name, int size) {
		this.name = name;
		this.size = size;
	}

	// Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// toString method
	public String toString() {
		return "DeptName=" + name + ",DeptSize=" + size;
	}

}
