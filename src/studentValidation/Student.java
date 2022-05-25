package studentValidation;

import java.util.regex.*;

public class Student {

	// attributes
	private String studentID;
	private int studentCredits;
	private double studentGPA;

	// default constructor
	public Student() {
	}

	// parameterized constructor
	public Student(String studentID, int studentCredits, double studentGPA) {
		String regex = "[a-z]{3}[0-9]{3}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(studentID);
		if (m.find() && m.group().equals(studentID)) {
			this.studentID = studentID;
		}
		if (!(studentCredits < 0)) {
			this.studentCredits = studentCredits;
		}

		if (!(studentGPA < 0 || studentGPA > 4)) {
			this.studentGPA = studentGPA;
		}
	}

	// accessor methods
	public String getStudentID() {
		return studentID;
	}

	public int getStudentCredits() {
		return studentCredits;
	}

	public double getStudentGPA() {
		return studentGPA;
	}

	// mutator methods
	public void setStudentID(String studentID) {
		String regex = "[a-z] {3}[0-9] {3}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(studentID);
		if (m.find() && m.group().equals(studentID)) {
			this.studentID = studentID;
		}
	}

	public void setStudentCredits(int studentCredits) {
		if (!(studentCredits < 0)) {
			this.studentCredits = studentCredits;
		}
	}

	public void setStudentGPA(double studentGPA) {
		if (!(studentGPA < 0 || studentGPA > 4)) {
			this.studentGPA = studentGPA;
		}
	}

	// method to calculateGpa
	public double calculateGpa() throws InvalidCourseReference {
		if (this.studentCredits == 0) {
			throw new InvalidCourseReference();
		} else {
			return this.studentGPA / this.studentCredits;
		}
	}

	// toString method to return String representation of Student Object
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentCredits=" + studentCredits + ", studentGPA=" + studentGPA
				+ "]";
	}
}
