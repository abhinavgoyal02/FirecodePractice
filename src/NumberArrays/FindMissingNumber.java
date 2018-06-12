package NumberArrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,10,1,2,3 };
		int missingKey = findMissingNumber(arr);
		System.out.println("Missing Number?= " + missingKey);
	}

	public static int findMissingNumber(int[] arr) {
		int l = arr.length, key = 0;
		for (int i = 0; i < l-1; i++) {
			if (arr[i + 1] - arr[i] > 1 || arr[i] - arr[i+1] <-1) {
				key = (arr[i] + 1);
				break;
			}
		}
		return key;
	}
}
