package docterregistry;

class Doctor {
	private String fullName;
	private String registryNumber;
	private String specialty;

	public Doctor(String fullName, String registryNumber, String specialty) {
		this.fullName = fullName;
		this.registryNumber = registryNumber;
		this.specialty = specialty;
	}

	public String getName() {
		return fullName;
	}

	public String getRegistryNumber() {
		return registryNumber;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setName(String fullName) {
		this.fullName = fullName;
	}

	public boolean equals(Doctor other) {
		if (registryNumber == other.registryNumber)
			return true;
		else
			return false;
	}

	public String toString() {
		return "Dr. " + fullName + ", Specialty: " + specialty;
	}

}