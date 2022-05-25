import java.util.Arrays;
import java.util.HashSet;

public class WorkingWithArrays {

	private int values[];// declare instance variables

	public WorkingWithArrays(int[] initialValues) {
		this.values = initialValues;
	}

	/**
	 * Method to move all odd elements of array to 
	 * front of array. if no odd elements contain preserve the
	 * Order of elements 
	 */
	public void moveOddElements() {
		// variables
		int j = -1;

		// quick sort method
		for (int i = 0; i < values.length; i++) {

			// if array of element
			// is odd then swap
			if (values[i] % 2 == 1) {

				// increment j by one
				j++;

				// swap the element
				int temp = values[i];
				values[i] = values[j];
				values[j] = temp;
			}
		}

	}

	/**
	 * Method to check array contain duplicates or not
	 * @return true is contain duplicate otherwise false
	 */
	public boolean containsDuplicates() {

		// Create a HashSet to
		HashSet<Integer> set = new HashSet<Integer>();
		// for all elements in values
		for (Integer i : values) {
			// if current element already in set then true as it it duplicate
			if (set.contains(i)) {
				return true;
			}
			// otherwise add current element to set
			set.add(i);
		}
		// return false values contiain no duplicates
		return false;
		/*
		 * Using Java 8
		 * 
		 * long distinctCount=Stream.of(values).distinct().count(); 
		 * return values.length!=distinctCount;
		 */
	}

	// Helper method
	// toString to return values as string
	public String toString() {
		return Arrays.toString(values);
	}
}
