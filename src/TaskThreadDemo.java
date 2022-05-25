
public class TaskThreadDemo {

	public static void main(String[] args) {
		// Create tasks
		Runnable printCircleArea = new ComputeArea('c', 10);
		Runnable printSquareArea = new ComputeArea('s', 15);

		// Create Threads
		Thread t1 = new Thread(printCircleArea);
		Thread t2 = new Thread(printSquareArea);

		// Start threads
		t1.start();
		t2.start();
	}
}

class ComputeArea implements Runnable {
	char type;// to hold type(square or circle)
	double side;// side or radius

	// Constructor to create object
	public ComputeArea(char type, double side) {
		this.type = type;
		this.side = side;
	}

	// Task for printing the area of specified Shape
	public void run() {
		// if provided shape type is triangle
		if (this.type == 'c') {
			double area = Math.PI * side * side;
			System.out.printf("Circle Area : %.3f\n", area);
		}
		// if provided shape type is square
		else if (type == 's') {
			double area = side * side;
			System.out.println("Square Area: " + area);
		}
	}
}