package com.Chegg.A4;

public class Company {

	// data members
	private String name;
	private String address;
	private int totalNumberOfEmployees;
	private Department[] departments;

	// Constructor to create company by taking company name,address and departments
	public Company(String name, String address, Department[] departments) {
		this.name = name;
		this.address = address;
		this.departments = departments;

		// assigning totalNumberOfEmployees by adding all department sizes
		for (Department d : departments) {
			this.totalNumberOfEmployees += d.getSize();
		}
	}

	// Constructor to create company by taking departments
	public Company(Department[] departments) {
		this.departments = departments;
		// assigning totalNumberOfEmployees by adding all department sizes
		for (Department d : departments) {
			this.totalNumberOfEmployees += d.getSize();
		}
	}

	// Get method for Name
	public String getName() {
		return name;
	}

	// Set method for Name
	public void setName(String name) {
		this.name = name;
	}

	// Get method for Address
	public String getAddress() {
		return address;
	}

	// Set method for Address
	public void setAddress(String address) {
		this.address = address;
	}

	// Get method for TotalNumberOfEmployees
	public int getTotalNumberOfEmployees() {
		return totalNumberOfEmployees;
	}

	// get method for departments
	public Department[] getDepartments() {
		return departments;
	}

	//Set method for departments
	public void setDepartments(Department[] departments) {
		this.departments = departments;
		// assigning totalNumberOfEmployees by adding all department sizes
		for (Department d : departments) {
			this.totalNumberOfEmployees += d.getSize();
		}
	}

	//toString method to return company object as string form
	public String toString() {
		String s = "\n";
		s = s + "Company Name: " + this.name;
		s = s + "\nAddress: " + this.address;
		s = s + "\nTotalNumberOfEmployees: " + this.totalNumberOfEmployees;
		s = s + "\nDepartments:\n";
		for (Department d : departments) {
			s = s + d + "\n";
		}
		return s;
	}

}
