package student;

//Concrete class UndergradStudent which is child of Student Class
public class UndergradStudent extends Student {
	// specific attributes of UndergradStudent
	boolean isHonorsStudent;

	// Constructor
	public UndergradStudent(int id, String name, int creditsHours, boolean isHonorsStudent) {
		super(id, name, creditsHours);
		this.isHonorsStudent = isHonorsStudent;
	}

	// Overrided method
	@Override
	public boolean isGraduating() {
		/*
		 * if student completed 120 or more credit hours return true otherwise return
		 * false
		 */
		if (creditsHours >= 120) {
			return true;
		} else {
			return false;
		}
	}

	// Overrided toString method
	@Override
	public String toString() {
		return super.toString() + "\tisHonorsStudent: " + isHonorsStudent + "\tisGraduating: " + isGraduating();
	}
}
