package queueUsingDLL;

public class Queue {

	public static void main(String[] args) {
		
		DLL queue=new DLL();
		Nodde node1=new Nodde(10);
		Nodde node2=new Nodde(20);
		Nodde node3=new Nodde(30);
		Nodde node4=new Nodde(40);
		Nodde node5=new Nodde(5);
		queue.enqueue(node1);
		queue.enqueue(node2);
		queue.enqueue(node3);
		queue.enqueue(node4);
		queue.addTail(node5);
		queue.showDLL();
		queue.dequeue();
		queue.showDLL();
		queue.dequeue();
		queue.showDLL();
	}

}
