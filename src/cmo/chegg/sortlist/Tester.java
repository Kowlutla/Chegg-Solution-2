package cmo.chegg.sortlist;

import java.util.LinkedList;
import java.util.Queue;

public class Tester {

	public static void main(String args[]) {
	
		Queue<Integer>q=new LinkedList<>();
		int x=2;
		q.add(4);
		System.out.println(q);
		q.add(x);
		System.out.println(q);
		q.add(q.peek());
		System.out.println(q);
		q.add(3+q.peek());
		System.out.println(q);
		q.add(0);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println();
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}
	}
}
