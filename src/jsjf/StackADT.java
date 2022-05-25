package jsjf;

public interface StackADT<T> {
	/*
	 * Adds the specific element to the top of the stack.
	 * @param element element to be pushed onto the stack
	 */
	public void push(T element);
	
	/*
	 * Remove and returns the top element from stack 
	 * @return the element removed from the stack
	 */
	public T pop();
	
	/*
	 * Returns without removing the top element of this stack
	 * @return the element on top of stack
	 */
	public T peek();
	
	/*
	 * @Returns true if stack contain no elements
	 * Otherwise it returns false
	 */
	public boolean isEmpty();
	
	/*
	 * return the size of stack
	 * @return how many elements stack contain
	 */
	public int size();
	
	/*
	 * method to display contents of stack
	 */
	public void disply();

}
