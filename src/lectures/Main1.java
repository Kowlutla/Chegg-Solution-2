package lectures;

import java.util.Random;

public class Main1 {

	public static void main(String[] args) {

		// declaring array with size 12 based on given example program
		int numbers[] = new int[12];
		// getting into array random values from 1-100 by calling method
		numbers = getRandomArray(numbers);
		// printing array by calling printArray method
		printArray(numbers);
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
}
