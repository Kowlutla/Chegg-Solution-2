package garden;

import java.util.ArrayList;
import java.util.Scanner;

public class PlantArrayListExample {

	public static void main(String[] args) {

		//myGarden to Hold plant or Flower
		ArrayList<Plant> myGarden = new ArrayList<Plant>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String info;
			//Taking information
			info = sc.nextLine();
			//initialize Plant object to hold plant or flower
			Plant p = null;
			//Splitting above information and store in string array
			String array[] = info.split(" ");
			//if user entered plant as type at starting information
			if (array[0].equalsIgnoreCase("Plant")) {
				String name = array[1];//taking plant name
				int cost = Integer.parseInt(array[2]);//taking plant cost
				p = new Plant(name, cost);//creating plant Object
			} 
			//if user entered Flower as type at starting information
			else if (array[0].equalsIgnoreCase("Flower")) {
				String name = array[1];//taking plant name
				int cost = Integer.parseInt(array[2]);//taking plant cost
				boolean annual = Boolean.parseBoolean(array[3]);//taking annual or not
				String color = array[4];//taking color name
				p = new Flower(name, cost, annual, color);//creating Flower object using Plant reference
			}
			//if we entered -1 stop reading information
			else if(Integer.parseInt(info)==-1){
				break;
			}
			myGarden.add(p);//adding above created object to myGarden

		}
		
		//Printing arrayList information by calling printArrayList method
		printArrayList(myGarden);
		
		sc.close();
	}
	
	//Method to print ArrayList information
	public static void printArrayList(ArrayList<Plant> myGarden)
	{
		//For all objects in Garden
		for (Plant p : myGarden) {
			p.printInfo();//print info of current Object by calling printInfo method
			System.out.println();
		}
	}

}
