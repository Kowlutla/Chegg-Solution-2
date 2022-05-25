import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {

		// Test case1
		int test1[] = { 5, 1, 2, 4, 3, 5 };
		int array1[] = easyAs123(test1);
		System.out.println("easyAs123([5, 1, 2, 4, 3, 5]) → " + Arrays.toString(array1));

		// Test case2
		int test2[] = { 1, 2, 9, 8, 3, 5, 3, 7, 1, 2, 6, 4 };
		int array2[] = easyAs123(test2);
		System.out.println("easyAs123([1, 2, 9, 8, 3, 5, 3, 7, 1, 2, 6, 4]) → " + Arrays.toString(array2));

		// Test case3
		int test3[] = { 3,3,1,2,4,5,1,2,6};
		int array3[] = easyAs123(test3);
		System.out.println("easyAs123([5, 5, 5]) → " + Arrays.toString(array3));
	}

	// Method eastAs123
	public static int[] easyAs123(int array[]) {
		int prev3Index = -1;// to store the index whose value is 3
		int n = array.length;
		// loop through array
		for (int i = 0; i < n - 2; i++) {
			// if there is 1 followed by 2 in array
			if (array[i] == 1 && array[i + 1] == 2) {
				// find the index where value is 3 from previous index of 3
				// temp to store the previous 3 index
				int temp = prev3Index;
				// from previous index of 3 to total array
				for (int j = 0; j < n; j++) {
					// if any value is 3
					if (array[j] == 3) {
						// store the index of 3
						if(j>prev3Index)
						{
							prev3Index = j;
							break;
							
						}
					}
				}
				// if we found 3
				if (prev3Index != temp) {
					// swap with i+2 element to make 1 2 3 series
					int k = array[i + 2];
					array[i + 2] = array[prev3Index];
					array[prev3Index] = k;
					prev3Index=i+2;
				}
			}
		}
		// return modified array
		return array;
	}

}