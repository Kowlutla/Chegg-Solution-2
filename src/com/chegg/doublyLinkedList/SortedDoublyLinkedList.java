package com.chegg.doublyLinkedList;

public class SortedDoublyLinkedList {

	// Node of a doubly linked list
	private class Node {
		int data;
		Node next, prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node head;// refernce to the head node
	Node tail;// reference to the tail node

	public void Add(int data) {
		
		/*
		 * allocate node put in the data
		 */
		Node newNode = new Node(data);
		Node current;

		// if list is empty
		if (head == null)
			head = newNode;

		// if the node is to be inserted at the beginning
		// of the doubly linked list
		else if (head.data >= newNode.data) {
			newNode.next = head;
			newNode.next.prev = newNode;
			head = newNode;
		}

		else {
			current = head;

			// locate the node after which the new node
			// is to be inserted
			while (current.next != null && current.next.data < newNode.data)
				current = current.next;

			/* Make the appropriate links */
			newNode.next = current.next;

			// if the new node is not inserted
			// at the end of the list
			if (current.next != null)
				newNode.next.prev = newNode;

			current.next = newNode;
			newNode.prev = current;

		}
	}

	// Method to print the contents Of List
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {

		//create new Object of SortedDoublyLinkedList
		SortedDoublyLinkedList list = new SortedDoublyLinkedList();
		// perform given operations
		list.Add(10);
		list.Add(20);
		list.Add(30);
		list.Add(40);
		list.print();

	}
}
