package TwoDArrays;

import java.util.Random;
import java.util.Scanner;

/*
 * For All Cases Rows are starts from 0
 */
public class problem3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Initializing 2D array with size 10X10
		int array[][] = new int[10][10];

		// Filling array with random values between 0-99
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				array[i][j] = rand.nextInt(100);
			}
		}

		// Printing original 2D array
		System.out.println("Matrix is: ");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("* * * * * * * * * * * * * * *  * * * * * * *");
		// Asking user to enter key
		System.out.println("Enter Key to Search: ");
		int key = sc.nextInt();

		// checking whether key is present in matrix or not by calling method
		boolean found = findKey(array, key);
		if (found)// if key found
		{
			// counting how many times key occurred
			int count = numOfTimes(array, key);
			System.out.println(key + " Occured " + count + " times");

			// find and print where first time key found
			// (Assuming rows and columns start from 0)
			System.out.println("first Occures at: ");
			int startindexs[] = startIndexs(array, key);

			System.out.println("Row: " + startindexs[0] + "\t" + "Column: " + startindexs[1]);

			// find and print where last time key found
			// (Assuming rows and columns start from 0)
			System.out.println("Last Occures at: ");
			int lastindexs[] = lastIndexs(array, key);

			System.out.println("Row: " + lastindexs[0] + "\t" + "Column: " + lastindexs[1]);
		} else// if key not found in matrix
		{
			System.out.println(key + " not found in matrix");
		}
		sc.close();
	}

	// Method to find key is present in key or not
	public static boolean findKey(int[][] array, int key) {

		// Look for all elements in matrix
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == key) // if key found return found
				{
					return true;
				}
			}
		}
		return false;// return false if not found
	}

	// Method to find how many times key present in matrix
	public static int numOfTimes(int[][] array, int key) {

		int count = 0;// initialize count to 0
		// Look for all elements in matrix
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == key)// if key found increment count
				{
					count++;
				}
			}
		}
		return count;// return count
	}

	// Method to find starting position where key present
	public static int[] startIndexs(int[][] array, int key) {
		// Look for all element in matrix
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == key) // if key found return current row and column
				{
					return new int[] { i, j };
				}
			}
		}
		// if key no found return -1 -1 as row and column
		return new int[] { -1, -1 };
	}

	// Method to find ending position where key present
	public static int[] lastIndexs(int[][] array, int key) {

		// initially assign row and column as -1
		int row = -1;
		int col = -1;

		// Look for all elements in matrix
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				// if key found update row and col and proceed till end
				if (array[i][j] == key) {
					row = i;
					col = j;
				}
			}
		}
		// return row and column
		return new int[] { row, col };
	}
}
