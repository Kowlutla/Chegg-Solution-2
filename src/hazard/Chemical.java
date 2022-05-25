package hazard;

public class Chemical implements HazardRating {
	// attributes
	int temperature;
	double volume;

	// Constructor
	public Chemical(int temperature, double volume) {
		this.temperature = temperature;
		this.volume = volume;
	}

	// Overridden method to return rating of chemical
	public double getRating() {

		return temperature / volume;
	}

	// I am writing toString method to return chemical object in string form
	public String toString() {
		return "Chemical [temperature=" + temperature + ", volume=" + volume + "]";
	}

}
