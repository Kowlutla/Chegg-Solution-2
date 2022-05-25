package lectures;

import java.util.Random;

public class Main3 {

	public static void main(String[] args) {

		// declaring array with size 12 based on given example program
		int numbers[] = new int[12];
		// getting into array random values from 1-100 by calling method
		numbers = getRandomArray(numbers);
		// printing array by calling printArray method
		printArray(numbers);

		// getting average of numbers by calling getAverage method
		System.out.printf("Average: %.4f\n", getAverage(numbers));
		// getting standard Deviation of numbers by calling getStandardDeviation method
		System.out.printf("Standard Deviation: %.4f\n", getStandardDeviation(numbers));
		// getting maximum in numbers by calling getMax method
		System.out.println("Maximum in numbers: " + getMax(numbers));
		// getting minimum in numbers by calling getMin method
		System.out.println("Minimum in numbers: " + getMin(numbers));
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

	// method to find average of array
	public static double getAverage(int numbers[]) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double average = sum / numbers.length;
		return average;
	}

	// method to calculate the standardDeviation of array elements
	public static double getStandardDeviation(int numbers[]) {
		double average = getAverage(numbers);
		double standardDeviation = 0;

		for (int num : numbers) {
			standardDeviation += Math.pow(num - average, 2);
		}

		return Math.sqrt(standardDeviation / numbers.length);
	}

	// method to find minimum in array
	public static int getMin(int numbers[]) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	// method to find maximum in array
	public static int getMax(int numbers[]) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
}
