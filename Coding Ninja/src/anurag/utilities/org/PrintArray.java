package anurag.utilities.org;

import java.util.List;

public class PrintArray {

	public void printArray(List<Integer> heapArray) {
		int size = heapArray.size();
		int level = (int) Math.floor(Math.log(size) / Math.log(2));

		while (level >= 0) {

			for (int i = 0; i < size; i++) {
				System.out.print(heapArray.get(i) + " ");
			}
			System.out.println();
			level--;
		}

	}

}
