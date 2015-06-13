package anurag.sorting.org;

import anurag.utilities.org.PrintArray;

public class SortDriver {

	public static void main(String[] args){
		
		HeapSort heapSortObj = new HeapSort();
		heapSortObj.addHeap(20);
		heapSortObj.addHeap(30);
		heapSortObj.addHeap(15);
		heapSortObj.addHeap(54);
		heapSortObj.addHeap(10);
		heapSortObj.addHeap(31);
		heapSortObj.deleteHeap();
	}
	
}
