package com.chegg.linkedlist15082020;

public class MyLinkedList {

	private MyNode head;
	// Constructor
	public MyLinkedList() {
		head = null;
	}

	// Method to add number at end of list
	public void add(int number) {
		MyNode newMyNode = new MyNode(number);
		if (head == null) {
			head = newMyNode;
			return;
		}
		MyNode current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newMyNode);
	}

	// Method to swap first and last nodes of list
	public void swapFirstLast() {
		MyNode current = head, temp = null, index = null;

		// If list is empty, then display the list as it is
		if (head == null) {
			return;
		} else {
			// After the loop, current will point to last element and index will point to
			// second last element
			while (current.getNext() != null) {
				index = current;
				current = current.getNext();
			}

			// If list contains only one node, then display list as it is
			if (head == current) {
				return;
			}
			// If list contains only two nodes, then swap the head node with current node
			else if (head.getNext() == current) {
				temp = head;
				// head will point to last node i.e. current
				head = current;
				// node next to new head will be the last node
				head.setNext(temp);
				;
				// MyNode next to last element will be null
				temp.setNext(null);
			} else {
				temp = head;
				// head will point to last node i.e. current
				head = current;
				// Detach the list from previous head and add it after new head
				head.setNext(temp.getNext());
				// Previous head will become last node of the list
				index.setNext(temp);
				// MyNode next to last element will be null
				temp.setNext(null);
			}
		}
	}

	// Utility method to print list
	public void printList() {
		MyNode current = head;
		while (current != null) {
			System.out.print(current.getNumber() + " ");
			current = current.getNext();
		}
	}

	// Main Method (to check functionality Of code)
	public static void main(String[] args) {

		// Create the list Object
		MyLinkedList list = new MyLinkedList();

		// Add numbers to list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);

		// Printing the list
		System.out.println("Original List: ");
		list.printList();

		// Calling method to swap firstLast MyNodes of list
		list.swapFirstLast();
		// printing list after swapping
		System.out.println("\n\nList After swapping First and Last Nodes: ");
		list.printList();
	}
}
