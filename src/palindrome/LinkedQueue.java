package palindrome;


public class LinkedQueue<T>
{
	private class Node
	{
		T data;
		Node next;
		public Node(T data)
		{
			this.data=data;
		}
		
	}
	Node front,rear;
	int size=0;
	public void enqueue(T data)
	{
		Node temp=rear;
		rear=new Node(data);
		//rear.next=null;
		if(isEmpty())
		{
			front=rear;
		}
		else
		{
			temp.next=rear;
		}
		//System.out.println(data+" is added to Queue ");
		size++;
	}
	
	public T dequeue()
	{
		
		if(!isEmpty())
		{
			T value=front.data;
			front=front.next;
			//System.out.println(value+" is removed from Queue");
			size--;
			return value;
		}
		else
		{
			//System.out.println("No elements to remove........");
			return null;
		}
	}
	
	public T peek()
	{
		if(!isEmpty())
		{
			//System.out.println(front.data+" is peeked from Queue");
			return front.data;
		}
		else
		{
			//System.out.println("No elements to peek");
			return null;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
}
