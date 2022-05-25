package com.chegg.linkedlistSum;

public class TestSingleLinkedList {
	public static void main(String[] args) {

		// Creating two linkedList objects
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();

		list1.insert(3);
		list1.insert(4);
		list1.insert(2);

		list2.insert(4);
		list2.insert(6);
		list2.insert(5);

		// creating linkedList object for sum
		SingleLinkedList sum1 = new SingleLinkedList();
		sum1.head = list1.addTwoNumbers(list1.head, list2.head);
		// printing list1
		System.out.println("List1: ");
		list1.print(list1.head);
		// printing list2
		System.out.println("List2: ");
		list2.print(list2.head);
		System.out.println("Sum List: ");
		sum1.print(sum1.head);
//------------------------------------------------------------------
		System.out.println("---------------------------------------------");
		// Creating two linkedList objects
		SingleLinkedList list3 = new SingleLinkedList();
		SingleLinkedList list4 = new SingleLinkedList();

		list3.insert(4);
		list3.insert(6);
		list3.insert(5);

		list4.insert(0);

		// creating linkedList object for sum
		SingleLinkedList sum2 = new SingleLinkedList();
		sum2.head = list3.addTwoNumbers(list3.head, list4.head);
		// printing list1
		System.out.println("List3: ");
		list1.print(list3.head);
		// printing list2
		System.out.println("List4: ");
		list2.print(list4.head);
		System.out.println("Sum List: ");
		sum1.print(sum2.head);
	}
}
