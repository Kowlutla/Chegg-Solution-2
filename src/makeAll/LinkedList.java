package makeAll;

//LinkedList Class which keeps the sequence of ListNode Objects
public class LinkedList {

	// to store the head of list
	ListNode head;

	// Method to insert ListNode Object at the beggining of list
	public void insert(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// Method to set every node in list to 42
	public void setEveryNode42() {
		// if No ListNode objects in list(List is empty) do nothing
		if (head == null) {
			return;
		}

		// to traverse the every node in list
		ListNode current = head;
		// For all nodes in List
		while (current != null) {
			// set the current node value to 42
			current.data = 42;
			// change the current pointer to next Node in list
			current = current.next;
		}
	}

	// Method to print the all ListNode Objects in List
	public void printList() {
		if (head == null) {
			return;
		}

		System.out.print("list -> ");
		ListNode current = head;
		while (current.next != null) {
			System.out.print("[" + current.data + "]" + " -> ");
			current = current.next;
		}
		System.out.print("[" + current.data + "]" + " /");
	}

	// main method (Driver Code)
	public static void main(String[] args) {

		// Create a LinkedList Object
		LinkedList list = new LinkedList();
		// insert some elements into list
		list.insert(16);
		list.insert(9);
		list.insert(8);
		list.insert(5);
		list.insert(3);
		list.insert(1);
		list.insert(34);
		list.insert(21);
		list.insert(41);
		list.insert(54);
		list.insert(12);
		list.insert(7);

		// printing the LinkedList
		System.out.println("Initial List is: ");
		list.printList();
		// calling setEveryNode42 method and set every node value to 42
		list.setEveryNode42();
		// printing the List after setting all values to 42
		System.out.println("\nAfter setting each node value to 42,List is: ");
		list.printList();
	}
}
