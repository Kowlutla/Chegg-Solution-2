package com.Chegg.Inheritence;

import java.util.Date;

//Child Class Student which inherits the Person class
public class Student extends Person {

	// Attribute
	private String major;

	// Constructor
	public Student(String name, Date dateOfBirth, String major) {
		super(name, dateOfBirth);
		this.major = major;
	}

	// Getter method for major
	public String getMajor() {
		return major;
	}

	// Setter method for major
	public void setMajor(String major) {
		this.major = major;
	}

	// toString method to return String representation of Student
	public String toString() {
		// internally calls the parent Class(Person) toString method
		return super.toString() + "\tmajor=" + major;
	}
}
