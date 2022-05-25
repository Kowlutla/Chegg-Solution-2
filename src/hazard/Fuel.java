package hazard;

import java.util.ArrayList;

public class Fuel implements HazardRating {
	// attributes
	int temperature;
	double volume;

	// Constructor
	public Fuel(int temperature, double volume) {
		this.temperature = temperature;
		this.volume = volume;
	}

	// Overridden method to return rating of chemical
	public double getRating() {

		return temperature / volume;
	}

	//Method to display the chemicals
	public static void displayChemicals(ArrayList<HazardRating> list) {
		//loop through list
		for (int i = 0; i < list.size(); i++) {
			//extract each object
			HazardRating r = list.get(i);
			//if current object is type of chemical print it
			if (r instanceof Chemical) {
				System.out.println(r);
			}
		}
	}
}
