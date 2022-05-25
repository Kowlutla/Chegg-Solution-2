import java.util.LinkedList;

public class EmployeeList {
	// LinkedList to hold Employees
	LinkedList<Employee> employees;
	// to hold number of employees in list
	int noOfEmployees;

	// Constructor to create EmployeeList
	public EmployeeList() {
		this.employees = new LinkedList<Employee>();
		this.noOfEmployees = 0;
	}

	// Method add employee to list
	public void addEmployee(Employee e) {
		employees.add(e);
		this.noOfEmployees++;
	}

	// Method to remove employee from list
	public void removeEmployee(Employee e) {
		employees.remove(e);
		this.noOfEmployees--;
	}

	// method to get number of employees in list
	public int getNumberOfEmployees() {
		return this.noOfEmployees;
	}

	// method to get all employee details as string
	public String getAllEmployees() {
		String s = "";
		for (Employee e : employees) {
			s += e + "\n";
		}
		return s;
	}

//	// Main method
	public static void main(String[] args) {
//
//		// Creating EmployeeList
//		EmployeeList list = new EmployeeList();
//
//		// Creating Employee Objects
//		Employee e1 = new Employee("emp1", "kowlutla", "Magali");
//		Employee e2 = new Employee("emp2", "Hindu", "Maruvada");
//		Employee e3 = new Employee("emp3", "Krishna", "Kalluri");
//		Employee e4 = new Employee("emp4", "Roopa", "Banavath");
//		Employee e5 = new Employee("emp5", "Deepu", "Magali");
//		Employee e6 = new Employee("emp6", "Aruna", "Boya");
//
//		// Adding Employees to list using addEmployee method
//		list.addEmployee(e1);
//		list.addEmployee(e2);
//		list.addEmployee(e3);
//		list.addEmployee(e4);
//		list.addEmployee(e5);
//		list.addEmployee(e6);
//
//		// printing number of employees in list
//				System.out.println("Number of employees in list: " + list.getNumberOfEmployees());
//		// getting all employee details
//		System.out.println("Employee Details:");
//		System.out.println(list.getAllEmployees());
//
//		// removing employee from list
//		list.removeEmployee(e5);
//
//		// printing number of employees in list
//		System.out.println("Number of employees in list After removing one employee: " + list.getNumberOfEmployees());
//		// getting all employee details
//		System.out.println("Employee Details: ");
//		System.out.println(list.getAllEmployees());

}
}
