package anurag.arraysAndStrings.org;

public class Q6 {

	public static void rotate(int matrix[][], int n) {

		for (int layer = 0; layer < (n / 2); layer++) {
			int first = layer;
			int last = n - 1 - layer;

			for (int i = first; i < last; i++) {
				int offset = i - first;

				int top = matrix[first][i];

				// left -> top
				matrix[first][i] = matrix[last - offset][first];
				// bottom->left
				matrix[last - offset][first] = matrix[last][last - offset];
				// right->bottom
				matrix[last][last - offset] = matrix[i][last];
				// top->right
				matrix[i][last] = top;

			}

		}
		printMatrix(matrix,n);

	}

	public static void printMatrix(int matrix[][], int n){
		
		for(int i= 0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int n = 4;
		int matrix[][] = new int[n][n];
		int count =1;
		for(int i=0; i<n; i++){
			for(int j=0;j<n;j++)
			{
				matrix[i][j] = count++;
			}
		}
		
		printMatrix(matrix,n);
		rotate(matrix, n);	
		
	}

}
