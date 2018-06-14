package NumberArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayRepeatedElements {

	public static void main(String[] args) {
		int[] arr = {1,5,23,2,6,3,1,8,12,3};
		String resultLW = duplicateLongWay(arr);
		System.out.println("Long Way --> The repeated elements in ascending order are as follows: " + resultLW);

		String resultSW = duplicateShortWay(arr);
		System.out.println("Short Way --> The repeated elements in ascending order are as follows: " + resultSW);

	}

	public static String duplicateLongWay(int[] numbers) {
		int l = numbers.length;
		TreeSet<Integer> tm = new TreeSet<Integer>();
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		if (l > 1) {
			for (int i = 0; i < l; i++) {
				if (hs.containsKey(numbers[i])) {
					int freq = hs.get(numbers[i]);
					hs.put(numbers[i], freq + 1);
				} else
					hs.put(numbers[i], 1);
			}

			for (int key : hs.keySet()) {
				if (hs.get(key) > 1)
					tm.add(key);
			}
			if (tm.size() != 0) {
				return tm.toString();
			} else
				return "";
		} else
			return "";
	}

	public static String duplicateShortWay(int[] numbers) {
		Arrays.sort(numbers);
		LinkedHashSet<Integer> sortedDuplicates = new LinkedHashSet<Integer>();
		int l = numbers.length;
		for (int i = 0; i < l-1; i++) {
			if (numbers[i] == numbers[i + 1])
				sortedDuplicates.add(numbers[i]);
		}
		return sortedDuplicates.toString();
	}
}