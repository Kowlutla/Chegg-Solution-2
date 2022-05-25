//class LinkedQueue to Store CustomerITD Objects as FIFO Order
public class LinkedQueue {

	// private Class Node
	private class Node {
		CustomerITD data;// data of type CustomerITD
		Node next;// to hold next pointer in Queue

		// Constructor to create Node
		public Node(CustomerITD data) {
			this.data = data;
			this.next = null;
		}

	}

	private Node front, rear;// hold starting and ending nodes in queue
	private int size = 0;// holds size of queue

	// Method to add CustomerITD to Queue
	public void enQueue(CustomerITD customer) {
		Node temp = rear;
		rear = new Node(customer);
		if (isEmpty()) {
			front = rear;
		} else {
			temp.next = rear;
		}
		size++;
	}

	// Method to remove CustomerITD from Queue
	public CustomerITD deQueue() {
		if (!isEmpty()) {
			CustomerITD value = front.data;
			front = front.next;
			size--;
			return value;
		} else {
			return null;
		}
	}

	//// Method to take first CustomerITD from Queue
	public CustomerITD peekFront() {
		if (!isEmpty()) {
			return front.data;
		} else {
			return null;
		}
	}

	// Method to get the size of queue
	public int size() {
		return size;
	}

	// Method to check name in Queue or not as first name or second name
	public boolean contains(String name) {
		Node temp = front;
		int i = 0;
		boolean found = false;
		while (i < size()) {
			CustomerITD c = temp.data;
			if (c.getFirstName().equalsIgnoreCase(name) || c.getLastName().equalsIgnoreCase(name)) {
				System.out.println(c);
				found = true;
			}
			temp = temp.next;
			i++;
		}
		return found;
	}
	// Method to check queue is empty or not
	public boolean isEmpty() {
		return size() == 0;
	}

	// Method to display contents of queue
	public void display() {
		Node temp = front;
		int i = 0;
		while (i < size()) {
			System.out.println(temp.data);
			temp = temp.next;
			i++;
		}
	}
}
