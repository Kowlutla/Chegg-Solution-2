package com.chegg.sortedLinkedlIst;
//-----------------------------------------------------

class linkedList {

	aNode head; // Head of the linked list
	int size;

	linkedList() { // Constructor
		head = null;
		size = 0;
	}
	//-----------------------------------------------------

	public void insert_at_beginning(int value) {
		aNode newNode = new aNode(value); // create aNew node
		newNode.next = head;
		head = newNode;
		size++;
	}
	//-----------------------------------------------------

	public void insert_at_end(int value) {
		aNode newNode = new aNode(value); // create aNew node
		if (isEmpty()) {
			newNode.next = head;
			head = newNode;
			size++;
		} else {
			//find the last node
			aNode ptr;
			ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = newNode; // add the node to the end
			size++;
		}
	}
//-----------------------------------------------------

	public void insert_after(int value, int searchValue) {
		if (isEmpty()) {
			System.out.println("Linked List is empty, no way to insert " + value + " after " + searchValue);
		} else {
//find the node with searchValue
			aNode ptr;
			boolean found = false;
			ptr = head;
			while (ptr != null && found == false) {
				if (ptr.data == searchValue) {
					found = true;
				} else {
					ptr = ptr.next;
				}
			}
			if (ptr == null) {
				System.out.println("Did not find " + searchValue + "Nothing Inserted");
			} else {
				aNode newNode = new aNode(value); // create aNew node
				newNode.next = ptr.next;
				ptr.next = newNode; // add the node after the searchValue
				size++;
			}
		}
	}
	//-----------------------------------------------------
	// Delete the first node with the value

	public void delete(int deleteValue) {
		if (isEmpty()) {
			System.out.println("Linked List is empty, nothing to delete");
		} else {
			aNode deletePtr = head; // create a reference to head
			if (head.data == deleteValue) {
				head = head.next; // remove the head
				deletePtr = null; // make the node available for garbage collection.
				size--;
			} else {
				aNode prevPtr;
				deletePtr = prevPtr = head;
				boolean found = false;
				//find the value to be deleted
				while (deletePtr != null && found == false) {
					if (deletePtr.data == deleteValue) { // Read about the difference between == and .equals()
						found = true;
						prevPtr.next = deletePtr.next;
						deletePtr = null; // make deletePtr available to garbage collection
						size--;
					} else {
						prevPtr = deletePtr;
						deletePtr = deletePtr.next;
					}
				}
				if (found == false) {
					System.out.println("Not able to find/delete " + deleteValue + " in the Linked List");
				}
			}
		}
	}
	//-----------------------------------------------------

	public boolean isEmpty() {
		if (head == null) {
			return (true);
		} else {
			return (false);
		}
	}
	//-----------------------------------------------------

	public void print() {
		aNode ptr;
		ptr = head;
		System.out.print("Head--> ");
		while (ptr != null) {
			System.out.print(ptr.data + " --> ");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}
	//-----------------------------------------------------

	public int getSize() {
		return (size);
	}
	//-----------------------------------------------------

	public void freeAll() {

		aNode freePtr = head;
		while (head != null) {
			head = head.next;
			// the next two lines are unnecessary, but are included for
			// illustration of how memory is freed up
			//
			freePtr = null; // make the node available for garbage collector
			freePtr = head; // now let the freePtr to the new head
		}
		head = null;
		size = 0;
	}
	
	/*
	 *  insert_in_order() which accepts a number as its parameter and 
	 *  inserts that number in the linked list in an ascending (sorted) order
	 */
	
	//NOTE:To insert numbers into list we need to change type of data from char to int in class aNode
	public void insert_in_order(int n)
	{
		aNode newNode=new aNode(n);
		/* Special case for head node */
		if(head==null ||  head.data>=newNode.data)
		{
			newNode.next=head;
			head=newNode;
			size++;
			return;
		}
		
		/* Locate the node before point of insertion. */
		aNode current=head;
		while(current.next!=null && current.next.data<newNode.data)
		{
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
		size++;
	}
	
	
	//Driver(Main method)
	public static void main(String[] args) {
		
		//create linkedList Object
		linkedList list=new linkedList();
		//values to be inserted into list
		int values[]= {1, 5, 19, 7, 23, 17, 2};
		
		//insert all values into list using insert_in_order method
		for(int i=0;i<values.length;i++)
		{
			list.insert_in_order(values[i]);
		}
		
		//print the list
		list.print();
	}
}