package anurag.StackandQueues.org;

public class QueueDriver {

	public static void main(String[] args) {
		
		QueueImpl<Integer> qObj = new QueueImpl();
		qObj.enqueue(10);
		qObj.enqueue(20);
		qObj.enqueue(30);
		qObj.enqueue(40);
		qObj.enqueue(50);
		
		System.out.println("Peek output="+qObj.peek());
		qObj.dequeue();
		qObj.dequeue();
		qObj.dequeue();
		qObj.dequeue();
		qObj.dequeue();
		qObj.dequeue();
		
	}

}
