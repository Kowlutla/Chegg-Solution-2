
public class StringDLL {
	protected Node head;
	protected Node tail;
	protected int size;
	public StringDLL() {
		head = null;
		tail = null;
		size = 0;
	}
	public Node getHead() {
		return head;
	}
	public Node getTail() {
		return tail;
	}
	public void addFirst(String data) {
		// Create a new node
		Node newNode = new Node(data);
		// If list is empty
		if (head == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;
		}
		// Add newNode as new tail of the list
		else {
			// newNode will be added before head such that head's previous will point to
			// newNode
			head.previous = newNode;
			// newNode's next will point to head
			newNode.next = head;
			// newNode will become new head
			head = newNode;
		}
	}
	// Method to reversed ToString of list
	public String reverseToString() {
		String s = "";
		// start traversing from tail node to head
		Node current = tail;
		while (current.previous != null) {
			s = s + current.data + " -> ";
			current = current.previous;
		}
		s += current.data;
		return s;
	}
	protected class Node {
		protected Node next;
		protected Node previous;
		protected String data;

		protected Node(String data) {
			this.data = data;
		}
	}
}
