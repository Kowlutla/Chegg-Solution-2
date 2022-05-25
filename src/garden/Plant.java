package garden;

//base class Plant
public class Plant {
	//Attributes of Plant
	private String plantName;
	private int cost;
	
	//Constructor
	public Plant(String plantName, int cost) {
		this.plantName = plantName;
		this.cost = cost;
	}
	
	//Getters
	public String getName() {
		return plantName;
	}
	public int getAge() {
		return cost;
	}
	
	//Setters
	public void setName(String plantName) {
		this.plantName = plantName;
	}
	public void setAge(int cost) {
		this.cost = cost;
	}
	
	//Method to print information of plant
	public void printInfo()
	{
		System.out.println("Plant Information: ");
		System.out.println("\tPlant Name: "+this.plantName);
		System.out.println("\tCost: "+this.cost);
	}
}
