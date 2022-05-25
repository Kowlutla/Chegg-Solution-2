package TwoDArrays;

import java.util.Random;

public class Problem1 {

	public static void main(String[] args) {

		// Declaring 2D array A With 5X5
		int A[][] = new int[5][5];
		Random r = new Random();

		// Filling array A with random values between 0-9
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				A[i][j] = r.nextInt(10);
			}
		}

		// Declaring 2D array B With 5X5
		int B[][] = new int[5][5];

		/*
		 * Filling array B such that rows of array A becomes columns of B columns of
		 * array A becomes rows of B
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				B[j][i] = A[i][j];
			}
		}

		// printing original matrix A
		System.out.println("Original Matrix:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		// printing Transpose matrix B
		System.out.println("\nTranspose of original Matrix:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(B[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
