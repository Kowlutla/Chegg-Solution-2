import java.util.Random;
public class ArrayProblem {
	public static void main(String[] args) {

		// Fill the array
		int array[] = createArray();
		// print array using printArray Method
		printArray(array);
		// count the number of even numbers in the array using countEvens method
		int even = countEvens(array);
		// Print the number of even numbers in the array
		System.out.printf("There are %d even numbers in the array\n", even);
	}
	/*
	 * createArray that will create, fill and return an array of any size with
	 * random numbers in the range of 1 - 100.
	 */
	public static int[] createArray() {
		// For testing you should have the method fill 25 numbers
		int array[] = new int[25];
		Random r = new Random();
		for (int i = 0; i < 25; i++) {
			// generate random number between 1-100 and add to array
			array[i] = r.nextInt(100) + 1;
		}
		return array;
	}
	/*
	 * printArray that will print an array of any size. This method should take as
	 * an argument the array to print.
	 */
	public static void printArray(int array[]) {
		// look for all elements in array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);// print current element
		}
	}

	/*
	 * countEvens which will count and return the number of even numbers in the
	 * array. This method should take as an arrays as an argument.
	 */
	public static int countEvens(int array[]) {
		int count = 0;// initialize count to 0
		for (int i = 0; i < array.length; i++)// look for all elements in array
		{
			if (array[i] % 2 == 0)// if current number is even
			{
				count++;// increment count
			}
		}
		return count;// return count
	}
}
