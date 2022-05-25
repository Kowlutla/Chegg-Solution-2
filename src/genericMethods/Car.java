package genericMethods;

public class Car {
	
	//Car class data
	private int plateNo;
	private String brand;
	//Constructor
	public Car(int plateNo, String brand) {
		this.plateNo = plateNo;
		this.brand = brand;
	}
	//getters
	public int getPlateNo() {
		return plateNo;
	}
	public String getBrand() {
		return brand;
	}
	
	//Setters
	public void setPlateNo(int plateNo) {
		this.plateNo = plateNo;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Car [plateNo=" + plateNo + ", brand=" + brand + "]";
	}
}
