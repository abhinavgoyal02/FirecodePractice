package NumberArrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {4,12,4,78,7,-1};
		int[] result = selectionSortArray(arr);
		System.out.println("Selection sorted array is:");
		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	public static int[] selectionSortArray(int[] arr) {
		if (arr.length <= 1)
			return arr;

		else {
			int l = arr.length - 1, minPos = 0;
			for (int i = 0; i <= l; i++) {
				minPos=i;
				for (int j = i+1; j <= l; j++) {
					if (arr[minPos]>arr[j])
						minPos = j;
				}
				if (minPos != 0) {
					int temp = arr[i];
					arr[i] = arr[minPos];
					arr[minPos] = temp;
				}
			}
		}
		return arr;
	}
}
