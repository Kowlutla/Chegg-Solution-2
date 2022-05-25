
public class Random2DArray {
	public static void main(String[] args) {
		
		int arr[][] = new int[6][6];//creating twoD array with size 6x6
		int count=0;//number to add to array
		
		//Adding elements to arr
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j]=count;//add count to arr
				count++;//increment count
			}
		}
		//printing original array
		System.out.println("\nOriginal Array: \n");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}

		//create arr2 with 2x2 size
		int arr2[][] = new int[2][2];
		//assign center elements of arr to arr2
		arr2[0][0] = arr[2][2];
		arr2[0][1] = arr[2][3];
		arr2[1][0] = arr[3][2];
		arr2[1][1] = arr[3][3];
		//printing center elements 
		System.out.println("\nCenter of this array \n");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
