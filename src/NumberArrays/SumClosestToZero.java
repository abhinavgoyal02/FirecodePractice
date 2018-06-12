package NumberArrays;

public class SumClosestToZero {

	public static void main(String[] args) {
		int input[] = {1, 60, -10, 70, -80, 85};
		String result = getNumWithSumClosestToZero(input);
		System.out.println("Numbers with Sum closest to Zero are: " + result);
	}

	public static String getNumWithSumClosestToZero(int[] arr) {
		if (arr == null || arr.length < 2)
			return "Invalid input - min 2 numbers required";

		int l = arr.length;
		int num_Left = arr[0], num_Right = arr[1];
		int minSum = arr[0]+arr[0];
		for (int i = 0; i < l; i++) {
			if (Math.abs(num_Left + arr[i]) < Math.abs(minSum))
				num_Right = arr[i];
			if (Math.abs(arr[i] + num_Right) < Math.abs(minSum))
				num_Left = arr[i];
		}
		return String.valueOf(num_Left) + " and "  + String.valueOf(num_Right);
	}
}
