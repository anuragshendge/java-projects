package anurag.sorting.org;

public class HeapSortDriver {

	public static void main(String[] args) {

		int data[] = new int[] { 9, 6, 5, 0, 8, 2, 1, 3 };
		System.out.println("Before");
		for(int token : data)
			System.out.print(" "+token);
		
		SortHeap hpObj = new SortHeap();
		hpObj.sort(data);
		
		System.out.println("\nAfter");
		for(int token : data)
			System.out.print(" "+token);

	}

}
