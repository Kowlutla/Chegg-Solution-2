package Collage;

public class Person {

	// private instance variable
	private String myName;
	private int myAge;
	private String myGender;

	// Constructor
	public Person(String myName, int myAge, String myGender) {
		this.myName = myName;
		this.myAge = myAge;
		this.myGender = myGender;
	}

	// Default Constructors
	public Person() {

	}

	// Get method for Name
	public String getMyName() {
		return myName;
	}

	// Set method for Name
	public void setMyName(String myName) {
		this.myName = myName;
	}

	// Get method for age
	public int getMyAge() {
		return myAge;
	}

	// Set method for Age
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	// Get method for Gender
	public String getMyGender() {
		return myGender;
	}

	// Set method for Gender
	public void setMyGender(String myGender) {
		this.myGender = myGender;
	}

	// toString returns type of string that print out name,age,gender
	public String toString() {
		return "Name: " + myName + "\tAge: " + myAge + "\tGender: " + myGender;
	}
}
