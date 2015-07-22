package anurag.LinkedList.org;

import java.util.Hashtable;
/*
 * Uses hashtables and hence extra O(n) space * */

public class Q1 {

	public void removeDuplicactes(LNode head) {
		Hashtable s = new Hashtable();
		LNode prev = null;

		while (head != null) {

			if (s.containsKey(head.value)) {
				prev.next = head.next;
			} else {
				s.put(head.value, true);
				prev = head;
			}

			head = head.next;

		}

	}

	public static void main(String[] args) {

		Q1 obj = new Q1();
		LNode head = new LNode(4);
		head.next = new LNode(1);
		head.next.next = new LNode(7);
		head.next.next.next = new LNode(4);
		head.next.next.next.next = new LNode(7);
		head.next.next.next.next.next = new LNode(8);

		obj.removeDuplicactes(head);

	}
}
