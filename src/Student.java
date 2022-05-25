
//Class Student which implements the Comparable interface
//this is helper class to use in insertionSort in BasicSorting Class
public class Student implements Comparable<Student> {
	// Attributes
	private String name;
	private double marks;

	// Constructor
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	// Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	// toString for String representation of Student
	public String toString() {
		return name + "\t" + marks;
	}

	// Overrided method to compare two Student Objects based on Marks
	@Override
	public int compareTo(Student o) {

		if (this.marks > o.marks) {
			return 1;
		} else if (this.marks < o.marks) {
			return -1;
		} else {
			return 0;
		}
	}
}
