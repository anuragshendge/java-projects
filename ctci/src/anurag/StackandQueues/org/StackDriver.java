package anurag.StackandQueues.org;

public class StackDriver {

	public static void main(String[] args) {

		StackDriver obj = new StackDriver();
		Q1<Integer> t = new Q1<>();
		t.push(22,1);
		t.push(33,2);
		t.push(77,1);
		t.push(111,1);
		t.push(8888,3);
		System.out.println("Pop output is " + t.pop(1));
		System.out.println("Peek output is " + t.isEmpty(1));

	}

}
