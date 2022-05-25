package trees;

public class Flower extends Plant {
	private String color;
	/*
	 * default Constructor that initialize flower Object with name:null,age:0.0 and
	 * color to yellow
	 */
	public Flower() {
		this.color = "yellow";
	}
	/*
	 * Constructor that initialize Flower Object by taking name and color as
	 * argument with name:name provided to constructor and age:0.0 and
	 * color:provided to constructor
	 */
	public Flower(String name, String color) {
		super(name);
		this.color = color;
	}
	/*
	 * Constructor that initialize Flower Object by taking name,age and color as
	 * argument with name:name provided to constructor and age:age provided to
	 * constructor and color:provided to constructor
	 */
	public Flower(String name, double age, String color) {
		super(name, age);
		this.color = color;
	}
	// accessor method for color
	public String getColor() {
		return color;
	}
	// mutator method for color
	public void setColor(String color) {
		this.color = color;
	}
	// Overrided toString method
	public String toString() {
		return "Flower " + super.toString() + "\tColor: " + this.color;
	}
	// implementation for abstract method of super class Plant
	@Override
	public boolean climb() {
		return false;// always return false
	}
}
