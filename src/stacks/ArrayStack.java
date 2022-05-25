package stacks;

public class ArrayStack<T> implements StackADT<T>
{
	
	private int top;
	private T[] stack;
	final int DEFAULT_CAPACITY=20;
	
	
	@SuppressWarnings("unchecked")
	public ArrayStack()
	{
		this.top=-1;
		this.stack=(T[]) new Object[DEFAULT_CAPACITY];
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int initialCapacity)
	{
		this.top=-1;
		this.stack=(T[]) new Object[initialCapacity];
	}

	/**
	 * Adds one element to the top of this stack.
	 * 
	 * @param element element to be pushed onto stack
	 */
	public void push(T element) {
		
		if(++top==stack.length)
		{
			expandCapacity();
		}
		stack[top]=element;
	}

	private void expandCapacity() 
	{
		
		int length=stack.length;
		T newStack=(T) new Object[length+20];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=(T[]) newStack;
	}


	/**
	 * Removes and returns the top element from this stack.
	 * 
	 * @return T element removed from the top of the stack
	 */
	public T pop() {
		if(isEmpty())
		{
			throw new EmptyCollectionException("stack");
		}
		else
		{
			T data=stack[top];
			top--;
			return data;
		}
	}

	/**
	 * Returns without removing the top element of this stack.
	 * 
	 * @return T element on top of the stack
	 */
	public T peek() {
		
		if(isEmpty())
		{
			throw new EmptyCollectionException("stack");
		}
		else
		{
			return stack[top];
		}
		
	}

	/**
	 * Returns true if this stack contains no elements.
	 * 
	 * @return boolean whether or not this stack is empty
	 */
	public boolean isEmpty() {
		
		return size()==0;
		
	}

	/**
	 * Returns the number of elements in this stack.
	 * 
	 * @return int number of elements in this stack
	 */
	public int size() {
		
		return top+1;
	}

	/**
	 * Returns a string representation of this stack.
	 * 
	 * @return String representation of this stack
	 */
	public String toString() {
		
		String s="STACK: ";
		if(isEmpty())
		{
			return s+"The Stack is empty";
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				s+=stack[i]+" ";
			}
			return s;
		}
		
		
	}

}
