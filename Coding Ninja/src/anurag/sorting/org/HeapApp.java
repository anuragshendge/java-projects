package anurag.sorting.org;

public class HeapApp {

	public static void main(String[] args){
		
		Heap heapSortObj = new Heap();
		
		heapSortObj.addHeap(20);
		heapSortObj.addHeap(30);
		heapSortObj.addHeap(15);
		heapSortObj.addHeap(54);
		heapSortObj.addHeap(10);
		heapSortObj.addHeap(31);
		for(int i=0;i<4;i++){
			heapSortObj.deleteHeap();
		}
	}
	
}
