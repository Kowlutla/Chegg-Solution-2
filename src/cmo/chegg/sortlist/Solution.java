package cmo.chegg.sortlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

	// function to merge k
	// sorted linked lists
	public ListNode mergeKLists(ListNode lists[]) {
		ListNode head = null, last = null;
		int k=lists.length;
		// priority_queue 'pq' implemeted
		// as min heap with the
		// help of 'compare' function
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
			public int compare(ListNode a, ListNode b) {
				return a.val - b.val;
			}
		});

		// push the head nodes of all
		// the k lists in 'pq'
		for (int i = 0; i < k; i++)
			if (lists[i] != null)
				pq.add(lists[i]);

		// loop till 'pq' is not empty
		while (!pq.isEmpty()) {
			// get the top element of 'pq'
			ListNode top = pq.peek();
			pq.remove();

			// check if there is a node
			// next to the 'top' node
			// in the list of which 'top'
			// node is a member
			if (top.next != null)
				// push the next node in 'pq'
				pq.add(top.next);

			// if final merged list is empty
			if (head == null) {
				head = top;
				// points to the last node so far of
				// the final merged list
				last = top;
			} else {
				// insert 'top' at the end
				// of the merged list so far
				last.next = top;

				// update the 'last' pointer
				last = top;
			}
		}
		// head node of the required merged list
		return head;
	}

	// function to print the singly linked list
	public void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
