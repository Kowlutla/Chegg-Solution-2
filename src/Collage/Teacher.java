package Collage;

public class Teacher extends Person {
	// private instance variables
	private String mySubject;
	private double mySalary;

	/*
	 * Constructor that parse name,age,gender,subject and salary set the arguments
	 * to respective variables
	 */
	public Teacher(String myName, int myAge, String myGender, String mySubject, double mySalary) {
		super(myName, myAge, myGender);
		this.mySubject = mySubject;
		this.mySalary = mySalary;
	}

	// Constructor that does not pass anything
	public Teacher() {
	}

	// Get method for subject
	public String getMySubject() {
		return mySubject;
	}

	// Set Method for subject
	public void setMySubject(String mySubject) {
		this.mySubject = mySubject;
	}

	// Get method for salary
	public double getMySalary() {
		return mySalary;
	}

	// Set method for salary
	public void setMySalary(double mySalary) {
		this.mySalary = mySalary;
	}

	// toString method
	public String toString() {
		return super.toString() + "\tSubject: " + mySubject + "\tSalary: " + mySalary;
	}

}
