package shapes;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PolymorphismPractice {

	public static void main(String[] args) {
		/*
		 * Step 1 In the main method, initialize an ArrayList that holds objects of type
		 * Shape.
		 */
		ArrayList<Shape> list = new ArrayList<Shape>();

		/*
		 * Step 2 Let’s now fill the ArrayList with 5 Circles and 5 Rectangles (for a
		 * total of 10 objects). A for loop is definitely helpful in this step, and also
		 * consider using Math.random().
		 */
		for (int i = 0; i < 10; i++) {
			// Here alternatively creating Circle and Rectangle Objects
			Shape s;
			if (i % 2 == 0) {
				double radius = Math.random() * 100;
				double x = Math.random() * 100;
				double y = Math.random() * 100;
				s = new Circle(radius, x, y);
			} else {
				double height = Math.random() * 100;
				double width = Math.random() * 100;
				double x = Math.random() * 100;
				double y = Math.random() * 100;
				s = new Rectangle(height, width, x, y);
			}
			list.add(s);
		}

		/*
		 * Testing To test this step, you can use the ArrayList size() method to make
		 * sure it has a size of 10, or try printing out all 10 items in the ArrayList.
		 */
		System.out.println("* * * Printing List Objects for testing purpose * * * \n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// calling getInfo() method and print results
		System.out.println("* * * getInfo() method result * * * ");
		System.out.println(getInfo(list));

		// calling findCircles() method and print results
		System.out.println("* * * findCircles() method results * * * ");
		System.out.println(findCircles(list));
	}

	// Step 3 complete getInfo method as shown in instructions
	public static String getInfo(ArrayList<Shape> list) {
		// Formatter to format area and circumference to 2 decimal places
		DecimalFormat df = new DecimalFormat("0.00");
		StringBuilder sb = new StringBuilder();
		// for each method
		list.forEach((shape) -> sb.append(shape).append("Has area:").append(df.format(shape.calculateArea()))
				.append("\nHas circumference:").append(df.format(shape.calculateCircumference())).append("\n\n"));
		return sb.toString();
	}
	// Step 4 complete findCircles method as shown in instructions
	public static String findCircles(ArrayList<Shape> list) {

		StringBuilder sb = new StringBuilder();

		// for each method
		list.forEach((shape) -> {
			if (shape instanceof Circle)// if current shape is type of circle add to SB
			{
				sb.append(shape).append("\n");
			}
		});
		return sb.toString();
	}
}
