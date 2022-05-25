package genericMethods;

public class Student {

	//Student data
	private int id;
	private String name;
	private double gpa;
	
	//Constructor
	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	//getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	//toString method
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}
}
