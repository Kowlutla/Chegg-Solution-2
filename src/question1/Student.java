package question1;

public class Student {

	// Attributes
	private int MatricId;
	private String name;
	private String coursecode;
	private float cgpa;

	// Constructor
	public Student(int matricId, String name, String coursecode, float cgpa) {
		MatricId = matricId;
		this.name = name;
		this.coursecode = coursecode;
		this.cgpa = cgpa;
	}

	// Setter Methods
	public void setMatricId(int matricId) {
		MatricId = matricId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	// Getter methods
	public int getMatricId() {
		return MatricId;
	}

	public String getName() {
		return name;
	}

	public String getCoursecode() {
		return coursecode;
	}

	public float getCgpa() {
		return cgpa;
	}

	// tostring method
	public String toString() {
		return "Student [MatricId=" + MatricId + ", name=" + name + ", coursecode=" + coursecode + ", cgpa=" + cgpa
				+ "]";
	}
}
