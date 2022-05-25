package lectures;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		// declaring array with size 12 based on given example program
		int numbers[] = new int[12];
		// getting into array random values from 1-100 by calling method
		numbers = getRandomArray(numbers);
		// printing array by calling printArray method
		printArray(numbers);

		// aksing user to enter key to search
		System.out.println("Enter key to search: ");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		// serching key in array by calling searchNumber method
		System.out.println(searchNumber(numbers, key));
		input.close();
	}

	// mwthod to generate and store random numbers from 1-100
	public static int[] getRandomArray(int[] numbers) {

		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100) + 1;
		}
		return numbers;
	}

	// method to print array values along with indices
	public static void printArray(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + " " + numbers[i]);
		}
	}

	// method to check whether a key present in array or not
	public static boolean searchNumber(int[] numbers, int key) {

		// look for all values in array
		for (int i = 0; i < numbers.length; i++) {
			// if current value is key return true
			if (numbers[i] == key) {
				return true;
			}
		}
		// return false if key not found
		return false;
	}
}
