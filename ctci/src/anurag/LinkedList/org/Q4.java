package anurag.LinkedList.org;

public class Q4 {

	public LNode partition(LNode head, int x) {
		LNode before = head;
		LNode after = head;

		while (head != null) {

			LNode temp = head.next;
			if (head.value < x) {

				head.next = before;
				before = head;

			} else {
				after.next = head;
				after = head;
			}
			head = temp;
		}

		after.next = null;
		return before;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Q4 obj = new Q4();
		
		LNode head = new LNode(4);
		head.next = new LNode(1);
		head.next.next = new LNode(7);
		head.next.next.next = new LNode(9);
		head.next.next.next.next = new LNode(10);
		head.next.next.next.next.next = new LNode(3);
		
		
		LNode result =obj.partition(head, 5);
		

		while(result!= null){
			System.out.print("["+result.value+"] ");
			result = result.next;
		}
	}
}
