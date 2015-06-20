package anurag.StackandQueues.org;

public class Q1<T> {

	private static int N = 300;
	private int capacity;
	T stack[];
	private int top[] = { -1, 99, 199 };

	public Q1() {
		this(N);
	}

	public Q1(int cap) {
		capacity = cap;
		stack = (T[]) new Object[capacity];

	}

	public boolean isEmpty(int stackNo) {
		if (top[stackNo - 1] == ((N / 3 * (stackNo - 1) - 1))) {
			return true;
		}
		return false;

	}

	public void push(T t, int stackNo) {

		if (top[stackNo - 1] >= ((N / 3 * (stackNo) - 1))) {
			System.out.println("Stack " + stackNo + " is Full!");
		}
		top[stackNo - 1]++;
		stack[top[stackNo - 1]] = t;
	}

	public T pop(int stackNo) {

		if (isEmpty(stackNo)) {
			System.out.println("The stack is Empty, cant Pop from stack #"
					+ stackNo);
			return null;
		}
		T elem = stack[top[stackNo - 1]];
		System.out.println("Deleting " + elem + " from stack #" + stackNo);
		stack[top[stackNo - 1]] = null;
		top[stackNo - 1]--;
		return elem;
	}

	public T peek(int stackNo) {
		if (isEmpty(stackNo)) {
			System.out.println("the stack is empty");
			return null;
		}
		return stack[top[stackNo - 1]];
	}
}
