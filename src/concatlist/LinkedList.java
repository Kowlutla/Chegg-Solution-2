package concatlist;

import java.text.DecimalFormat;

//LinkedList Class
public class LinkedList {

	Node head;
	int length = 0;

	// Method to insert character data into list
	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
		length++;
	}

	// method to print all characters in list
	public void traverse() {
		Node current = head;
		if (current == null) {
			System.out.println("No elements in list");
		} else {
			while (current.getNext() != null) {
				System.out.print(current.getData() + " = >");
				current = current.getNext();
			}
			System.out.println(current.getData());
			System.out.println();
		}
	}

	// Method to find given value in list
	public String find(int x) {

		int position = 0;// initialize position to 0
		Node current = head;// start from head node
		// Look for all nodes in list
		while (current != null) {
			++position;// increment the position
			// if current node value is given x and return its position
			if (current.getData() == x) {
				return "Found at node position " + position;
			}
			// look for next node in list
			current = current.getNext();
		}
		// if x not found return as not found
		return "Not Found";
	}

	// method to return average of values in linkedllist
	public String average() {
		// if no elements in list return as Empty
		if (head == null) {
			return "Empty";
		} else {
			double sum = 0;// to hold the sum of all values in list
			int len = 0;// to hold how many elements in list
			Node current = head;
			// traverse the complete list
			while (current != null) {
				// add current node data to sum
				sum += current.getData();
				// increment length
				len++;
				// change the current pointer to next pointer in list
				current = current.getNext();
			}

			// calculating average
			double avg = sum / len;
			// returning avg by formatting to 2 decimal places
			return "avg: " + String.format("%.2f", avg);
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(4);
		list.insert(1);
		list.insert(3);
		System.out.println(list.average());
	}
}
