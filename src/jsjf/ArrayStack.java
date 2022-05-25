package jsjf;

import java.util.Arrays;

import genericstacks.GenericStack;
import stacks.EmptyCollectionException;

public class ArrayStack<T> implements GenericStack<T> {

	private final static int DEFAULT_CAPACITY = 100;

	private int top;
	private T[] stack;

	// Default Constructor creates ArrayStack with DEFAULT_CAPACITY
	public ArrayStack() {
		top = 0;
		stack = (T[]) new Object[DEFAULT_CAPACITY];
	}

	// Parameterized Constructor creates ArrayStack with initialCapacity
	public ArrayStack(int initialCapacity) {
		top = 0;
		stack = (T[]) new Object[initialCapacity];
	}

	/*
	 * Adds the specific element to the top of the stack.
	 * 
	 * @param element element to be pushed onto the stack
	 */
	public void push(T element) {

		// if size reaches stack capacity expand stack
		if (size() == stack.length)
			expandCapacity();
		// put the element at top
		stack[top] = element;
		// increment the top
		top++;
	}

	// Method to expandCapacity of stack
	private void expandCapacity() {
		stack = Arrays.copyOf(stack, stack.length * 2);
	}

	/*
	 * Remove and returns the top element from stack
	 * 
	 * @return the element removed from the stack
	 */
	public T pop() throws EmptyCollectionException {
		// if stack is empty throw EmptyCollectionException
		if (isEmpty())
			throw new EmptyCollectionException("stack is empty");
		// decrement the top
		top--;
		T result = stack[top];
		stack[top] = null;
		return result;

	}

	/*
	 * Returns without removing the top element of this stack
	 * 
	 * @return the element on top of stack
	 */
	public T peek() {
		// if stack is empty throw EmptyCollectionException
		if (isEmpty())
			throw new EmptyCollectionException("stack is empty");
		// return the element present at top of stack
		return stack[top - 1];
	}

	/*
	 * return the size of stack
	 * 
	 * @return how many elements stack contain
	 */
	public int size() {
		return top;
	}

	/*
	 * @Returns true if stack contain no elements Otherwise it returns false
	 */
	public boolean isEmpty() {
		// return true if top is 0
		return top == 0;
	}

	/*
	 * method to display stack elements
	 */
	public void display() {
		// if stack is empty throw EmptyCollectionException
		if (isEmpty())
			throw new EmptyCollectionException("stack is empty");
		else {
			// for element in stack print them
			for (int i = 0; i < top; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}

	// toString method
	public String toString() {
		String s = "[";
		String deli = "";
		// for element in stack print them
		for (int i = 0; i < top; i++) {
			s = s + deli + stack[i];
			deli = ",";
		}
		s = s + "]";
		return s;
	}

}
