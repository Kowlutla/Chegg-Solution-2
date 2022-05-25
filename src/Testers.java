import java.util.Arrays;

public class Testers {

	public static void main(String[] args) {

		// Test fib()
		long fibonacciResult = Recursion.fib(9);
		System.out.println("fib(9) expected: 34");
		System.out.println("fib(9) found: " + fibonacciResult);
		fibonacciResult = Recursion.fib(13);
		System.out.println("fib(13) expected: 233");
		System.out.println("fib(13) found: " + fibonacciResult);
		fibonacciResult = Recursion.fib(0);
		System.out.println("fib(0) expected: 0");
		System.out.println("fib(0) found: " + fibonacciResult);

		// Test reverse() for an integer array of even length (10)
		Integer[] intArray = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Before: " + Arrays.toString(intArray));
		Recursion.reverse(intArray);
		System.out.println("After: " + Arrays.toString(intArray));

		// Test reverse() for a double array of odd teslength (7)
		Double[] doubleArray = new Double[] { 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0 };
		System.out.println("Before: " + Arrays.toString(doubleArray));
		Recursion.reverse(doubleArray);
		System.out.println("After: " + Arrays.toString(doubleArray));

		// Test MinMax()
		int[] minMaxTest = { 0, 5, 2, 5, 7, 8, 6, -1, 44, 2, 5667, 95, 43, 22, 3527, -634, 7543 };
		Recursion.MinMax result = Recursion.findMinMax(minMaxTest);
		System.out.println("Expected:\n\tMin: -634\tMax: 7543");
		System.out.println("Found:\n\t" + result);

	}

}