package anurag.StackandQueues.org;

import java.util.Stack;

public class MyQueue<T> {

	private Stack<T> s1;
	private Stack<T> s2;

	public MyQueue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	private void add(T data) {
		s1.push(data);
	}

	private T remove() {
		stackExchange();
		return s2.pop();
	}

	private void stackExchange() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());
		}
	}

	// wrapper methods
	public void push(T value) {
		add(value);
	}

	public T pop() {
		return remove();
	}
}
