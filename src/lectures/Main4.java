package lectures;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int len = input.nextInt();
		// declaring array with size given by user
		int numbers[] = new int[len];
		System.out.println("Enter elements into array: ");
		for (int i = 0; i < len; i++) {
			numbers[i] = input.nextInt();
		}
		// printing array by calling printArray method
		printArray(numbers);

		// asking user to enter key to search
		System.out.println("Enter key to search: ");
		int key = input.nextInt();

		// calling searchNumber method to search where key is present
		int result = searchNumber(numbers, key);
		// printing results
		if (result != -1) {
			System.out.println(key + " found at index " + result);
		} else {
			System.out.println(key + " not found");
		}
		input.close();
	}

	// method to print array values along with indices
	public static void printArray(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + " " + numbers[i]);
		}
	}

	// method to check whether a key present in array or not
	public static int searchNumber(int[] numbers, int key) {

		// look for all values in array
		for (int i = 0; i < numbers.length; i++) {
			// if current value is key return true
			if (numbers[i] == key) {
				return i;
			}
		}
		// return false if key not found
		return -1;
	}
}
