package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CompressString {

	public static void main(String[] args) {
		String inputStr = "aaabbbbbcccc";
		String result = compressString(inputStr);
		System.out.println("Compressed String = " + result);

	}

	public static String compressString(String text) {
		if (text == null || text.length() <= 1)
			return text;

		else {
			int len = text.length() - 1;
			char c = ' ';
			Map<Character, Integer> compressCount = new LinkedHashMap<Character, Integer>();
			for (int i = 0; i <= len; i++) {
				c = text.charAt(i);

				if (compressCount.containsKey(c)) {
					int freq = compressCount.get(c);
					compressCount.put(c, freq + 1);
				} else
					compressCount.put(c, 1);
			}

			StringBuilder sb = new StringBuilder();
			Integer count = 0;
			for (Character x : compressCount.keySet()) {
				count = compressCount.get(x);
				if (count > 1) {
					sb.append(x);
					sb.append(count);
				} else
					sb.append(x);
			}
			return sb.toString();
		}
	}
}
