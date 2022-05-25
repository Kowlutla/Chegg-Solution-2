import java.util.Scanner;

public class MaximumDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Asking user to enter decimal number1
		System.out.print("Enter decimal number 1: ");
		double number1 = sc.nextDouble();
		// Asking user to enter decimal number2
		System.out.print("Enter decimal number 2: ");
		double number2 = sc.nextDouble();
		// Asking user to enter decimal number3
		System.out.print("Enter decimal number 3: ");
		double number3 = sc.nextDouble();
		// Asking user to enter decimal number4
		System.out.print("Enter decimal number 4: ");
		double number4 = sc.nextDouble();

		// getting maximum of four decimal numbers by calling maximum4 method
		double max = maximum4(number1, number2, number3, number4);

		// Displaying maximum of four decimal numbers
		System.out.println("Maximum of four decimal numbers is: " + max);
		sc.close();
	}

	// method to return maximum of four decimal numbers
	public static double maximum4(double number1, double number2, double number3, double number4) {
		/*
		 * Single line answer Math.max(Math.max(Math.max(number1,
		 * number2),number3),number4)
		 */

		// get maximum of number1 and number2 and store in max
		double max = Math.max(number1, number2);
		// get maximum of max and number3 and store in max
		max = Math.max(max, number3);
		// get maximum of max and number4 and store in max
		max = Math.max(max, number4);
		// return max which is maximum of four decimal values
		return max;
	}
}
