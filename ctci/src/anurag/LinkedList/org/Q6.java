package anurag.LinkedList.org;

public class Q6 {

	
	public LNode FindBeg(LNode head){
		
		LNode slow=head, fast=head;
		if(head == null)
			return null;
		while(slow!=null && fast!=null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				break;
			
		}
		
		slow = head;
		
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
				
		return slow;
		
	}
	
	public static void main(String[] args ){
		
		Q6 obj = new Q6();
		LNode head =  new LNode(1);
		head.next = new LNode(2);
		head.next.next = new LNode(3);
		head.next.next.next = new LNode(4);
		head.next.next.next.next =head.next;
		
		
		LNode res = obj.FindBeg(head);
		System.out.println("The loop begins at Node "+res.value);
		
	}
}
