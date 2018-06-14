package NumberArrays;

public class ArrayMaxGain {

	public static void main(String[] args) {
		int[] inputarray = { 0, 100, 0, 100, 0, 100 };
		int result = maxGain_smart(inputarray);
		System.out.println("The max gain = " + result);

	}

	public static int maxGain_naive(int[] a) {
		int len = a.length - 1;
		if (a == null || len <= 1)
			return 0;

		else {
			int maxGain = 0;
			for (int i = 0; i <= len; i++) {
				for (int j = i + 1; j <= len; j++) {
					if (a[j] > a[i] && Math.abs(a[j] - a[i]) > maxGain)
						maxGain = Math.abs(a[j] - a[i]);
				}
			}
			return maxGain;
		}
	}

	public static int maxGain_smart(int[] a) {
		int len = a.length - 1;
		if (a == null || len <= 1)
			return 0;

		else {
			int maxGain = 0;

			return maxGain;
		}
	}
}
