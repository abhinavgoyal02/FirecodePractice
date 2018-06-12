package NumberArrays;

public class flipVerticalAxis {

	public static void main(String[] args) {
		int[][] matrix = { 	{1,0,0},
							{0,0,1} };

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
		if (matrix[0].length > 1) {
			int rl = matrix.length - 1, cl = matrix[0].length - 1;
			for (int r = 0; r <= rl; r++) {
				for (int c = 0; c <= cl / 2; c++) {
					int temp = matrix[r][c];
					matrix[r][c] = matrix[r][cl-c];
					matrix[r][cl-c] = temp;
				}
			}
		}
	}
}
