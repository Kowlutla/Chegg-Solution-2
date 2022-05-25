package lectures;

import java.util.Random;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// declaring array with size 12 based on given example program
		int numbers[] = new int[12];
		// getting into array random values from 1-100 by calling method
		numbers = getRandomArray(numbers);
		// printing array by calling printArray method
		printArray(numbers);

		System.out.println("Enter number to search: ");
		int key = input.nextInt();
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

	public static boolean searchNumber(int[] numbers, int key) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Number checking " + i + "th key " + numbers[i] + " key " + key);
			if (numbers[i] == key) {
				return true;
			}
		}
		return false;
	}
}
