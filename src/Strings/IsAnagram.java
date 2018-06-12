package Strings;

import java.util.HashMap;

public class IsAnagram {

	public static void main(String[] args) throws Exception {
		boolean result = isAnagram("yellow", "llowey");
		System.out.println("Are all characters unique? " + result);
	}

	// java.util.* and java.util.input1eams.* have been imported for this problem.
	// You don't need any other imports.

	public static boolean isAnagram(String input1, String input2) {
		if (input1 == null || input2 == null || input1.length() != input2.length())
			return false;

		else if (input1.equals(input2))
			return true;

		else {
			int len1 = input1.length(), len2 = input2.length();
			HashMap<Character, Integer> inMap1 = new HashMap<Character, Integer>();
			HashMap<Character, Integer> inMap2 = new HashMap<Character, Integer>();
			int freq = 0;
			for (int i = 0; i < len1; i++) {
				// if (!inSet1.add(input1.charAt(i)))
				// return false;
				if (inMap1.get(input1.charAt(i)) == null) {
					inMap1.put(input1.charAt(i), 1);
				} else {
					freq = inMap1.get(input1.charAt(i));
					if (freq < 1)
						inMap1.put(input1.charAt(i), 1);
					else {
						inMap1.put(input1.charAt(i), freq + 1);
					}
				}
			}

			for (int i = 0; i < len2; i++) {
				// if (!inSet2.add(input2.charAt(i)))
				// return false;
				if (inMap2.get(input2.charAt(i)) == null) {
					inMap2.put(input2.charAt(i), 1);
				} else {
					freq = inMap2.get(input2.charAt(i));
					if (freq < 1)
						inMap2.put(input2.charAt(i), 1);
					else {
						inMap2.put(input2.charAt(i), freq + 1);
					}
				}
			}

			if (inMap1.equals(inMap2))
				return true;
		}

		return false;
	}
}
