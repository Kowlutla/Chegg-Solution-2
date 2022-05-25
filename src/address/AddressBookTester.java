package address;

import java.util.List;

public class AddressBookTester {

	public static void main(String[] args) {

		// create AddressBook Object
		AddressBook book = new AddressBook();

		// Adding Some Persons to book
		book.addPerson(new Person(1337, "kowlutla", "Mangali"));
		book.addPerson(new Person(1338, "Hindu", "Mangali"));
		book.addPerson(new Person(1330, "Deepti", "Maruvada"));
		book.addPerson(new Person(1129, "Dheeraj", "Kalluri"));
		book.addPerson(new Person(1293, "kowlutla", "Maruvada"));
		book.addPerson(new Person(1337, "Hari", "Banavath"));

		// trying to add Duplicate Person
		System.out.println("trying to add Duplicate Person: ");
		if (book.addPerson(new Person(1337, "Hari", "Banavath"))) {
			System.out.println("Successfully added person");
		} else {
			System.out.println("Duplicate Person not allowed");
		}

		// Search person by using person first name
		System.out.println("\nSearching Person By First Name (kowlutla): ");
		String firstName = "kowlutla";
		List<Person> results = book.searchByFirstName(firstName);

		System.out.println("Results: ");
		if (results.size() != 0) {
			for (Person p : results) {
				System.out.println(p);
			}
		} else {
			System.out.println("No person matched");
		}

		// Search person by using person last name
		System.out.println("\nSearching Person By Last Name (Mangali): ");
		String lastName = "Mangali";
		results = book.searchByLastName(lastName);

		System.out.println("Results: ");
		if (results.size() != 0) {
			for (Person p : results) {
				System.out.println(p);
			}
		} else {
			System.out.println("No person matched");
		}

		// Search person by using person id
		System.out.println("\nSearching Person By ID (1337): ");
		int id = 1337;
		results = book.searchById(id);

		System.out.println("Results: ");
		if (results.size() != 0) {
			for (Person p : results) {
				System.out.println(p);
			}
		} else {
			System.out.println("No person matched");
		}
	}

}
