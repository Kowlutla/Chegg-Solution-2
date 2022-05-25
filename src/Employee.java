
//Employee Class
public class Employee {
	// employee attributes
	private String name;
	private int IDNumber;
	private String department;
	private String jobTitle;

	// Constructor that creates Employee Object
	public Employee(String name, int iDNumber, String department, String jobTitle) {
		this.name = name;
		IDNumber = iDNumber;
		this.department = department;
		this.jobTitle = jobTitle;
	}

	// Accessors method for name
	public String getName() {
		return name;
	}

	// Accessors method for IDNumber
	public int getIDNumber() {
		return IDNumber;
	}

	// Accessors method for department
	public String getDepartment() {
		return department;
	}

	// Accessors method for joobTitle
	public String getJobTitle() {
		return jobTitle;
	}

	// Mutators method for name
	public void setName(String name) {
		this.name = name;
	}

	// Mutators method for IDNumber
	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}

	// Mutators method for department
	public void setDepartment(String department) {
		this.department = department;
	}

	//// Mutators method for jobTitle
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// toString method to String representation of Employee Object
	public String toString() {
		return "Employee [name=" + name + ", IDNumber=" + IDNumber + ", department=" + department + ", jobTitle="
				+ jobTitle + "]";
	}

	// Main method(Driver Code)
	public static void main(String[] args) {

		// Creating three employees with given data
		Employee e1 = new Employee("Sally Heyes", 47888, "Marketing", "Assistant");
		Employee e2 = new Employee("Mike Smith", 32219, "IT", "Programmer");
		Employee e3 = new Employee("Noelle Brown", 87894, "Graphics", "Engineer");

		// printing three employees
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
