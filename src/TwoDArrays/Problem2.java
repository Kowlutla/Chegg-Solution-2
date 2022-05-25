package TwoDArrays;

import java.util.Random;

public class Problem2 {

	public static void main(String[] args) {

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

		// printing largest element in array by calling method
		largestElement(array);
		// printing smallest element in array by calling method
		smallestElement(array);

		// printing largest element in each row of array by calling method
		System.out.println("\n* * * Largest element in each row * * * ");
		largestOfEachRow(10, array);

		// printing smallest element in each row of array by calling method
		System.out.println("\n* * * Smallest element in each row * * * ");
		smallestOfEachRow(10, array);
	}

	// Method to printing largest element in 2D array
	public static void largestElement(int array[][]) {

		// Initializing largest element as INT_MIN
		int largest_element = Integer.MIN_VALUE;

		// checking each element of matrix
		// if it is greater than largestElement,
		// update maxElement
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > largest_element) {
					largest_element = array[i][j];
				}
			}
		}

		// finally printing maxElement
		System.out.println("\nLargest element is Matrix: " + largest_element);
	}

	// Method to print smallest element in 2D array
	public static void smallestElement(int array[][]) {
		// Initializing smallest element as INT_MAX
		int smallest_element = Integer.MAX_VALUE;

		// checking each element of matrix
		// if it is greater than largest_element,
		// update largest_element
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < smallest_element) {
					smallest_element = array[i][j];
				}
			}
		}

		// finally return largest_element
		System.out.println("\nSmallest element is Matrix: " + smallest_element);
	}

	// Function to print largestOfEachRow in matrix
	// considering starting row is 0
	public static void largestOfEachRow(int rows, int[][] array) {
		int i = 0;

		// Initialize max to Integer.Min at beginning
		// of finding max element of each row
		int max = Integer.MIN_VALUE;
		// array hold largest element of each row
		int[] result = new int[rows];
		while (i < rows) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			result[i] = max;
			max = Integer.MIN_VALUE;
			i++;

		}

		// printing largest element of each row
		for (i = 0; i < rows; i++) {
			System.out.println("Maximum element in row " + i + " is : " + result[i]);
		}
	}

	// Function to print smallestOfEachRow in matrix
	// considering starting row is 0
	public static void smallestOfEachRow(int rows, int[][] array) {
		int i = 0;

		// Initialize min to Integer.MAX at beginning
		// of finding min element of each row
		int min = Integer.MAX_VALUE;
		// array hold smallest element of each row
		int[] result = new int[rows];
		while (i < rows) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
			}
			result[i] = min;
			min = Integer.MAX_VALUE;
			i++;

		}

		// printing smallest element of each row
		for (i = 0; i < rows; i++) {
			System.out.println("Minimum element in row " + i + " is : " + result[i]);
		}
	}
}
