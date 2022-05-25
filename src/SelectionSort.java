
public class SelectionSort {

	public static void main(String[] args) {
		// initializing temperatures array
		int temperatures[] = { 66, 77, 55, 81, 90, 87, 91 };

		// sorting temperatures array by calling selectionSort
		selectioSort(temperatures);

		// printing array of temperatures After sorting
		System.out.println("Temperatures After Sorting: ");
		for (int i = 0; i < temperatures.length; i++) {
			System.out.print(temperatures[i] + " ");
		}

	}

	// selectionSort method to sort array
	private static void selectioSort(int[] temperatures) {
		// One by one move boundary of unsorted sub array
		for (int i = 0; i < temperatures.length - 1; i++) {
			// Find the min_index_indeximum element in unsorted array
			int min_index_index = i;
			for (int j = i + 1; j < temperatures.length; j++) {
				if (temperatures[min_index_index] > temperatures[j]) {
					min_index_index = j;
				}
			}
			// Swap the found min_index_indeximum element with the first element
			int temp = temperatures[i];
			temperatures[i] = temperatures[min_index_index];
			temperatures[min_index_index] = temp;
		}
	}
}
