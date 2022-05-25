package genericstacks;

import java.util.EmptyStackException;

public class Stack<T> implements GenericStack<T> {
	// Class Node
	private class Node<T> {
		Node<T> next;
		T data;

		public Node(T data) {
			this.data = data;
		}

	}

	private Node<T> head;// the first node
	private int size;// size of stack

	// Method to return current stack size
	@Override
	public int size() {
		return this.size;
	}

	// Method returns true is stack is empty
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	// Method to add element at top os stack
	@Override
	public void push(T element) {
		Node<T> node = new Node(element);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	// return and remove the top element throws Exception if empty
	@Override
	public T pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			T value = head.data;
			head = head.next;
			size--;
			return value;
		}
	}

	// return and the top element without removing throws Exception if empty
	@Override
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			return head.data;
		}
	}

	// String showing current stack contents
	@Override
	public String toString() {
		if(isEmpty())
		{
			return "";
		}
		String temp = "";
		Node<T> current = head;
		while (current.next != null) {
			temp = temp + current.data + " -> ";
			current = current.next;
		}
		temp = temp + current.data;
		return temp;
	}
}
