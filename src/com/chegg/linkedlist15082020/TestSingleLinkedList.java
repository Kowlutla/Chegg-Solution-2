package com.chegg.linkedlist15082020;

import java.util.Scanner;
public class TestSingleLinkedList {
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		Scanner sc = new Scanner(System.in);
		// Asking user to enter intergers and enter -1 to stop
		System.out.print("Enter integer values or -1 to stop: ");
		while (true) {
			// get the integer from user
			int num = sc.nextInt();
			// if integer is -1 stop reading
			if (num == -1) {
				break;
			}
			// if any other integer insert into list
			else {
				list.insert(num);
			}
		}
		// printing list
		list.print();

		// Checking whether list contain all single digit values
		if (list.oneDigit()) {
			System.out.println("\nAll values in LinkedList are one-digit integers");
		} else {
			System.out.println("\nNot all values in LinkedList are one-digit integers");
		}

		// reversing LinkedList by calling recursiveReverse Method
		System.out.println("\nReversing the LinkedList using recursive method: ");
		list.recursiveReverse();
		// printing list
		list.print();

		// reversing LinkedList by calling iterativeReverse Method
		System.out.println("\nReversing the LinkedList again using iterative method: ");
		list.iterativeReverse();
		// printing list
		list.print();
	}
}
