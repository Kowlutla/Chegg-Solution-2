import java.util.ArrayList;

public class CommonElements {

	// Method to return common elements in two sorted arrays
	public static int[] common(int[] a, int[] b) {
		int m = a.length;// length of array a
		int n = b.length;// length of array b
		// create ArrayList to hold common elements
		ArrayList<Integer> temp = new ArrayList<>();
		int i = 0;// points the index of array a
		int j = 0;// points the index of array b

		// check for all elements in both arrays
		while (i < m && j < n) {

			// if array 'a' current element is less than array 'b' current element
			if (a[i] < b[j])
				i++;// increment the array 'a' index
			// if array 'b' current element is less than array 'a' current element
			else if (b[j] < a[i])
				j++;// increment the array 'b' index
			// if elements of array 'a' and array 'b' same
			else {
				temp.add(b[j]);// add elment to list
				i++;// increment the array 'a' index
				j++;// increment the array 'b' index
			}
		}

		// store the elements in array list to commonArray
		int commonArray[] = temp.stream().mapToInt(k -> k).toArray();
		// return commonArray
		return commonArray;
	}

	// Main method (Driver Code)
	public static void main(String[] args) {

		// take two sorted arrays
		int a[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int b[] = { 3, 6, 9, 12, 15, 18, 21 };

		// store the common elements by calling common method
		int temp[] = common(a, b);

		// print first array
		System.out.println("First Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// print second array
		System.out.println("\nSecond Array: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		// print common elements
		System.out.println("\nCommon Elements: ");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
	}
}
