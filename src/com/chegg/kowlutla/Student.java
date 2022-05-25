package com.chegg.kowlutla;

public class Student {

	// Attributes
	private String name;
	private String email;
	private int grade;

	// Constructor
	public Student(String name, String email, int grade) {
		this.name = name;
		this.email = email;
		this.grade = grade;
	}

	// Getter method for name
	public String get_name() {
		return this.name;
	}

	public void set_name(String newName) {
		this.name = newName;
	}

	// Getter method for email
	public String get_email() {
		return this.email;
	}

	// Setter method for email
	public void set_email(String newEmail) {
		this.email = newEmail;
	}

	// Getter method for grade
	public int get_grade() {
		return this.grade;
	}

	// Setter method for Grade
	public void set_grade(int newGrade) {
		this.grade = newGrade;
	}
}
