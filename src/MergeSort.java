import java.util.Arrays;

/* Java program for Merge Sort */
class MergeSort {
	// Merges two sub arrays of nums[].
	// First sub array is nums[l..m]
	// Second sub array is nums[m+1..r]
	void merge(int nums[], int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = nums[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = nums[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second sub
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				nums[k] = L[i];
				i++;
			} else {
				nums[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			nums[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			nums[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts nums[l..r] using
	// merge()
	void sort(int nums[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first half(Divide)
			sort(nums, l, m);
			// Sort second half(Divide)
			sort(nums, m + 1, r);

			// Merge the sorted halves(Combine)
			merge(nums, l, m, r);
		}
	}

	// Driver method
	public static void main(String args[]) {
		// initializing array with some integers
		int nums[] = { 7, -5, 3, 2, 10, -45 };

		System.out.println("Original Array");

		System.out.println(Arrays.toString(nums));
		// creating MergeSort class Object to call sort method
		MergeSort ob = new MergeSort();
		// calling sort method by passing array,starting index and last index
		ob.sort(nums, 0, nums.length - 1);

		System.out.println("\nSorted Array");
		System.out.println(Arrays.toString(nums));
	}
}