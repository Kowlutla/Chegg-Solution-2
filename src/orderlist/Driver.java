package orderlist;

import orderlist.LinkedList.Node;

public class Driver {

	public static void main(String[] args) {

		// creating Order objects
		Order o1 = new Order("Abf123", 1);
		Order o2 = new Order("Abf124", 2);
		Order o3 = new Order("Abf125", 3);
		Order o4 = new Order("Abf126", 1);
		Order o5 = new Order("Abf127", 2);

		// Creating Order array using above Order objects
		Order array[] = { o1, o2, o3, o4, o5 };

		// Create a linked list Object by passing above Order array
		LinkedList myLinkedList = new LinkedList(array);

		// Loop through the LinkedList (not the array) and display the Order objects
		// within it.
		System.out.println("* * * Displaying Order Objects through Linkedlist * * * ");
		Node current = myLinkedList.head;// getting starting node of list
		while (current != null) {
			System.out.println(current.data);// printing current Order
			current = current.next;// points to next Order in list
		}

		// Use the searchPriority method to find out how many Order objects in your list
		// that have a priority of 1. Display the number.
		System.out.println("\nNumber Of Orders With Priority 1 is: " + myLinkedList.searchPriority(1));

		// Use the setToThree method to change all of the Order objects to a priority of
		// 3.
		myLinkedList.setToThree();

		// Use the getOrderArray method to get an Object array from the LinkedList.
		Order[] temp = myLinkedList.getOrderArray();

		// Loop through the array (not the LinkedLIst) and display its contents.
		System.out.println("* * * Displaying Order Objects through array * * *");
		for (Order order : temp) {
			System.out.println(order);
		}
	}
}
