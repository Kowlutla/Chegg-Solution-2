
public class Exercise11_01 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(1, 1.5, 1);
		triangle.setColor("yellow");
		triangle.setFilled(true);

		System.out.println(triangle);
		System.out.println("The area is " + triangle.getArea());
		System.out.println("The perimeter is " + triangle.getPerimeter());
		System.out.println(triangle);
	}
}

//Copy from Book(For this created own based on given class diagram)
class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject() {
		this.color = "white";
		this.filled = false;
		this.dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new java.util.Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return " Color= " + color + " Filled=" + filled + " dateCreated= " + dateCreated;
	}
}

//Implement it
class Triangle extends GeometricObject {
	// three double variables
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// no-arg constructor
	public Triangle() {
	}

	// constructor that creates triangle with specified sides
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// accessor method for all three sides
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// method to return the area of this triangle
	public double getArea() {
		double p = (side1 + side2 + side3) / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	// method to return the perimeter of this triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// toString method that returns a string description of triangle
	public String toString() {
		return "Triangle: side1=" + side1 + " side2=" + side2 + " side3=" + side3;
	}
}
