import java.util.Scanner;

public class WithoutDuplicates {

	public static void main(String[] args) {
		// initialize array with size 2
		int array[] = new int[2];
		Scanner sc = new Scanner(System.in);
		// count to count how many elements present in array
		int count = 0;

		// Asking user to enter 25 values between 5 and 100
		System.out.println("* * * Enter 25 values between 5 to 100 * * *");

		for (int i = 1; i <= 25; i++) {
			// Asking user to enter element
			System.out.print("Element " + i + " : ");
			int num = sc.nextInt();
			// if entered value not in range
			if (num < 5 || num > 100) {
				System.out.println("Enter values in range.... ");
				i--;
			}
			// if value not in array
			else if (!contains(array, num)) {
				// if we reaches the array length
				if (count == array.length) {
					// expand array
					array = expand(array);
				}
				// add value to array
				array[count++] = num;
			}
		}

		// Printing array length of array after inserting values
		System.out.println("Array length: " + array.length);

		// printing values in array
		System.out.println("Array Elements are: ");
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}

	// Method to expand the array
	public static int[] expand(int[] array) {
		// current length of array
		int length = array.length;
		// create new array with length ((currentLength*3)/2)+1
		int newArray[] = new int[((length * 3) / 2) + 1];

		// Copy all old array values to new array
		System.arraycopy(array, 0, newArray, 0, length);

		// Assign new Array to old array reference
		array = newArray;
		// return expanded array
		return array;
	}

	// Method to check array contain value in array or not
	public static boolean contains(int[] array, int num) {
		// Look for all values in array
		for (int i = 0; i < array.length; i++) {
			// if current element equals to given number return true
			if (array[i] == num) {
				return true;
			}
		}
		// if not found return false
		return false;
	}

}
