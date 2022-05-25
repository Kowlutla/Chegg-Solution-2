
//Class Name : Car
public class Car {
	/*
	 * Private Member
	 */
	private String plateNumber;
	private String make;
	private int model;
	private double xLocation;
	private double yLocation;
	private int speed;
	private boolean isSeatBeltFastened;

	// Constructor which created the Car Object with default values
	public Car() {
	}

	// Overloaded constructor
	public Car(String plateNumber, String make, int model, double xLocation, double yLocation, int speed,
			boolean isSeatBeltFastened) {
		this.plateNumber = plateNumber;
		this.make = make;
		this.model = model;
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.speed = speed;
		this.isSeatBeltFastened = isSeatBeltFastened;
	}

	// setters
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void setxLocation(double xLocation) {
		this.xLocation = xLocation;
	}

	public void setyLocation(double yLocation) {
		this.yLocation = yLocation;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setSeatBeltFastened(boolean isSeatBeltFastened) {
		this.isSeatBeltFastened = isSeatBeltFastened;
	}

	// Getters
	public String getPlateNumber() {
		return plateNumber;
	}

	public String getMake() {
		return make;
	}

	public int getModel() {
		return model;
	}

	public double getxLocation() {
		return xLocation;
	}

	public double getyLocation() {
		return yLocation;
	}

	public int getSpeed() {
		return speed;
	}

	public boolean isSeatBeltFastened() {
		return isSeatBeltFastened;
	}

	// IsOverSpeed ( Return true if the speed is greater than 100)
	public boolean isOverSpeed() {
		if (this.speed > 100) {
			return true;
		} else {
			return false;
		}
	}

	// isCarInParking ( return true if the speed is 0)
	public boolean isCarInParking() {
		return this.speed == 0;
	}

	// IsSafeDrive ( return true if it is not overSpeed and seatbelt is fastened)

	public boolean isSafeDrive() {
		if (!isOverSpeed() && isSeatBeltFastened) {
			return true;
		} else {
			return false;
		}
	}

	// Display ( this will display, all the values of Car, with if it is safeDrive
	// or not)
	public void display() {
		System.out.println("Plate Number: " + this.plateNumber);
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("xLocation: " + xLocation);
		System.out.println("yLocation: " + yLocation);
		System.out.println("Speed: " + speed);
		System.out.println("isSeatBelt fastened: " + isSeatBeltFastened);
		System.out.println("is it SafeDriver or not: " + isSafeDrive());
	}
}
