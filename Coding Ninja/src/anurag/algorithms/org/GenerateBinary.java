package anurag.algorithms.org;

import java.util.*;

/*A simple code for generating binary number 
 * represetation of numbers from 1 to n
 * given a n.
 * 
 * */
public class GenerateBinary {

	  Queue<String>  q = new LinkedList<>();

	private void generate(int n) {
		q.offer("1");
		int i=1;
		while(n!=0){
			
			String s1 = q.poll();
			
			String s2 = s1;
			
			System.out.println(" Number="+i+" --> "+s1);
			q.offer(s1.concat("0"));
			q.offer(s2.concat("1"));
			n--;
			i++;
		}
		
	}

	public static void main(String[] args) {
		
		GenerateBinary o = new GenerateBinary();
		
		o.generate(100000);

	}

}
