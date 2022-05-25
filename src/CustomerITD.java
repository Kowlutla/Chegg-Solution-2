//CustomerITD Class
public class CustomerITD {

	// attributes
	private String firstName;
	private String lastName;
	private int serviceNumber;

	static int random = (int) (Math.random() * 9000) + 1000;// to generate 4 digit random

	// Constructor
	public CustomerITD(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.serviceNumber = random++;// automatically increased by one for next customer
	}

	// Getter methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getServiceNumber() {
		return serviceNumber;
	}

	// toString method to return CustomerITD as String
	public String toString() {
		return this.firstName + " " + this.lastName + ", " + this.serviceNumber;
	}
}
