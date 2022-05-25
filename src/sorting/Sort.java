package sorting;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Sort {
	public static int numOfComps = 0, numOfSwaps = 0;

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(new File("a.txt"));// your text file here

			int[] values = new int[100];
			int i = 0;
			while (scanner.hasNextInt()) {
				values[i++] = scanner.nextInt();
			}
			int n = i;
			int arr[] = new int[n];
			int arr1[]=new int[n];//for insertionSort
			for (i = 0; i < n; i++)
			{
				arr[i] = values[i];
				arr1[i]=values[i];
			}

			System.out.println("\n\nQuick Sort:");
			// Display the array's contents.
			System.out.println("\nOriginal order: ");
			for (i = 0; i < n; i++)
				System.out.print(arr[i] + " ");

			// Sort the array.
			quickSort(arr, n);

			// Display the array's contents.
			System.out.println("\nSorted order: ");
			for (i = 0; i < n; i++)
				System.out.print(arr[i] + " ");

			System.out.println("\n\nNumber of comps = " + numOfComps);
			System.out.println("Number of swaps = " + numOfSwaps);

			numOfComps = 0;
			numOfSwaps = 0;

			System.out.println("\n\nShell Sort:");
			// Display the array's contents.
			System.out.println("\nOriginal order: ");
			for (i = 0; i < n; i++)
				System.out.print(values[i] + " ");

			// Sort the array.
			shellSort(values, n);

			// Display the array's contents.
			System.out.println("\nSorted order: ");
			for (i = 0; i < n; i++)
				System.out.print(values[i] + " ");

			System.out.println("\n\nNumber of comps = " + numOfComps);
			System.out.println("Number of swaps = " + numOfSwaps);

			System.out.println();
			
			
			numOfComps = 0;
			numOfSwaps = 0;

			System.out.println("\nInsertion Sort:");
			// Display the array's contents.
			System.out.println("\nOriginal order: ");
			for (i = 0; i < n; i++)
				System.out.print(arr1[i] + " ");

			// Sort the array.
			insertionSort(arr1, n);

			// Display the array's contents.
			System.out.println("\nSorted order: ");
			for (i = 0; i < n; i++)
				System.out.print(values[i] + " ");

			System.out.println("\n\nNumber of comps = " + numOfComps);
			System.out.println("Number of swaps = " + numOfSwaps);

			System.out.println();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void quickSort(int array[], int n) {
		doQuickSort(array, 0, n - 1);
	}

	private static void doQuickSort(int array[], int start, int end) {
		int pivotPoint;

		if (start < end) {
			// numOfComps++;

			// Get the pivot point.
			pivotPoint = partition(array, start, end);

			// Sort the first sub array.
			doQuickSort(array, start, pivotPoint - 1);

			// Sort the second sub array.
			doQuickSort(array, pivotPoint + 1, end);
		}
	}

	private static int partition(int array[], int start, int end) {
		int pivotValue; // To hold the pivot value
		int endOfLeftarray; // Last element in the left sub array.
		int mid; // To hold the mid-point subscript

		// Find the subscript of the middle element.
		// This will be our pivot value.
		mid = (start + end) / 2;

		// Swap the middle element with the first element.
		// This moves the pivot value to the start of
		// the array.
		swap(array, start, mid);

		// Save the pivot value for comparisons.
		pivotValue = array[start];

		// For now, the end of the left sub array is
		// the first element.
		endOfLeftarray = start;

		// Scan the entire array and move any values that
		// are less than the pivot value to the left
		// sub array.
		for (int scan = start + 1; scan <= end; scan++) {

			if (array[scan] < pivotValue) {
				endOfLeftarray++;
				swap(array, endOfLeftarray, scan);

				numOfSwaps++;
			}
			numOfComps++;
		}

		// Move the pivot value to end of the
		// left sub array.
		swap(array, start, endOfLeftarray);

		// Return the subscript of the pivot value.
		return endOfLeftarray;
	}

	private static void swap(int[] array, int a, int b) {
		int temp;

		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

//shell sort

	public static void SegmentedInsertionSort(int[] array, int N, int gap) {
		for (int index = gap; index < N; index++) {
			int temp;
			int j = index - gap;
			while (j >= 0) {
				numOfComps++;
				if (array[j] > array[j + gap]) {
					temp = array[j];
					array[j] = array[j + gap];
					array[j + gap] = temp;
					j = j - gap;
					numOfSwaps++;
				} else
					j = -1;
			}
		}
	}

	public static void shellSort(int[] array, int n) {
		int N = n;
		int gap = N / 2;
		while (gap > 0) {
			SegmentedInsertionSort(array, N, gap);
			gap = gap / 2;
		}
	}
	
	
    public static void insertionSort(int[] array,int n) {
        
        for(int i = 1; i < n; i++) {
        
          int j = i;      
                
          // compare i with sorted elements and insert it
          // sorted elements: [0..i-1]
          while (j > 0 && array[j] < array[j - 1]) {
            
            int temp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = temp;
            
            numOfSwaps++;
            numOfComps++;  // loop condition true
            j--;
          }
          numOfComps++; // checking loop condition when false
        }
    }
}