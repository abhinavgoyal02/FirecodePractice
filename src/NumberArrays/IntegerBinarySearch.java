package NumberArrays;

public class IntegerBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 8, 9 };
		int n = 5;
		boolean result = binarySearch(arr, n);

		System.out.println("Found Integer with Binary Search? " + result);
	}

	public static Boolean binarySearch(int[] arr, int n) {
		int start = 0, end = arr.length - 1, middle = (start + end) / 2;
		if (arr.length == 0) 
			return false;
	    if (arr.length == 1) 
	    	return arr[0] == n;
		for (	;start <= end; middle = (start + end) / 2) {
			if (n < arr[middle])
				end = middle - 1;
			else if (n > arr[middle])
				start = middle + 1;
			else
				return true;
		}
		return false;
	}
}
