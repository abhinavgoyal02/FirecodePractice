package NumberArrays;

public class Diff2ElementsMax {

	public static void main(String[] args) {
		int[] inArr = { 7, 9, 5, 6, 3, 2 };
		String result = maxDiff(inArr);
		System.out.println("Max difference = " + result);
	}

	// Maximum difference between two elements
	// such that larger element appears
	// after the smaller number
	public static String maxDiff(int[] arr) {
		if (arr == null || arr.length < 2)
			return "Invalid input - min 2 numbers required";

		int l = arr.length;
		int minNumber = arr[0];
		int maxDiff = arr[1] - arr[0];
		for (int i = 1; i < l; i++) {
			if (arr[i] < minNumber)
				minNumber = arr[i];

			if (arr[i] - minNumber > maxDiff)
				maxDiff = arr[i] - minNumber;
		}

		return String.valueOf(maxDiff);
	}

}
