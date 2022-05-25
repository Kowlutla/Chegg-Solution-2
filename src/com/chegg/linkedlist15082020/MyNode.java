package com.chegg.linkedlist15082020;

//Class MyNode
public class MyNode {
	// instance variables
	private int number;
	private MyNode next;

	// Constructor that initializes the instance variable number
	public MyNode(int number) {
		this.number = number;
		this.next = null;
	}
	
	

	public void setNext(MyNode nextMyNode) {
		this.next = nextMyNode;
	}
	
	public MyNode getNext() {
		return next;
	}
	
	public void setNumber(int n) {
		this.number = n;
	}

	public int getNumber() {
		return number;
	}

	
}
