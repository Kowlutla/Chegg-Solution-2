package Collage;

import java.util.Scanner;

public class Student extends Person {
	// private instance variables
	private int stuID;
	private float stuGPA;
	private String stuAddress;
	// Constructor that passes the all argument values and assign to instance
	// variables
	public Student(String myName, int myAge, String myGender, int stuID, float stuGPA, String stuAddress) {
		super(myName, myAge, myGender);
		this.stuID = stuID;
		this.stuGPA = stuGPA;
		this.stuAddress = stuAddress;
	}
	// Constructor that passes nothing
	public Student() {
	}
	// Get Method for stuID
	public int getStuID() {
		return stuID;
	}
	// Set Method for stuID
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	// Get Method for stuGPA
	public float getStuGPA() {
		return stuGPA;
	}
	// Set Method for stuGPA
	public void setStuGPA(float stuGPA) {
		this.stuGPA = stuGPA;
	}
	// Get Method for stuAddress
	public String getStuAddress() {
		return stuAddress;
	}

	// Set Method for stuAddress
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String toString() {
		return super.toString() + "\tstuID: " + stuID + "\tstuGPA: " + stuGPA + "\tstuAddress: " + stuAddress;
	}
	// method to Check GPA and take GPA until GPA should become in range
	public void testGPA() {
		boolean isOk = false;
		do {
			if (!(stuGPA >= 0 && stuGPA <= 4)) {
				System.out.print("CGPA not in Range..Please Enter stuGPA: ");
				stuGPA = new Scanner(System.in).nextFloat();
			} else {
				isOk = true;
			}
		} while (!isOk);
	}
}
