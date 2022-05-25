package deque;

public class LinkedDeque<E> implements Deque<E> {
	// Instance variables
	Node<E> first;// reference to the front of deque
	Node<E> last;// reference to the back of the deque
	int n;// size of the deque

	/*
	 * Constructor Initializes the instance variables to appropriate values
	 */
	public LinkedDeque() {
		this.first = null;
		this.last = null;
		this.n = 0;
	}

	/*
	 * Returns Size of Deque
	 */
	@Override
	public int size() {
		return n;
	}

	/*
	 * Return whether Deque is empty or not
	 */
	@Override
	public boolean isEmpty() {
		return (n == 0);
	}

	// Return the item at front of deque
	@Override
	public E first() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		} else {
			return first.data;
		}
	}

	// Return the item at the back of the deque
	@Override
	public E last() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		} else {
			return last.data;
		}
	}

	/*
	 * Add the given item to the front of the deque Increment n by one
	 */
	@Override
	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e);
		if (isEmpty()) {
			first = last = newNode;
		} else {
			first.prev = newNode;
			newNode.next = first;
			first = newNode;
		}
		n++;
	}

	/*
	 * Add the given item to the back of the deque Increment n by one
	 */
	@Override
	public void addLast(E e) {
		Node<E> newNode = new Node<E>(e);
		if (isEmpty()) {
			first = last = newNode;
		} else {
			newNode.prev = last;
			last.next = newNode;
			last = newNode;
		}
		n++;
	}

	// Remove and Return the item at front of deque
	@Override
	public E removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		}

		Node<E> temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.prev = null;
		}
		first = first.next;
		n--;
		return temp.data;
	}

	// Remove and Return the item at the back of the deque
	@Override
	public E removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		} else {
			Node<E> temp = last;
			if (last.prev == null) {
				first = null;
			} else {
				last.prev.next = null;
			}
			last = last.prev;
			n--;
			return temp.data;
		}
	}
}
