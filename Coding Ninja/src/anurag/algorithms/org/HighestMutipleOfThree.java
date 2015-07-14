package anurag.algorithms.org;

import anurag.sorting.org.SortHeap;

public class HighestMutipleOfThree {

	public static int[] findMultiple(int data[]) {

		SortHeap hpObj = new SortHeap();
		int sum = 0;
		for (int i = 0; i < data.length; i++)
			sum += data[i];

		if (sum % 3 == 0) {
			hpObj.sort(data);
			return data;
		}
		/* sort the array in increasing order */

		int temp = -1;
		int[] aux = new int[2];
		int count = 0;
		if (sum % 3 == 1) {
			int i = 0;
			while (i < data.length) {
				if (data[i] % 3 == 1) {
					temp = data[i];
					break;
				}
				if (data[i] % 3 == 2 && count < 2) {
					aux[count++] = data[i];
				}
				i++;
			}

		} else if (sum % 3 == 2) {
			int i = 0;
			while (i < data.length) {
				if (data[i] % 3 == 2) {
					temp = data[i];
					break;
				}
				if (data[i] % 3 == 1 && count < 2) {
					aux[count++] = data[i];
				}
				i++;
			}

		}
		if (temp != -1) {
			for (int i = 0; i < data.length; i++) {
				if (temp == data[i]){
					data[i] = -1;
					break;
				}
				else
					continue;
			}
		} else {

			if (count != 2) {
				for (int i = 0; i < data.length; i++)
					data[i] = -2;
				return data;
			}
			for (int i = 0; i < data.length; i++) {

				if (data[i] == aux[0] || data[i] == aux[1]) {
					data[i] = -1;
				} else
					continue;
			}
		}
		hpObj.sort(data);
		return data;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] data = {2,2,1};
		int flag = 1;
		int[] res = findMultiple(data);

		for (int i = res.length - 1; i >= 0; i--) {
			if (res[i] != -1)
				System.out.print(res[i] + " ");
			if (res[res.length - 1] == -1)
				flag = 0;
		}
		if (data[0] == -2)
			System.out.println("Not possible");
		else if (flag == 0) {
			System.out.println("Not possible!!");
		}

	}

}
