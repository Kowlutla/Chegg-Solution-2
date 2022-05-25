public class Assignment4 {
	public static void main(String[] args) {
		// creating Department Objects using different constructors
		Department d1 = new Department("Finance");
		Department d2 = new Department("Human Resources", 20);
		Department d3 = new Department("IT", 100);
		// printing departments
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		// setting d1 size to 15
		d1.setSize(15);
		// getting d1 size
		System.out.println("D1 Size: " + d1.getSize());
		// getting d2 name
		System.out.println("D2 Name: " + d2.getName());

		System.out.println("----------------------------------------");
		// creating Department array
		Department[] departments = { d1, d2, d3 };
		// Creating Company by passing above department array
		Company c = new Company(departments);
		// setting name to company using setName() method
		c.setName("Infosys");
		// setting address of company using setAddress() method
		c.setAddress("Bangolore");

		// getting companyName using getName() method
		System.out.println("Company name: " + c.getName());
		// getting company Address using getAddress() method
		System.out.println("Company Address: " + c.getAddress());

		// printing company details(Internally by calling toString())
		System.out.println(c);
	}
}

/*
 * Department Class
 */
class Department {

	// Data members
	private String name;
	private int size;

	// default constructor
	public Department() {

	}

	// Constructor to create Department object by taking department name
	public Department(String name) {
		this.name = name;
	}

	// Constructor to create Department object by taking department name and size
	public Department(String name, int size) {
		this.name = name;
		this.size = size;
	}

	// Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// toString method
	public String toString() {
		return "DeptName=" + name + ",DeptSize=" + size;
	}

}

/*
 * Department Class
 */
class Company {

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

	// Set method for departments
	public void setDepartments(Department[] departments) {
		this.departments = departments;
		// assigning totalNumberOfEmployees by adding all department sizes
		for (Department d : departments) {
			this.totalNumberOfEmployees += d.getSize();
		}
	}

	// toString method to return company object as string form
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
