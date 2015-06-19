package anurag.arraysAndStrings.org;

public class Q7 {

	public static void setZeros(int mtx[][], int m, int n) {

		boolean row[] = new boolean[m];
		boolean column[] = new boolean[n];

		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx[0].length; j++) {

				if (mtx[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		// nullify rows
		for (int i = 0; i < m; i++) {
			if (row[i]) {
				int rowIndex = i;
				for (int j = 0; j < n; j++)
					mtx[rowIndex][j] = 0;
			}
		}
		// nullify columns
		for (int j = 0; j < n; j++) {
			if (column[j]) {

				int columnIndex = j;
				for (int i = 0; i < m; i++)
					mtx[i][columnIndex] = 0;
			}
		}

	}

	public static void printMatrix(int matrix[][], int m, int n) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		int m = 3, n = 4;
		int matrix[][] = new int[m][n];
		int count = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = count++;
			}
		}

		matrix[1][2] = 0;
		setZeros(matrix, m, n);
		printMatrix(matrix, m, n);
	}

}
