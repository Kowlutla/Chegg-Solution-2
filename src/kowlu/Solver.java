package kowlu;

import java.util.Random;

public class Solver {

	public static void main(String[] args) {

		final int SIZE = 1000000; // 1 million

		final int Instances = 20;

		int[][] TwoDimArray = new int[Instances][SIZE];

		Sort s = new Sort();

		for (int i = 0; i < Instances; i++) {

			s.initializeArray(TwoDimArray[i], SIZE);
			s.randomizeArray(TwoDimArray[i], SIZE);

		}

		long startTime, endTime;

		long timeForInsertionSort = 0;// to hold total execution time for Insertion Sort
		long timeForQuickSort = 0;// to hold total execution time for quick Sort
		long timeForRandomizedQuickSort = 0;// to hold total execution time for Randomized Quick Sort

		for (int i = 0; i < Instances; i++) {

			// two arrays of size SIZE to use in different sorting methods
			int temp1[] = new int[SIZE];
			int temp2[] = new int[SIZE];
			// copy all values to temp1 and temp2 arrays
			for (int j = 0; j < SIZE; j++) {
				temp1[j] = TwoDimArray[i][j];
				temp2[j] = TwoDimArray[i][j];
			}

			// calculating execution time of insertion sort for ith array
			// and add resulted time to timeForInsertionSort
			startTime = System.nanoTime();
			s.insertionSort(temp1, SIZE);
			endTime = System.nanoTime();
			timeForInsertionSort += ((endTime - startTime) / 1000000);

			// calculating execution time of quick sort for ith array
			// and add resulted time to timeForQuickSort
			startTime = System.nanoTime();
			s.quickSort(temp2);
			endTime = System.nanoTime();
			timeForQuickSort += ((endTime - startTime) / 1000000);

			// calculating execution time of Randomized Quicksort for ith array
			// and add resulted time to timeForRandomizedQuickSort
			startTime = System.nanoTime();
			s.RandomizedQuickSort(TwoDimArray[i]);
			endTime = System.nanoTime();

			timeForRandomizedQuickSort += ((endTime - startTime) / 1000000);
		}

		// printing execution for Each Sorting
		System.out.println("Duration Time for Insertion Sort in seconds:" + (timeForInsertionSort / 1000.0));
		System.out.println("Duration Time for Quick Sort in seconds:" + (timeForQuickSort / 1000.0));
		System.out
				.println("Duration Time for Randomized Quick Sort in seconds:" + (timeForRandomizedQuickSort / 1000.0));
	}
}
// end of Solver.java