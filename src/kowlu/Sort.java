package kowlu;

import java.util.Random;

class Sort {

	// swap the ith element with the jth elements.
	private void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void initializeArray(int[] a, int size) {
		for (int i = 0; i < size; i++)
			a[i] = i;
	}

	public void insertionSort(int a[], int n) {
		for (int i = 0; i < n; i++) {
			int temp = a[i];
			int k = i - 1;
			while (k >= 0 && a[k] > temp) {
				a[k + 1] = a[k];
				k--;
			}
			a[k + 1] = temp;
		}
	}

// randomly swap two elements in a for SWAPTIMES times.
	public void randomizeArray(int[] a, int size) {
		final int SWAPTIMES = 10000;
		Random r = new Random();
		int j, k;
		for (int i = 0; i < SWAPTIMES; i++) {
			j = r.nextInt(size);
			k = r.nextInt(size);
			this.swap(a, j, k);
		}
	}

	public void heapSort(int[] arr, int size) {
		heapify(arr);
		while (size > 0) {
			int temp = arr[0];
			arr[0] = arr[size - 1];
			arr[size - 1] = temp;
			size--;
			heapi(arr, 0, size - 1);
		}

	}

	private void heapify(int[] arr) {
		int size = arr.length;
		for (int i = size / 2 - 1; i >= 0; i--) {
			heapi(arr, i, size - 1);
		}

	}

	private void heapi(int[] arr, int i, int size) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int s = i;
		if (left <= size && arr[left] > arr[i]) {
			s = left;
		}
		if (right <= size && arr[right] > arr[s]) {
			s = right;
		}
		if (i != s) {
			int temp = arr[i];
			arr[i] = arr[s];
			arr[s] = temp;
			heapi(arr, s, size);
		}
	}

	// method to sort the array in ascending array using quickSort
	public void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	// helper method to sort the array using recursion
	private void quickSort(int[] array, int begin, int end) {
		int pivotKey;
		// if begin index < end index
		if (begin < end) {
			pivotKey = partition(array, begin, end); // get the pivot index
			quickSort(array, begin, pivotKey - 1); // call quick sort to sort the list from begin to pivotKey - 1
			quickSort(array, pivotKey + 1, end); // call quick sort to sort the list from pivotKey+1 to end
		}
	}

	// helper method to partition part of an array, and return the index where the
	// pivot
	// ended up.
	private int partition(int[] array, int begin, int end) {

		int pivotkey = begin; // set pivotkey to begin i.e first element of array
		int pivot = array[begin]; // get the element at pivot key

		// loop from begin+1 to end
		for (int i = begin + 1; i <= end; i++) {
			// if ith element < pivot, swap elements at indices i and pivotkey+1
			if (array[i] < pivot) {
				swap(array, i, ++pivotkey);

			}
		}

		// after the loop, swap the elements at begin and pivotkey to place the pivot in
		// its correct position
		swap(array, begin, pivotkey);

		return pivotkey; // return the pivotkey
	}
	
		// Quick sort with random pivot
		public  void RandomizedQuickSort(int array[]) {
			RandomizedQuickSort(array, 0, array.length - 1);
		}

		//Helper method to Randomized Quick Sort
		private  void RandomizedQuickSort(int array[], int left, int right)

		{
			if (right - left <= 0)
				return;
			else {
				Random rand = new Random();
				//getting random pivot index between left and right indexes
				int pivotIndex = left + rand.nextInt(right - left + 1);
				swap(array, pivotIndex, right);
				int pivot = array[right];
				int partition = partitionIt(array, left, right, pivot);
				RandomizedQuickSort(array, left, partition - 1);
				RandomizedQuickSort(array, partition + 1, right);
			}
		}

		// method to partition the array with random pivot value
		private  int partitionIt(int array[], int left, int right, long pivot) {
			int leftPtr = left - 1;
			int rightPtr = right;
			while (true) {
				
				while (array[++leftPtr] < pivot);
				while (rightPtr > 0 && array[--rightPtr] > pivot);
				if (leftPtr >= rightPtr)
					break;
				else
					swap(array, leftPtr, rightPtr);
			}
			swap(array, leftPtr, right);
			return leftPtr;
		}
}

//end of Sort.java