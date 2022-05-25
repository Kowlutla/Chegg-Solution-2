package question1;
public class Queue {
	// inner class Node
	private class Node {
		Student data;
		Node next;

		public Node(Student data) {
			this.data = data;
		}

	}
	private Node qFront;// front pointer
	private Node qRear;// rear pointer
	int size = 0;// to hold size of queue

	// Method to put object into queue
	public void enQueue(Object o) {
		Node temp = qRear;
		qRear = new Node((Student) o);
		// qRear.next=null;
		if (isEmpty()) {
			qFront = qRear;
		} else {
			temp.next = qRear;
		}
		size++;
	}

	// Method to dequeue object from Queue
	public Object deQueue() {

		if (!isEmpty()) {
			Object value = qFront.data;
			qFront = qFront.next;
			size--;
			return value;
		} else {
			System.out.println("No elements to remove........");
			return null;
		}
	}

	// Method to pick front object from queue
	public Object peek() {
		if (!isEmpty()) {
			return qFront.data;
		} else {
			System.out.println("No elements to peek");
			return -1;
		}
	}
	// method to return size of Queue
	public int getSize() {
		return size;
	}

	// Method to check queue is empty or not
	public boolean isEmpty() {
		return size == 0;
	}
}
