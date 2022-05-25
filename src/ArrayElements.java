

public class ArrayElements { 
	
	public static void NotHereAndThere(int A[], int B[]) 
	{ 

		int n=A.length;
		int m=B.length;
		int i = 0, j = 0, count = 0; 
		while (i < n && j < m) { 

			// If not common, print smaller 
			if (A[i] < B[j]) { 
				System.out.print(A[i++] + " ");
				count++;
			} 
			else if (B[j] < A[i]) { 
				System.out.print(B[j++] + " ");
				count++;
			} 

			// Skip common element 
			else { 
				i++; 
				j++; 
			} 
		} 

		// printing remaining elements 
		while (i < n) 
		{ 
			System.out.print(A[i++] + " "); 
			count++;
		} 
		while (j < m) { 
			System.out.print(B[j++] + " "); 
			count++;
		} 
		
		System.out.println("\nCount Of Not Here And There Values is: "+count);
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
//		int A[] = { 3,4,7,9,11}; 
//		int B[] = { 1,4,6,7,11}; 
//		NotHereAndThere(A, B); 
		
		int i=07;
		System.out.println(i);
	} 
} 

// This code is contributed by kowlutla
