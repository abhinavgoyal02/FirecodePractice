package Strings;

import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) throws Exception {
		char result = firstNonRepeatedCharacter("abcdcd");
		System.out.println("First Non-Repeated Character= " + result);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		if (str == null)
			return null;
		else if (str.length() <= 1) {
			return str.charAt(0);
		}

		else {
			LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
			int freq = 0;
			for (int i = 0; i < str.length(); i++) {
				if (charMap.containsKey(str.charAt(i))) {
					freq = charMap.get(str.charAt(i));
					charMap.put(str.charAt(i), freq + 1);
				} else {
					charMap.put(str.charAt(i), 1);
				}
			}

			for (Character sk : charMap.keySet()) {
				System.out.println("Character Key: " + sk + "\tFrequency: " + charMap.get(sk));
			}

			for (Character sk : charMap.keySet()) {
				if (charMap.get(sk) != 1)
					continue;
				else
					return sk;
			}
			return null;
		}
	}

}
