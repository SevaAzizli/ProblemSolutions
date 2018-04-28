package codefights.arcade;
public class MatrixElementsSum {

	static int matrixElementsSum(int[][] matrix) {
		int sum = 0;

		for (int i = 0; i < matrix[0].length; i++) {

			for (int j = 0; j < matrix.length; j++) {

				if (matrix[j][i] == 0) {
					 break;
				}

				sum = sum + matrix[j][i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1, 1, 0 }, 
							{ 0, 5, 0, 1 },
							{ 2, 1, 3, 10 } };

		int[][] matrix1 = { { 0, 3, 6 }, { 4, 5, 2 } };

		int[][] matrix2 = { { 0, 4 }, { 5, 6 } };

		System.out.println(matrix[0].length);
		System.out.println(matrix2[1].length);
		System.out.println(matrixElementsSum(matrix1));

	}

}