package student;

//abstract class Student
public abstract class Student {

	// attributes Of Student(Since you haven't mention any attributes creating my
	// own attributes)
	protected int id;
	protected String name;
	protected int creditsHours;

	// Constructor that creates The Student Object
	public Student(int id, String name, int creditsHours) {
		this.id = id;
		this.name = name;
		this.creditsHours = creditsHours;
	}

	// abstract method isGraduating
	public abstract boolean isGraduating();

	// toString method
	public String toString() {
		return "ID: " + id + "\tName: " + name + "\tCredit Hours: " + creditsHours;
	}
}
