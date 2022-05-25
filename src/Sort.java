import java.util.Random;

public class Sort {

	// swap the ith element with the jth elements.
	private void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// initialize the array a with elements from 0 to size-1.
	public void initializeArray(int[] a, int size) {
		for (int i = 0; i < size; i++) {
			a[i] = i;
		}
	}

	// display the elements in the array a, rowSize elements per row.
	public void displayArray(int[] a, int size) {
		int rowSize = 100;
		for (int i = 0; i < size; i++) {
			if (i % rowSize == 0) {
				System.out.println();
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
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

	// selectionSort
	public void selectionSort(int a[], int size) {
		int i, j, min, minIndex;
		for (j = 0; j < size - 1; j++) {// select jth element.
			minIndex = j;
			min = a[j];
			for (i = j + 1; i < size; i++) {
				if (a[i] < min) {
					minIndex = i;
					min = a[i];
				}
			}
			this.swap(a, j, minIndex);
		}
	}

	/* method to sort array using insertion sort */
	public void insertionSort(int a[]) {
		int n = a.length;
		for (int i = 1; i < n; ++i) {
			int key = a[i];
			int j = i - 1;

			/*
			 * Move elements of a[0..i-1], that are greater than key, to one position ahead
			 * of their current position
			 */
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
	}
	
	//method heapSort
	public void heapSort(int a[]) {
		int n = a.length;

		//build maxHeap
		buildMaxHeap(a);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			swap(a, 0, i);

			// call max maxHeapify on the reduced heap
			maxHeapify(a, 0, i);
		}
	}

	//method to buildMaxHeap
	public void buildMaxHeap(int a[]) {
		// Build heap (re arrange array)
		int n = a.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			maxHeapify(a, i, n);
	}

	// To maxHeapify a subtree rooted with node i which is
	// an index in a[]. n is size of heap
	void maxHeapify(int a[], int i, int n) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && a[l] > a[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && a[r] > a[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			swap(a,i,largest);

			// Recursively maxHeapify the affected sub-tree
			maxHeapify(a, largest,n);
		}
	}
}