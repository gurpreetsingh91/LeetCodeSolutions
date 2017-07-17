package LeetCode;

public class setMatrixZeroes {

	public static void setZeroesUtil(int[][] matrix, int[][] indices, int count) {
		int numRow = matrix.length, numCol = matrix[0].length;
		for (int k = 0; k < count; k++) {

			for (int i = 0; i < numRow; i++) {
				matrix[i][indices[k][1]] = 0;
			}

			for (int j = 0; j < numCol; j++) {
				matrix[indices[k][0]][j] = 0;
			}

		}

	}

	public static void setZeroes(int[][] matrix) {

		int numRow = matrix.length, numCol = matrix[0].length, count = 0;
		int indices[][] = new int[numRow*numCol][2];
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {

				if (matrix[i][j] == 0) {
					indices[count][0] = i;
					indices[count][1] = j;
					count++;
				}
			}
		}
		setZeroesUtil(matrix, indices, count);


		/*for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}*/
		
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 1, 1 }, { 1, 1, 0, 1 }, { 1, 0, 1, 1 } };
		//int[][] arr = {{1,0}};
		setZeroes(arr);

	}
}
