package rivers;

import java.util.ArrayList;

public class CTRivers {
	
	/*
	 * Prints all long rivers in the list. Print them in same order as 
	 * they were in the list . List can be empty or not*/
	void printLongRiversRec(River[] list, int n)
	{
		//if list is empty
		if(n==0)
		{
			System.out.println("No rivers in list");
			return;
		}
		//if list contain rivers
		System.out.println("* * * Long Rivers in list * * *");
		//look for all rivers in list
		for(int i=0;i<n;i++)
		{
			//check if current river is long or not using isLong() method
			//if long print it
			if(list[i].isLong())
			{
				System.out.println(list[i]);
			}
		}
	}
	/* Returns index for the river object with given name. 
	 * Returns -1 for unsuccessful search. 
	 * List can be empty or not.
	 * 
	 */
	int linearSearch(River[] list, int n, String name)
	{
		//if list is empty
		if(n==0)
		{
			return -1;
		}
		else
		{
			//look for all rivers in list
			for(int i=0;i<n;i++)
			{
				//if current river name matches given name return its index
				if(list[i].getName().equalsIgnoreCase(name))
				{
					return i;
				}
			}
		}
		//return -1 if river with provided name not in list
		return -1;
	}
	
	/*
	 * Returns ArrayList of rivers with length between min and max inclusive.
	 * If no such river was found,method 
	 * returns an empty Arraylist<River>. List can be empy or not.
	 */
	ArrayList <River> searchRange(River[] list, int n, int min, int max)
	{
		//create new ArrayList Object of to hold River Objects
		ArrayList<River>rivers=new ArrayList<River>();
		//Look for all rivers in list
		for(int i=0;i<n;i++)
		{
			//get the current river
			River r=list[i];
			//if river with length between min and max inclusive.
			if(r.getLength()>=min && r.getLength()<=max)
			{
				//add river to list
				rivers.add(r);
			}
		}
		//return ArrayList rivers
		return rivers;
	}
	
	void sortByNameRec(River[] list, int n)
	{
		sortByNameRecUtil(list,n,0);
	}
       
   
	// Recursive selection sort. n is size of a[] and index 
    // is index of starting element. 
    private void sortByNameRecUtil(River[] list, int n, int index) 
    { 
           
        // Return when starting and size are same 
        if (index == n) 
           return; 
       
        // calling minimum index function for minimum index 
        int k = minIndex(list, index, n-1); 
       
        // Swapping when index and minimum index are not same 
        if (k != index){ 
           // swap 
           River temp = list[k]; 
           list[k] = list[index]; 
           list[index] = temp; 
        } 
        // Recursively calling selection sort function 
        sortByNameRecUtil(list, n, index + 1); 
    } 

    // Return minimum index 
    private static int minIndex(River list[], int i, int j) 
    { 
        if (i == j) 
            return i; 
       
        // Find minimum of remaining elements 
        int k = minIndex(list, i + 1, j); 
       
        // Return minimum of current and remaining. 
        return (list[i].getName().compareToIgnoreCase(list[k].getName())>0)? i : k; 
    } 
    
    int binarySearchRec(River[] list, int first, int last, String name)
    {
    	if (last >= first) { 
            int mid = first + (last - first) / 2; 
  
            // If the given river name is present at the middle itself 
            if (list[mid].getName().compareToIgnoreCase(name)==0) 
                return mid; 
  
            // If element is given river than mid, then it can only 
            // be present in left sub list
            if (list[mid].getName().compareToIgnoreCase(name)>0) 
                return binarySearchRec(list, first, mid - 1, name); 
  
            // Else the element can only be present in right 
            // sublist 
            return binarySearchRec(list, mid + 1, last, name); 
        } 
  
        // We reach here when element is not present in array 
        return -1; 
    }
}
