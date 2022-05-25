package docterregistry;

public class DoctorRegistry {
	// Attributes
	private String province;
	private Doctor[] doctors;

	// to hold how many doctors in list
	private int index = 0;

	/*
	 * Constructor that creates the DoctorRegistry object with maximum doctors in
	 * list to maxDoctors and with given province
	 */
	public DoctorRegistry(int maxDoctors, String province) {
		this.doctors = new Doctor[maxDoctors];
		this.province = province;
	}

	// Method to register doctor
	public boolean register(Doctor doctor) {
		// if already maximum doctors in list do not add
		if (index == doctors.length) {
			return false;
		}
		// to hold doctor already in list or not
		boolean found = false;

		// checking for given doctor present in list
		// Look for each doctor in list
		for (int i = 0; i < index; i++) {
			// extract current doctor
			Doctor d = doctors[i];

			// if current doctor is given doctor
			if (d.equals(doctor)) {
				// mark as true(found)
				found = true;
				// stop searching
				break;
			}
		}

		// if already in list do not add and return false
		if (found) {
			return false;
		}
		// else add doctor in next empty position and return true
		else {
			doctors[index++] = doctor;
			return true;
		}
	}

	// Method to de-register doctor by taking registry number
	public boolean deRegister(String registryNumber) {
		// Look for all doctors
		for (int i = 0; i < index; i++) {
			// if current doctor registry number is same as provided registry number
			if (doctors[i].getRegistryNumber().equalsIgnoreCase(registryNumber)) {
				// set the current position as null and return true
				doctors[i] = null;
				return true;
			}
		}
		return false;
	}

	// Method to return registered doctors list
	public Doctor[] getDoctorList() {
		// create a new Doctor array to hold all registered Doctors
		Doctor[] list = new Doctor[index];

		// Look for all Doctors
		for (int i = 0; i < index; i++) {
			list[i]=doctors[i];
		}

		// return the list
		return list;
	}
}
