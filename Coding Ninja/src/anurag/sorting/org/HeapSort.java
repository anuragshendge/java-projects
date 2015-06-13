package anurag.sorting.org;

import java.util.*;

import anurag.utilities.org.PrintArray;

public class HeapSort {
	
	public static List<Integer> heapArrayList = new ArrayList<Integer>();   
	
	public void addHeap(int valAdd){
		
		if(heapArrayList.size() == 0){
			
			heapArrayList.add(valAdd);
			System.out.println("First Element added="+valAdd);
		}
		else{
			
			heapArrayList.add(valAdd);
			int k = heapArrayList.size()-1;
			siftUp(heapArrayList,k);
			
		}
		
	}
	
	private static void siftUp(List<Integer> heapArrayList, int k){
			while(k>0){
			int p = (k-1)/2;
			
			if(heapArrayList.get(p).compareTo(heapArrayList.get(k))<0){
				
				int temp = heapArrayList.get(p);
				heapArrayList.set(p, heapArrayList.get(k));
				heapArrayList.set(k, temp);
			}
			
			else
				break;	
				k = p;
		}
				
		
		System.out.println(heapArrayList);	
	}
	
	
	
}
