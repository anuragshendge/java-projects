package anurag.sorting.org;

import java.util.*;

import anurag.utilities.org.PrintArray;

public class HeapSort {

	public static List<Integer> heapList = new ArrayList<Integer>();

	public void addHeap(int valAdd) {

		if (heapList.size() == 0) {

			heapList.add(valAdd);
			System.out.println("First Element added=" + valAdd);
		} else {

			heapList.add(valAdd);
			int k = heapList.size() - 1;
			siftUp(heapList, k);

		}

	}

	private static void siftUp(List<Integer> heapArrayList, int k) {
		while (k > 0) {
			int p = (k - 1) / 2;

			if (heapArrayList.get(p).compareTo(heapArrayList.get(k)) < 0) {

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

	public void siftDown() {

		int k = 0;
		int leftIndex = 2 * k + 1;
		int size = heapList.size();

		while (leftIndex < size) {

			int max = leftIndex;
			int rightIndex = leftIndex + 1;

			if (rightIndex < size) {

				if (heapList.get(rightIndex).compareTo(heapList.get(leftIndex)) > 0) {
					max++;
				}

				if (heapList.get(k).compareTo(heapList.get(max)) < 0) {

					int temp = heapList.get(max);
					heapList.set(max, heapList.get(k));
					heapList.set(k, temp);
					k = max;
					leftIndex = 2 * k + 1;

				} else
					break;

			}

		}

	}

	public void deleteHeap() {
		
		int hold = heapList.get(0);
		heapList.set(0,heapList.remove(heapList.size()-1));
		siftDown();
		System.out.println("After deletion");
		System.out.println(heapList.toString());
		
	}
}
