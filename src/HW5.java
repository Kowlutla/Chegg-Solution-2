
public class HW5 {

	public static void main(String[] args) {
		
		//creating array1
		int nums1[]= {10,3,5,6};
		//printing difference between max and min in array by calling method
		System.out.println("bigDiff({10,3,5,6}) --> "+bigDiff(nums1));
		
		//creating array2
		int nums2[]= {7,2,10};
		//printing difference between max and min in array by calling method
		System.out.println("\nbigDiff({7,2,10}) --> "+bigDiff(nums2));
		
		//creating array3
		int nums3[]= {11,2,9,4,1};
		//printing difference between max and min in array by calling method
		System.out.println("\nbigDiff({11,2,9,4,1}) --> "+bigDiff(nums3));
	}

	//Method to return difference between largest value and smallest values in array
	public static int bigDiff(int[]nums)
	{
		int max=nums[0];//consider starting value in array as maximum
		int min=nums[1];//consider starting value in array as minimum
	
		//Look for all values in array
		for(int i=1;i<nums.length;i++)
		{
			//get maximum value between max and current value and store in max
			max=Math.max(max, nums[i]);
			//get minimum value between min and current value and store in min
			min=Math.min(min, nums[i]);
		}
		
		//return difference between max and min
		return max-min;
	}
}
