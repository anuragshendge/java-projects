package anurag.StackandQueues.org;

import java.util.Stack;

public class Q6Driver {

	public static void main(String[] args) {

		int n=6;
		Stack<Integer> s = new Stack<>();
		SortStack obj = new SortStack();

		s.push(5);
		s.push(10);
		s.push(8);
		s.push(7);
		s.push(4);
		
		Stack<Integer> ans = obj.sort(s);
		
		for(int i=0;i<5;i++)
			System.out.println("Popped="+ans.pop());
		
	}

}
