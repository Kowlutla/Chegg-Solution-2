package com.chegg.linkedlist15082020;

//SingleLinkedList Class
public class SingleLinkedList {

	// istance variables
	MyNode head;
	MyNode tail;

	// method that creates the MyNode and add at the end of LinkedList
	public void insert(int n) {
		// creates the MyNode
		MyNode newMyNode = new MyNode(n);
		// if No MyNodes in List
		if (head == null) {
			head = newMyNode;
		}
		// If List have some MyNodes,set tail nextMyNode as newMyNode
		else {
			tail.setNext(newMyNode);
		}
		// Make newMyNode as tail
		tail = newMyNode;
	}

	// Method to print all values in LinkedList
	public void print() {
		MyNode current = head;
		while (current.getNext() != null) {
			System.out.print(current.getNumber() + " -> ");
			current = current.getNext();
		}
		System.out.println(current.getNumber());
	}

	/*
	 * Method that returns true if all values of nodes have single Digit Otherwise
	 * return false
	 */
	public boolean oneDigit() {
		MyNode current = head;
		// look for all numbers in list
		while (current != null) {
			// get the value of current MyNode
			int temp = current.getNumber();
			// if value is not digit return false
			if (temp > 9 || temp < -9) {
				return false;
			}
			current = current.getNext();
		}
		// return true if all values in linkedlist have single digit
		return true;
	}

	// method to reverse the Original LinkedList iteratively
	public void iterativeReverse() {
		MyNode current = head;
		tail = head;
		MyNode prev = null;
		MyNode next = null;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

	// Method that calls private method recursiveReverse(MyNode current)
	public void recursiveReverse() {
		tail = head;
		recursiveReverse(head);
	}

	// Method to reverse the Original LinkedList recursively
	private void recursiveReverse(MyNode current) {
		if (current == null) {
			head = current;
			return;
		}
		// last node or only one node
		if (current.getNext() == null) {
			head = current;
			return;
		}
		recursiveReverse(current.getNext());
		// change references for middle chain
		current.getNext().setNext(current);
		current.setNext(null);
	}
}
