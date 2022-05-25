package com.chegg.binarySearch;

import java.util.Scanner;

/**
 * Use recursive binary search.
 *
 * @author Your Name
 */
public class BinarySearch2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arraySize; // how many items in the dataset?
		int searchValue; // what value should we try to find?

		// Get the size and search value.
		arraySize = sc.nextInt();
		searchValue = sc.nextInt();

		// TODO: Create sorted array of arraySize whole numbers going from zero to arraySize-1.
		Integer values[]=new Integer[arraySize];
		for(int i=0;i<arraySize;i++)
		{
			values[i]=i;
		}

		// TODO: Use binaryRecursive method in Search class to search for searchValue in array.
		int results=Search.binaryRecursive(values, 0, arraySize-1, searchValue);

		// TODO: Ouput results
		if(results!=-1)
		{
			System.out.printf("The index of value %d in the sorted set of %d items is %d\n", searchValue,arraySize,results);
		}
		else
		{
			System.out.printf("The value %d was not found in the sorted set of %d items\n",searchValue,arraySize);
		}
		sc.close();
	}
}