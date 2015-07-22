package anurag.LinkedList.org;

public class Q2 {

	
	public LNode findKth(LNode head,int k){
		if(k<=0)
			return null;
		LNode p1 =head;
		LNode p2= head;
		int count = 0;
		while(count<k){
			p2 = p2.next;
			count++;
		}
		while(p2!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	public static void main(String[] args){

		
		Q2 obj = new Q2();
		LNode head = new LNode(4);
		head.next = new LNode(1);
		head.next.next = new LNode(7);
		head.next.next.next = new LNode(9);
		head.next.next.next.next = new LNode(10);
		head.next.next.next.next.next = new LNode(3);
		System.out.println("The value="+obj.findKth(head, 3).value);
		
		
	}
}
