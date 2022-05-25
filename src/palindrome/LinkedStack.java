package palindrome;

public class LinkedStack<T> {
	
	private class Node
	{
		T data;
		Node next;
		public Node(T data)
		{
			this.data=data;
		}
	}
	
	Node head=null;
	public void push(T data)
	{
		Node node=new Node(data);
		
		Node temp=head;
		head=node;
		head.next=temp;
	}
	
	public T peek() 
	{
			if(head==null)
			{
				System.out.println("Stack underflow....!! ");
				return null;
			}
			return head.data;
	}
	
	public T pop() 
	{
		if(head==null)
		{
			System.out.println("Stack underflow....!! ");
			return null;
		}
		T value=head.data;
		head=head.next;
		return value;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void show()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}



}
