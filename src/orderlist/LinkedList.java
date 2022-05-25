package orderlist;

public class LinkedList {

	//Inner class Node 
	static class Node {
		Node next;//points to next Node
		Order data;//Order in current Node

		//Constructor to create Node object
		public Node(Order data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;//node to point the starting node of list

	/*
	 * A constructor that takes an array of Order objects as an argument.
	 * The contents of the array are used to create Link objects that are 
	 * elements of the LinkedList
	 */
	public LinkedList(Order[] array) {
		//look for all Orders in array
		for (int i = 0; i < array.length; i++) {
			//insert current Order into linked list
			insert(array[i]);
		}
	}

	//helper method to insert orders into list
	private void insert(Order order) {
		
		//create Node with given Order Object
		Node temp = new Node(order);
		
		if (head == null) //if no orders in list insert at head
		{
			head = temp;
		} else //otherwise insert at last
		{
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
		}
	}
	
	/*
	 * A "searchPriority" method that takes an integer argument and returns an integer value. 
	 * The method searches the LinkedList object for Order objects with priority values 
	 * that matches the methods integer argument. 
	 * It returns the number of Order objects that have a matching priority value.
	 * */
	public int searchPriority(int priority)
	{
		int count=0;//initialize count to 0
		Node current=head;
		//look for all Orders in list
		while(current!=null)
		{
			//if current Order priority is same as given priority
			if(current.data.getOrderPriority()==priority)
			{
				count++;//increment
			}
			current=current.next;
		}
		return count;//return count
	}
	
	/*
	 * A "setToThree" method that takes no arguments and returns a void.
	 *  The method changes all of the priority values in your Order objects to 3.
	 */
	public void setToThree()
	{
		Node current=head;
		//look for all Orders in list
		while(current!=null)
		{
			//set the current order priority to 3 by using setter method
			current.data.setOrder_priority(3);
			current=current.next;
		}
	}
	
	/*
	 * A "getOrderArray" method that takes no arguments and returns an Order array. The Order array .
	 * contains the Order objects that are in the LinkedList.
	 * Make sure you extract that you extract the objects that are actually in the LinkedList
	 */
	public Order[] getOrderArray()
	{
		int count=0;//to hold how many orders in list
		Node current=head;
		//loop through list find how many orders in list
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		
		//create Order array with Size count
		Order[]array=new Order[count];
		int index=0;//index which is next place to insert
		current=head;
		//look for all Orders in list
		while(current!=null)
		{
			//put current order in array 
			array[index++]=current.data;
			current=current.next;
		}
		//return array
		return array;
	}
}
