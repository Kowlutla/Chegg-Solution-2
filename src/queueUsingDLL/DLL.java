package queueUsingDLL;

public class DLL {

	Nodde head;// to hold first node in queue
	Nodde tail;// to hold last node in queue
	int size;// to hold size of queue

	// Constructor to create DLL Object
	public DLL() {
		head = tail = null;
		size = 0;
	}

	// Method to enqueue the queue
	public void enqueue(Nodde N) {
		if (isEmpty()) {
			head = N;
		} else {
			N.setNext(tail);
			tail.setPrevious(N);
		}
		tail = N;
		size++;
	}

	// Method to show all numbers in Queue
	public void showDLL() {
		Nodde temp = tail;
		String L = "";
		while (temp != null) {
			L = L + "->" + temp.getNum();
			temp = temp.getNext();
		}
		System.out.println(L);
	}

	// method to add Nodde at tail of queue
	public void addTail(Nodde M) {
		if (isEmpty()) {
			tail = M;
		} else {
			head.setNext(M);
			M.setPrevious(head);
		}
		head = M;
		size++;
	}

	// Method to check Queue is empty or not
	public boolean isEmpty() {
		return size == 0;
	}

	// Method to remove Element from Head of Queue
	public void removeHead() {
		tail = tail.getNext();
		tail.setPrevious(null);
	}

	// method to dequeue element from Queue
	public void dequeue() {
		head = head.getPrevious();
		head.setNext(null);
	}

	public static void main(String[] args) {
		// Creating DLL Object as queue
		DLL queue = new DLL();

		// Creating four Nodde Objects to add to queue
		Nodde node1 = new Nodde(10);
		Nodde node2 = new Nodde(20);
		Nodde node3 = new Nodde(30);
		Nodde node4 = new Nodde(40);

		// enqueue node 1(value 10)to queue
		queue.enqueue(node1);
		System.out.println("Queue After enqueue with 10: ");
		queue.showDLL();

		// enqueue node 2(value 20)to queue
		queue.enqueue(node2);
		System.out.println("Queue After enqueue with 20: ");
		queue.showDLL();

		// enqueue node 3(value 30) to queue
		queue.enqueue(node3);
		System.out.println("Queue After enqueue with 30: ");
		queue.showDLL();

		// dequeue from queue
		queue.dequeue();
		System.out.println("Queue After dequeue : ");
		queue.showDLL();

		// enqueue node 4(value 40) to queue
		queue.enqueue(node4);
		System.out.println("Queue After enqueue with 40: ");
		queue.showDLL();

		// dequeue from queue
		queue.dequeue();
		System.out.println("Queue After dequeue : ");
		queue.showDLL();
	}
}
