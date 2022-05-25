package com.Chegg.Inheritence;

import java.text.SimpleDateFormat;
import java.util.Date;

//super class Person
public class Person {
	
	//attributes
	protected String name;
	protected Date dateOfBirth;
	
	//Constructor
	public Person(String name, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	//Getter for name
	public String getName() {
		return name;
	}
	
	//Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for birthDay
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	//Setter method for dateOfBirth
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	//toString method to return String representation Of Person Object
	@Override
	public String toString() {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return "name=" + name + "\tdateOfBirth=" + sdf.format(dateOfBirth) ;
	}
}
