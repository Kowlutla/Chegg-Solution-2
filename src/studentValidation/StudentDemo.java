package studentValidation;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDemo {
	public static void main(String[] args) {
		// creating some student objects
		Student s1 = new Student("kow123", 99, 2.4);
		Student s2 = new Student("dee893", 95, 3.4);
		Student s3 = new Student("har232", 89, 3.3);
		Student s4 = new Student("hin423", 56, 2.9);
		Student s5 = new Student("roo094", 77, 1.8);
		Student s6 = new Student("18d544", 90, 3.5);
		Student s7 = new Student("pan342", 96, 1.5);
		Student s8 = new Student("lak452", 94, 4.0);

		// collection object to hold Student Objects
		ArrayList<Student> myCollection = new ArrayList<Student>();
		myCollection.add(s1);
		myCollection.add(s2);
		myCollection.add(s3);
		myCollection.add(s4);
		myCollection.add(s5);
		myCollection.add(s6);
		myCollection.add(s7);
		myCollection.add(s8);

		// iterator to control the loop
		Iterator<Student> studentIterator = myCollection.iterator();

		// printing all student objects using while loop and iterator
		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
	}
}
