package rivers;

public class River {
	
	//river’s name and its length in miles.
	private String name;
	private int length;
	
	//Constructor
	public River(String name, int length) {
		this.name = name;
		this.length = length;
	}

	//Getter method to get name of river
	public String getName() {
		return name;
	}

	//Getter method to get length of river
	public int getLength() {
		return length;
	}

	//toString() method that returns String representation of the river
	public String toString() {
		return "River [name=" + name + ", length=" + length + "]";
	}
	
	/*
	 * method isLong() that returns true if river is above 30 miles 
	 * long and returns false otherwise.
	 */
	public boolean isLong()
	{
		return this.length>30;
	}
}
