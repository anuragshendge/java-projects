package anurag.algorithms.org;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class MonkAndQueries{
	public static void main(String[] args){
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), true);
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(100000, new Comparator<Integer>() {
					public int compare(Integer i1, Integer i2) {
						return i2.compareTo(i1);
					}
				});
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(100000);
		int[] cntAry = new int[100002];
		int tc = sc.nextInt();
		
		for(int i = 0; i < tc; i++){
			int op = sc.nextInt();
			
			if(op == 1){
				int num = sc.nextInt();
				cntAry[num]++;
				maxHeap.add(num);
				minHeap.add(num);
			}else if(op == 2){
				int num = sc.nextInt();

				if(cntAry[num] != 0) cntAry[num]--;
				else out.println("-1");
			}else if(op == 3){

					while(maxHeap.size() > 0 && cntAry[maxHeap.peek()] == 0){
						maxHeap.poll();
					}

					if(maxHeap.size() > 0) out.println(maxHeap.peek());
					else out.println("-1");
				

			}else{

					while(minHeap.size() > 0 && cntAry[minHeap.peek()] == 0){
						minHeap.poll();
					}

					if(minHeap.size() > 0) out.println(minHeap.peek());
					else out.println("-1");
			}
		}
		
	}

	public static class MyScanner{
		BufferedReader br;
		StringTokenizer st;

		public MyScanner(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next(){
			while(st == null || !st.hasMoreElements()){
				try{
					st = new StringTokenizer(br.readLine());
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt(){
			return Integer.parseInt(next());
		}

		long nextLong(){
			return Long.parseLong(next());
		}

		double nextDouble(){
			return Double.parseDouble(next());
		} 

		String nextLine(){
			String str = "";
			try{
				str = br.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
}