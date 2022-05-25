import java.util.ArrayList;
import java.util.Collections;

//Point Class that implements Comparable<Point>
public class Point implements Comparable<Point> {

	// Two data fields x and y for representing a point
	private double x;
	private double y;

	// A no-arg constructor that constructs a point for (0, 0)
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	// A constructor that constructs a point with the specified x and y values
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Getter method for X
	public double getX() {
		return x;
	}

	// Getter method for Y
	public double getY() {
		return y;
	}

	// Override the equals method. Point p1 is said to be equal to point p2
	// if p1.x==p2.x and p1.y == p2.y.
	@Override
	public boolean equals(Object obj) {
		Point p1 = this;
		Point p2 = (Point) obj;

		return (p1.x == p2.x && p1.y == p2.y);
	}

	// Overrided hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	// compareTo method that sorts by distance from the origin in increasing order
	@Override
	public int compareTo(Point p2) {
		// distance of this Point from Origin
		double p1distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		// distance of p2 Point(argument) from Origin
		double p2distance = Math.sqrt(Math.pow(p2.x, 2) + Math.pow(p2.y, 2));

		if (p1distance > p2distance) {
			return 1;
		} else if (p1distance < p2distance) {
			return -1;
		} else {
			return 0;
		}
	}

	// main method
	public static void main(String[] args) {

		// creating 10 Point objects
		Point p1 = new Point(25, 14);
		Point p2 = new Point(10, 15);
		Point p3 = new Point(17, 13);
		Point p4 = new Point(17, 13);
		Point p5 = new Point(81, 19);
		Point p6 = new Point(25, 16);
		Point p7 = new Point(10, 11);
		Point p8 = new Point(15, 11);
		Point p9 = new Point(19, 10);
		Point p10 = new Point(13, 14);

		System.out.println("p3.equals(p4): " + p3.equals(p4));
		System.out.println("p3.equals(p5): " + p3.equals(p5));

		// creating list to hold Point Objects
		ArrayList<Point> list = new ArrayList<Point>();
		// adding 10 points Object to list
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);

		// printing Points in list before Sorting
		System.out.println("\n* * * Points before Sorting * * * ");
		for (Point p : list) {
			System.out.println("[" + p.getX() + "," + p.getY() + "]");
		}

		// sorting points based on distance from origin
		Collections.sort(list);
		// printing sorted list
		System.out.println("\n* * * Points after Sorting * * * ");
		for (Point p : list) {
			System.out.println("[" + p.getX() + "," + p.getY() + "]");
		}
	}
}
