package anurag.StackandQueues.org;

public class Q5Driver {

	public static void main(String[] args) {
		MyQueue<Integer> qObj = new MyQueue<Integer>();

		for (int i = 1; i <= 10; i++) {
			qObj.push(i);
		}
		for (int i = 0; i < 10; i++)
			System.out.println("Dequeued= " + qObj.pop());
	}

}