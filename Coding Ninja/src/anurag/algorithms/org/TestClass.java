package anurag.algorithms.org;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TestClass {

	int[] count;
	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;

	public TestClass(int limit) {
		count = new int[limit + 10];
		maxHeap = new PriorityQueue<Integer>(limit + 10);
		minHeap = new PriorityQueue<Integer>(limit + 10);
	}

	public void queries(int query, int X) {

		switch (query) {

		case 1:
			count[X]++;
			maxHeap.add(X * (-1));
			minHeap.add(X);
			break;

		case 2:
			if (count[X] != 0) {
				count[X]--;
			} else
				System.out.println("-1");
			break;

		case 3:  while(maxHeap.size()>0 && count[(maxHeap.peek()*(-1))]==0){
			//			minHeap.remove(maxHeap.peek()*(-1));
						maxHeap.poll();
						
				}
				if(maxHeap.size()>0)
				System.out.println(maxHeap.peek() * (-1));
/*				else
					System.out.println("-1");
*/				break;
		case 4:  while(minHeap.size()>0 && count[minHeap.peek()]==0){
						minHeap.poll();
		
		}	
				if(minHeap.size()>0)
				 System.out.println(minHeap.peek());
/*				else
					System.out.println("-1");
*/				break;

		}

	}

	public static void main(String[] args){

		TestClass obj = new TestClass(100000);
		Scanner scan = new Scanner(System.in);

		int Q = Integer.parseInt(scan.nextLine());
		int[] a = new int[Q];
		int[] b = new int[Q];
			for (int i = 0; i < Q; i++) {
			String str = scan.nextLine();
			String[] temp = str.split(" ");
			a[i] = Integer.parseInt(temp[0]);
			if (temp.length > 1)
				b[i] = Integer.parseInt(temp[1]);
		
		}

		for (int i = 0; i < Q; i++) {
			obj.queries(a[i], b[i]);
		}

	}
}
