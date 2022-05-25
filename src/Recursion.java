public class Recursion {

	/**
	 * A MinMax object stores both minimum value and a maximum value.
	 */
	static class MinMax {
		// Instance variables are public for easy access
		public int min = Integer.MAX_VALUE; // Initialize as largest possible int
		public int max = Integer.MIN_VALUE; // Initialize as smallest possible int

		/**
		 * Constructor that uses default values
		 */
		public MinMax() {
		}

		/**
		 * Constructor that accepts initial min and max, for convenience
		 */
		public MinMax(int min, int max) {
			if (min > max) {
				// Make sure client doesn't initialize backward
				throw new IllegalArgumentException("Cannot initialize min to be " + "greater than max");
			}
			this.min = min;
			this.max = max;
		}

		/**
		 * Convert to a string for convenient printing
		 */
		@Override
		public String toString() {
			return "Min: " + min + "\tMax: " + max;
		}
	}

	/**
	 * Returns the nth element of the Fibonacci sequence using recursion Fibonacci
	 * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ....
	 */
	public static long fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1);
	}

	/**
	 * Reverses the order of the objects in an array using recursion
	 * 
	 * @param <T>
	 */
	public static <T> void reverse(T[] a) {
		reverseUtil(a, 0, a.length - 1);

	}
	//Helper method to reverse an array
	private static <T> void reverseUtil(T[] a, int start, int end) {
		if (start < end) {
			// swap elements a[i],a[j]
			swap(a, start, end);
			reverseUtil(a, start + 1, end - 1);
		}
	}

	/**
	 * Swaps two indexes in the array. Useful for reverse.
	 * 
	 * @param <T>
	 */
	static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	/**
	 * Determines the minimum and maximum element of an array of ints, using divide
	 * & conquer recursion
	 */
	public static MinMax findMinMax(int[] nums) {
		// TODO: Complete this method using D&C recursion (may need a helper method)
		MinMax p = new MinMax();
		findMinMaxUtil(nums, 0, nums.length - 1, p);
		return p;

	}
	//Helper Method to find min and max in array
	private static void findMinMaxUtil(int[] nums, int left, int right, MinMax p) {
		// if array contains only one element
		if (left == right) // common comparison
		{
			if (p.max < nums[left]) { // comparison 1
				p.max = nums[left];
			}
			if (p.min > nums[right]) { // comparison 2
				p.min = nums[right];
			}
			return;
		}
		// if array contains only two elements
		if (right - left == 1)// common comparison
		{
			if (nums[left] < nums[right])// comparison 1
			{
				if (p.min > nums[left]) { // comparison 2
					p.min = nums[left];
				}

				if (p.max < nums[right]) { // comparison 3
					p.max = nums[right];
				}
			} else {
				if (p.min > nums[right]) { // comparison 2
					p.min = nums[right];
				}

				if (p.max < nums[left]) { // comparison 3
					p.max = nums[left];
				}
			}
			return;
		}
		// find mid element
		int mid = (left + right) / 2;
		
		// recur for left sub-array
		findMinMaxUtil(nums, left, mid, p);
		
		// recur for right sub-array
		findMinMaxUtil(nums, mid + 1, right, p);
	}
}