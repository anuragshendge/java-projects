package anurag.StackandQueues.org;

public class Q3 {

	public static void main(String[] args) {

		StackSet stackSetObj = new StackSet(2);
		
		for (int i = 0; i < 4; i++) {
			stackSetObj.push(i);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Popped " + stackSetObj.pop());
		}		
		
		
	}

}
