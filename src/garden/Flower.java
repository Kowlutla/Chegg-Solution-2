package garden;

//Derived class Flower 
public class Flower extends Plant {
	
	//Specified attributes of plant
	private boolean annual;
	private String color;
	
	//Constructor
	public Flower(String plantName, int cost, boolean annual, String color) {
		super(plantName, cost);
		this.annual = annual;
		this.color = color;
	}

	//Getters
	public boolean isAnnual() {
		return annual;
	}

	public String getColor() {
		return color;
	}

	//Setters
	public void setAnnual(boolean annual) {
		this.annual = annual;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Overriden method from Plant Class to print info of flower
	@Override
	public void printInfo()
	{
		super.printInfo();//calling super class printInfo method to print name and cost
		System.out.println("\tAnnual: "+this.annual);
		System.out.println("\tColor of flowers: "+this.color);
	}
}
