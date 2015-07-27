package anurag.algorithms.org;

import java.util.Scanner;

public class CodeMonkLargestPdt {

	public int findLargestProduct(int[] arr, int n) {
		int prod = 1;
		BuildMaxHeap(arr, n);
		for (int i = 0; i <3; i++) {
			prod *= arr[0];

			int temp = arr[0];
			arr[0] = arr[n - i];
			arr[n - i] = temp;

			maxHeapify(arr, (n-(i+1)), 0);

		}
		return prod;
	}

	private void BuildMaxHeap(int[] arr, int n) {
		for (int i = (n-1 / 2); i >= 0; i--) {
			maxHeapify(arr, n, i);
		}
	}

	private void maxHeapify(int[] arr, int n, int i) {

		int left = 2 * i+1;
		int right = 2 * i + 2;
		int largest = i;

		if (left <= n && arr[left] >= arr[i])
			largest = left;
		if (right <= n && arr[right] > arr[largest])
			largest = right;

		if (i != largest) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			maxHeapify(arr,n,largest);
		}

	}

	public static void main(String[] args) throws Exception{

		CodeMonkLargestPdt obj = new CodeMonkLargestPdt();
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
			
		for (int i = 0; i < N; i++) {
			if (i < 2)
				System.out.println(-1);
			else
				System.out.println(obj.findLargestProduct(arr,i));
				
		}

	}

}
