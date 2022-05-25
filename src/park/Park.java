package park;

public class Park {
	//Attributes
	String parkName;
	int parkId;
	String parkShape;
	private double parkLength;
	
	//Constructor
	public Park(String parkName, int parkId, String parkShape, double parkLength) {
		this.parkName = parkName;
		this.parkId = parkId;
		//if shape is either circle or square accept other make shape as null
		if(parkShape.equalsIgnoreCase("Circle") || parkShape.equalsIgnoreCase("Square"))
		{
			this.parkShape = parkShape;
		}
		else
		{
			this.parkName=null;
		}
		this.parkLength = parkLength;
	}
	
	//getter method for park name
	public String ParkNameGetter()
	{
		return this.parkName;
	}
	
	//getter method for parkid
	public int ParkGetId()
	{
		return this.parkId;
	}
	
	//getter method for parkLength
	public double ParkLengthGetter()
	{
		return this.parkLength;
	}
}
