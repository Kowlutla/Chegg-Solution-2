package trees;

public class Tree extends Plant {

	// Specific attribute
	private boolean evergreen;

	/*
	 * default Constructor that initialize Tree Object with name:null,age:0.0 and
	 * evergreen to false
	 */
	public Tree() {

	}

	/*
	 * Constructor that initialize Tree Object by taking name and evergreen as
	 * argument with name:name provided to constructor and age:0.0 and
	 * evergreen:provided to constructor
	 */
	public Tree(String name, boolean evergreen) {
		super(name);
		this.evergreen = evergreen;
	}

	/*
	 * Constructor that initialize Tree Object by taking name,age and evergreen as
	 * argument with name:name provided to constructor and age:age provided to
	 * constructor and evergreen:provided to constructor
	 */
	public Tree(String name, double age, boolean evergreen) {
		super(name, age);
		this.evergreen = evergreen;
	}

	// accessor method for evergreen
	public boolean isEvergreen() {
		return evergreen;
	}

	// Mutator method for evergreen
	public void setEvergreen(boolean evergreen) {
		this.evergreen = evergreen;
	}

	// Overrided toString method
	public String toString() {
		return "Tree " + super.toString() + "\tEverGreen: " + this.evergreen;
	}

	// implementation for abstract method of super class Plant
	@Override
	public boolean climb() {
		// if tree age is greater than 10 able to climb
		if (this.getAge() > 10) {
			return true;
		} // other wise return false
		else {
			return false;
		}
	}
}
