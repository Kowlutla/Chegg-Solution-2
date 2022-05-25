package com.mthree;

public class Queue {
	
	Node head;
	Node tail;
	int size;
	public Queue() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	public void enqueue(int data)
	{
		Node newNode=new Node(data);
		if(head==null && tail==null)
		{
			this.head=this.tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
		size++;
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			int data=head.data;
			head=head.next;
			if(head==null)
				tail=null;
			size--;
			return data;
		}
		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			return tail.data;
		}
	}
	
	
	public int size()
	{
		return this.size;
	}
	
	public boolean isEmpty()
	{
		return this.size==0;
	}
	
	public void printQueue()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}

	
	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println("Size: "+q.size());
		System.out.println("Top value: "+q.peek());
		System.out.println("Dequeud value: "+q.dequeue());
		System.out.println("Size: "+q.size());
		System.out.println("Dequeud value: "+q.dequeue());
		System.out.println("Size: "+q.size());
		q.enqueue(40);
		System.out.println("Size: "+q.size());
		System.out.println("Dequeue value: "+q.dequeue());
		System.out.println("Dequeue value: "+q.dequeue());
		System.out.println("Is Empty: "+q.isEmpty());
		
	}
}
