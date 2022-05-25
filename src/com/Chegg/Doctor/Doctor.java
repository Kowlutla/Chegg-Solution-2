package com.Chegg.Doctor;

public class Doctor extends Person implements Comparable<Doctor> {
	// Attributes Of Doctor
	private String specialty;
	private double visitFee;

	// Constructor Which creates Doctor object without taking any argument (null
	// object)
	public Doctor() {

	}

	// Constructor Which creates person object by taking name as argument
	public Doctor(String name) {
		super(name);
	}

	// Constructor Which creates person object by taking name and specialty as
	// argument
	public Doctor(String name, String specialty) {
		super(name);
		this.specialty = specialty;
	}

	// Constructor Which creates person object by taking name,specialty and visitFee
	// as argument
	public Doctor(String name, String specialty, double visitFee) {
		super(name);
		this.specialty = specialty;
		this.visitFee = visitFee;
	}

	// Method to get specialty of doctor
	public String getSpecialty() {
		return specialty;
	}

	// Method to set specialty of doctor
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	// Method to get visit fee of doctor
	public double getVisitFee() {
		return visitFee;
	}

	// Method to set visit fee of doctor
	public void setVisitFee(double visitFee) {
		this.visitFee = visitFee;
	}

	// Overridden method to print doctor info
	@Override
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Speciality: " + this.specialty);
		System.out.println("Office Visit Fee: " + this.visitFee);
	}

	// compareTo method to order Doctor Objects based on office fee visit
	@Override
	public int compareTo(Doctor o) {

		if (this.getVisitFee() > o.getVisitFee()) {
			return 1;
		} else if (this.getVisitFee() < o.getVisitFee()) {
			return -1;
		} else {
			return 0;
		}
	}
}
