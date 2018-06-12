package NumberArrays;

public class flipHorizontalAxis {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1 }, { 0, 0 } };

		flipHorizontalAxis(matrix);
		System.out.println("Flipped Matrix is below:");
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				System.out.print(matrix[r][c] + ", ");
			}
			System.out.println();
		}
	}

	public static void flipHorizontalAxis(int[][] matrix) {
		if (matrix.length > 1) {
			int rl = matrix.length - 1, r = 0;
			//for (int c = 0; c < matrix[r].length; c++) {
				for (r = 0; r <= rl / 2; r++) {
					int[] temp = matrix[r];
					matrix[r] = matrix[rl - r];
					matrix[rl - r] = temp;
				}
			//}
		}
	}
}
