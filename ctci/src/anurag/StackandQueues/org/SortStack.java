package anurag.StackandQueues.org;

import java.util.Stack;

public class SortStack {

	Stack<Integer> auxStack;

	public SortStack() {
		auxStack = new Stack<>();
	}

	public Stack<Integer> sort(Stack<Integer> orgStack) {

		while (!orgStack.isEmpty()) {

			int temp = orgStack.pop();

			if (auxStack.isEmpty() || temp < auxStack.peek()) {
				auxStack.push(temp);
			} else {
				int count = 0;
				while (!auxStack.isEmpty() && temp > auxStack.peek()) {
					
					orgStack.push(auxStack.pop());
					count++;
				}

				auxStack.push(temp);
				while (count != 0) {
					auxStack.push(orgStack.pop());
					count--;
				}
			}

			//System.out.println("s"+auxStack.peek());	
		}

		return auxStack;
	}

}
