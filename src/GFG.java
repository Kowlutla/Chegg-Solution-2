// Java code for kth smallest element 
// in an array 

class GFG { 
	// Function to return k'th smallest 
	// element in a given array 
	public static int kthSmallest(Integer[] arr, 
								int k) 
	{ 
		int n=arr.length;
		for(int i=(arr.length/2)-1;i>=0;i--)
		{
			maxHeapify(arr,n,i);
		}
		

		for(int i=n-1;i>k;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			maxHeapify(arr,i,0);
		}
		
		return arr[n-k];
	} 

	private static void maxHeapify(Integer[] array, int n, int i) {

		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && array[left]>array[largest])
		{
			largest=left;
		}
		
		if(right<n && array[right]>array[largest])
		{
			largest=right;
		}
		
		if(largest!=i)
		{
			int temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			maxHeapify(array,n,largest);
		}
		
	}

	// driver program 
	public static void main(String[] args) 
	{ 
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 }; 
		int k = 2; 
		System.out.print(k+"'th smallest element is " + kthSmallest(arr, k)); 
	} 
} 

// This code is contributed by Chhavi 
