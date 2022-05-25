package com.chegg.linkedlistSum;

//SingleLinkedList Class
public class SingleLinkedList {

	// Class Node
	class Node {
		// instance variables
		int data;
		Node next;

		// Constructor that initializes the instance variable number
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// istance variables head to hold start node of list
	Node head;

	// method that creates the Node and add at the starting of LinkedList
	public void insert(int n) {
		// creates the Node
		Node newNode = new Node(n);
		// if No Nodes in List
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// Method to print all values in LinkedList
	public void print(Node head) {
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current.data);
	}

	// Method to add two linked list numbers
	public Node addTwoNumbers(Node list1, Node list2) {
		// Create a new dummy head node for new list
		Node dummy_head = new Node(0);
		Node newList = dummy_head;
		int carry = 0;
		// for all values in list1 and list2
		while (list1 != null || list2 != null) {
			// get the current list1 value.consider 0 if list have no data
			int list1_value = (list1 != null) ? list1.data : 0;
			// get the current list2 value.consider 0 if list have no data
			int list2_value = (list2 != null) ? list2.data : 0;

			// add the list1 value,list2 value and carry
			int current_sum = list1_value + list2_value + carry;
			// get the new carry value
			carry = current_sum / 10;
			// get the last digit from current sum
			int last_digit = current_sum % 10;
			// create a new node with last digit
			Node newNode = new Node(last_digit);
			// add current newNode at the end of new list
			newList.next = newNode;

			// if list1 is not null change the position of list1 node
			if (list1 != null)
				list1 = list1.next;
			// if list2 is not null change the position of list2 node
			if (list2 != null)
				list2 = list2.next;
			// change the new list to its next position
			newList = newList.next;
		}

		// if any carry left ex:900+901 carry:1
		if (carry > 0) {
			// create a new node with carry
			Node newNode = new Node(carry);
			// add current newNode at the end of new list
			newList.next = newNode;
			// change the new list to its next position
			newList = newList.next;
		}
		return dummy_head.next;
	}
}
