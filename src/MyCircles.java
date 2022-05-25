import java.util.Scanner;

public class MyCircles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// to store the 6 radius in inches
		int radius[] = new int[6];
		// to store the 6 angles in degrees
		int angles[] = new int[6];

		// Getting inputs from user
		for (int i = 1; i <= 6; i++) {
			/*
			 * this conditional statements for the proper sentence formation to ask user to
			 * enter ith information
			 */

			// if i is 1 then get 1st circle information
			if (i == 1) {
				// Asking user to enter circle radius and store in radius array
				System.out.print(i + "st: Plese enter a radius(integer):");
				radius[i - 1] = sc.nextInt();

				System.out.print(i + "st: Plese enter a angle(in between 0 and 360):");
				angles[i - 1] = sc.nextInt();
			}
			// if i is 2 then get 2nd circle information
			else if (i == 2) {
				// Asking user to enter circle radius and store in radius array
				System.out.print(i + "nd: Plese enter a radius(integer):");
				radius[i - 1] = sc.nextInt();
				// Asking user to enter circle angle and store in angles array
				System.out.print(i + "nd: Plese enter a angle(in between 0 and 360):");
				angles[i - 1] = sc.nextInt();
			}
			// if i is 3 then get 3rd circle information
			else if (i == 3) {
				// Asking user to enter circle radius and store in radius array
				System.out.print(i + "rd: Plese enter a radius(integer):");
				radius[i - 1] = sc.nextInt();
				// Asking user to enter circle angle and store in angles array
				System.out.print(i + "rd: Plese enter a angle(in between 0 and 360):");
				angles[i - 1] = sc.nextInt();
			}
			// if i>3 get ith circle information
			else {
				// Asking user to enter circle radius and store in radius array
				System.out.print(i + "th: Plese enter a radius(integer):");
				radius[i - 1] = sc.nextInt();
				// Asking user to enter circle angle and store in angles array
				System.out.print(i + "th: Plese enter a angle(in between 0 and 360):");
				angles[i - 1] = sc.nextInt();
			}
		}

		// printing header 
		System.out.println("\nRadius(inch)\tAngle(deg)\tAngle(rad)\tArcLength(inch)\tPolarArea(sq.inch)\n");
		// to hold total radius of all six circles
		double totalRadius = 0;
		for (int i = 0; i < 6; i++) {
			// get the radius from radius array
			int r = radius[i];
			// get the angle from angles array
			int d = angles[i];
			// convert angles in degrees to Radians
			double angleInRadians = d * (Math.PI / 180);
			// calculate arcLength
			double arcLenght = r * angleInRadians;
			// calculate polar Area
			double polarArea = 0.5 * (angleInRadians * r * r);
			// add current circle radius to totalRadius
			totalRadius += r;

			// form sentence with above values
			String sen = String.format("%d\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\n", r, d, angleInRadians, arcLenght, polarArea);
			// print the sentence
			System.out.println(sen);
		}

		// calculate average Radius
		double averageRadius = (totalRadius / 6);
		// print average radius
		System.out.println("The average of radius of all 6 circles is: " + averageRadius + " inches");
		sc.close();
	}
}
