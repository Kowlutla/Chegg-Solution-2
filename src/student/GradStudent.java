package student;

//Concrete class GradStudent which is child of Student Class
public class GradStudent extends Student {

	// specific attributes of GradStudent
	boolean isDoingThesis;
	// Constructor
	public GradStudent(int id, String name, int creditsHours, boolean isDoingThesis) {
		super(id, name, creditsHours);
		this.isDoingThesis = isDoingThesis;
	}

	// Overrided method
	@Override
	public boolean isGraduating() {
		/*
		 * if student completed 30 or more credit hours return true otherwise return
		 * false
		 */
		if (creditsHours >= 30) {
			return true;
		} else {
			return false;
		}
	}

	// Overrided toString method
	@Override
	public String toString() {

		return super.toString() + "\tisDoingThesis: " + isDoingThesis + "\tisGraduating: " + isGraduating();
	}
}
