package com.chegg.doublyLinkedList;

public class DoublyLinkedList {

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

	public void AddToHead(int data) {
		/*
		 * allocate node put in the data
		 */
		Node newNode = new Node(data);

		// If list is empty
		if (head == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;

		} else {
			// newNode will be added before head such that head prev will point to newNode
			head.prev = newNode;
			// newNode's next will point to head
			newNode.next = head;
			// newNode will become new head
			head = newNode;
		}

	}

	public void AddToTail(int data) {
		/*
		 * allocate node put in the data
		 */
		Node newNode = new Node(data);
		// If list is empty
		if (tail == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode's previous will point to tail
			newNode.prev = tail;
			// newNode will become new tail
			tail = newNode;
		}
	}

	//Method to print the contents Of List
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {

		//create new Object of DoublyLinkedList 
		DoublyLinkedList list = new DoublyLinkedList();
		//perform given operations
		list.AddToHead(10);
		list.AddToHead(20);
		list.AddToTail(30);
		list.AddToTail(40);

		//print the list
		list.print();
	}
}
