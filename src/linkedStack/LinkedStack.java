package linkedStack;

import java.util.EmptyStackException;
/**
 * A class of stacks whose entries are stored in a chain of nodes.
 */

public class LinkedStack {
	private Node topNode; // References the first node in the chain

	public LinkedStack() {
		topNode = null;
	} // end default constructor

	//Method to push newEntry into stack
	public void push(int newEntry) {
		//Create a new Node with given entry
		Node newNode=new Node(newEntry);
		//if no elements in list add newNode at top Of stack
		if(topNode==null)
		{
			topNode=newNode;
		}
		else//otherwise 
		{
			//change newNode next pointer to topNode
			newNode.next=topNode;
			//Make newNode as topNode
			topNode=newNode;
		}
		
	} // end push

	//method to peek value from stack
	public int peek() {
		//if no values in stack(i.e EMPTY) throw EmptyStackException
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		else//otherwise return entry present in topNode
		{
			return topNode.entry;
		}
	} // end peek

	//Method to remov and return(POP) top value from Stack
	public int pop() {
		//if no values in stack(i.e EMPTY) throw EmptyStackException
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			//get the entry present in topNode
			int popData=topNode.entry;
			//Change the topNode to its next Node
			topNode=topNode.next;
			//return popData
			return popData;
		}
	} // end pop

	//Method to check stack is Empty or not
	public boolean isEmpty() {
		//if topNode is null return true otherwise return false
		return (topNode==null);
	} // end isEmpty

	//Method to clear the stack
	public void clear() {
		//just make topNode to null
		topNode=null;
	} // end clear

	/**
	 * Computes the sum of all the numbers in the stack. For example, the stack has
	 * 4 data entries: is 1 2 3 4 (1 is the top), the output of sum() is 1+2+3+4
	 */
	public int sum() {
		//initialize sum to 0
		int sum=0;
		//Node current to traverse the whole stack
		Node current=topNode;
		//look for all nodes in Stack
		while(current!=null)
		{
			//get the value of current Node
			int currentData=current.entry;
			//add currentData to sum
			sum+=currentData;
			//change the current position to its next Node
			current=current.next;
		}
		//return sum
		return sum;
	}
	/*
	 * Computes the sum of all the numbers in the stack. However, if two or more
	 * numbers in a row are equal, only add one of them. So, for example, if the
	 * stack contained 4, 1, 2, 2, 7, 2, 8, 8, 8, 4, then the numbers that would be
	 * added would be 4 + 1 + 2 + 7 + 2 + 8 + 4 = 28. Here 4 is the top of the
	 * stack.
	 */
	public int sumSkipDu() {
		// TODO
		//initialize sum to 0;
		int sum=0;
		//initialize currentData to hold value of each Node
		int currentData = 0;
		////Node current to traverse the whole stack
		Node current=topNode;
		//for all nodes in stack except last node
		while(current.next!=null)
		{
			//get the value of current Node
			currentData=current.entry;
			//add currentData to sum
			sum+=currentData;
			//change the current position to its next Node
			current=current.next;
			//skip all nodes which have duplicate values to currentData consectively
			while(current.entry==currentData)
			{
				current=current.next;
			}
		}
		//for last node in stack
		//if it is not same as its previous node data 
		if(currentData!=current.entry)
		{
			sum+=current.entry;//add its value to sum
		}
		//return sum
		return sum;
	}

	/*
	 * A palindrome reads the same forward and backward. For example, 12321 is a
	 * palindrome, 257494752 is also a palindrome. Use a stack to determine if a
	 * given string is a palindrome.
	 */
	public boolean isPalindrome(int[] inputInteger) {
		
		int start=0;//hold index from starting
		int end=inputInteger.length-1;//hold index from ending
		//do while start index is not exeding end index
		while(start<end)
		{
			//if data present at start index is not same as data present at end index
			if(inputInteger[start]!=inputInteger[end])
			{
				//return false
				return false;
			}
			//increment the start index
			start++;
			//decrement the end index
			end--;
		}
		//return true as it is palindrome
		return true;
	}

	//private Class Node
	private class Node {
		//data members
		int entry;//value of Node
		Node next;//Pointer to next Node
		//Constructor to create Node Object 
		public Node(int entry)
		{
			this.entry=entry;
			this.next=null;
		}
	} // end Node
} // end LinkedStack