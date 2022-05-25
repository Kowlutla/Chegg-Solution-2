import java.util.Scanner;

public class ThreeDimensional {
	public static void main(String[] args) {

		int x, y, z;
		Scanner sc = new Scanner(System.in);
		// Asking user to enter dimension x
		System.out.print("Enter X:");
		x = sc.nextInt();
		// Asking user to enter dimension y
		System.out.print("Enter Y:");
		y = sc.nextInt();
		// Asking user to enter dimension z
		System.out.print("Enter Z:");
		z = sc.nextInt();
		// printing dimensions
		System.out.printf("Dimensions are: x=%d y=%d and z=%d\n", x, y, z);

		// declaring 3D array with dimensions x,y and z
		int array[][][] = new int[x][y][z];
		// Asking user to enter x*y*z integers
		System.out.printf("Enter %d X %d X %d integers: ", x, y, z);
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int k = 0; k < z; k++) {
					array[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("\n* * * Array Elements * * * ");
		// printing 3D array with its index
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				for (int k = 0; k < z; k++)
					System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
		
		// initialize the count of positives,negatives
		int positives = 0, negatives = 0, zeros = 0;
		/*
		 * finding number of +ve numbers,-ve numbers and Zoros
		 */
		// Look for all elements in 3D array
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int k = 0; k < z; k++) {
					// get the current value
					int value = array[i][j][k];
					// if value is greater than 0 increment positives count by 1
					if (value > 0) {
						positives++;
					}
					// if value is less than 0 increment negatives count by 1
					else if (value < 0) {
						negatives++;
					}
					// if value is not +ve and not -ve then it is zero
					// increment the zero count by 1
					else {
						zeros++;
					}
				}
			}
		}
		// Printing results to screen
		System.out.println("Number of Positive Numbers in 3D array: " + positives);
		System.out.println("Number of Negative Numbers in 3D array: " + negatives);
		System.out.println("Number of Zeros in 3D array: " + zeros);
		sc.close();
	}
}
