package address;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class AddressBook {
	// to hold persons details(set does not allow duplicates)
	private HashSet<Person> book;

	// Constructor to create AddressBook Object
	public AddressBook() {
		this.book = new HashSet<Person>();
	}
	// method to add person to addressBook
	public boolean addPerson(Person p) {
		return this.book.add(p);
	}
	// Method to remove specified Person
	// return true if removal done otherwise return false
	public boolean remove(Person p) {
		return book.remove(p);
	}
	// method to search based on First Name
	public List<Person> searchByFirstName(String name) {
		// create List to hold search result
		List<Person> result = new ArrayList<Person>();
		// look for all Persons in book
		for (Person p : book) {
			// if current person first name matches to provided name
			if (p.getFirstName().equalsIgnoreCase(name)) {
				// add that person to result list
				result.add(p);
			}
		}
		// return the result
		return result;
	}

	// method to search based on Last Name
	public List<Person> searchByLastName(String name) {

		// create List to hold search result
		List<Person> result = new ArrayList<Person>();
		// look for all Persons in book
		for (Person p : book) {
			// if current person last name matches to provided name
			if (p.getLastName().equalsIgnoreCase(name)) {
				// add that person to result list
				result.add(p);
			}
		}
		// return the result
		return result;
	}

	// method to search based on id
	public List<Person> searchById(int id) {

		// create List to hold search result
		List<Person> result = new ArrayList<Person>();
		// look for all Persons in book
		for (Person p : book) {
			// if current person id matches to provided id
			if (p.getId() == id) {
				// add that person to result list
				result.add(p);
			}
		}
		// return the result
		return result;
	}
}
