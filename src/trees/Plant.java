package trees;

public abstract class Plant {

	// attributes
	protected String name;
	private double age;

	/*
	 * default Constructor that initialize Plant Object with name:null and age:0.0
	 */
	public Plant() {

	}
	
	/*
	 * Constructor that initialize Plant Object by taking name as argument with
	 * name:name provided to constructor and age:0.0
	 */
	public Plant(String name) {
		this.name = name;
	}

	/*
	 * Constructor that initialize Plant Object by taking name and age as argument
	 * with name:name provided to constructor and age:age provided to constructor
	 */
	public Plant(String name, double age) {
		this.name = name;
		this.age = age;
	}

	// accessor method for name
	public String getName() {
		return name;
	}

	// accessor method for age
	public double getAge() {
		return age;
	}

	// mutator for name
	public void setName(String name) {
		this.name = name;
	}

	// mutator for age
	public void setAge(double age) {
		this.age = age;
	}

	// Method to check current Object is equal to provided Object
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Plant other = (Plant) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String toString() {
		return "Name: " + this.name + "\tAge: " + this.age;
	}

	//abstract method climb
	public abstract boolean climb();
}
