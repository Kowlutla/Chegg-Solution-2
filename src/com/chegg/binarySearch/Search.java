package com.chegg.binarySearch;

/**
 * Search algorithms
 *
 */
public class Search {

	public static <T extends Comparable<T>> int binaryRecursive(T[] values, int low, int high, T key) {
		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		int cmp = values[mid].compareTo(key);
		if (cmp < 0) {
			return binaryRecursive(values, mid + 1, high, key);
		} else if (cmp > 0) {
			return binaryRecursive(values, low, mid - 1, key);
		}
		return mid;
	}
}
