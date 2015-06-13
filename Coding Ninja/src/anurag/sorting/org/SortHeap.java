package anurag.sorting.org;

public class SortHeap {

	public void sort(int data[]) {

		BuildMaxHeap bmhObj = new BuildMaxHeap(data);

		for (int i = bmhObj.getSize() - 1; i >= 0; i--) {

			int sortedElement = bmhObj.removeMaxFromTop();
			data[i] = sortedElement;

		}

	}

}
