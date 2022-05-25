package com.Chegg.Inheritence;

import java.util.Date;

//Child Class Instructor which inherits the Person class
public class Instructor extends Person {

	// Attribute of Instructor
	private double salary;

	// Constructor
	public Instructor(String name, Date dateOfBirth, double salary) {
		super(name, dateOfBirth);
		this.salary = salary;
	}

	// getter method for salary
	public double getSalary() {
		return salary;
	}

	// Setter method for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// toString method to return String representation of Instructor
	public String toString() {
		// internally calls the parent Class(Person) toString method
		return super.toString() + "\tsalary=" + salary;
	}
}
