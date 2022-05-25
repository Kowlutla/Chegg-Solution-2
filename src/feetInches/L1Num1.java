package feetInches;

import java.util.Scanner;

public class L1Num1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Node tail = null;
		Node head = null;
		System.out.println("Please enter the number of feet and inches separated by space, enter 0 0 to quit");
		int feet = keyboard.nextInt();
		int inches = keyboard.nextInt();
		//while we enter 0 and 0 as feet and inches(Last values)
		while (feet != 0 || inches != 0) { // create a node and add to list

			//create a new FeetAndInches Object
			FeetAndInches newFeet=new FeetAndInches(feet, inches);
			Node newNode=new Node(newFeet);
			
			//if no Nodes in list  make newNode as head and tail
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else//append the newNode at the end of list
			{
				tail.next=newNode;//make tail Node next node as newNode
				tail=newNode;//change the tail pointer to newNode
			}
			System.out.println("Please enter the number of feet and inches separated by space, enter 0 0 to quit");
			feet = keyboard.nextInt();
			inches = keyboard.nextInt();
		}
		PrintList(head);
		keyboard.close();
	}

	public static void PrintList(Node head)
	{ 	Node curr=head; FeetAndInches m;
		while(curr !=null)
		{	
			m= (FeetAndInches) curr.item;
			System.out.println(m);
			curr=curr.next;
		}
	//end while
		}
}