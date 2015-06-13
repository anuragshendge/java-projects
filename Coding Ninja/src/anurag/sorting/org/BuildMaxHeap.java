package anurag.sorting.org;

public class BuildMaxHeap {
	private int data[];
	private int size;

	public BuildMaxHeap(int data[]) {

		this.data = data;
		size = data.length;
		
		for (int i = (size / 2 - 1); i >= 0; i--) {
			heapify(i);

		}

	}

	public int getSize() {
		return size;
	}

	public int removeMaxFromTop() {

		int top = data[0];
		data[0] = data[--size];
		heapify(0);
		return top;

	}

	private void heapify(int i) {

		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;

		if (left < size && data[left] > data[largest])
			largest = left;
		

		if (right < size && data[right] > data[largest])
			largest = right;

		if (largest != i) {

			int swap = data[largest];
			data[largest] = data[i];
			data[i] = swap;
			heapify(largest);
		}

	}

}
