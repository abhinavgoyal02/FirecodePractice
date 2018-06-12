package Strings;

import java.util.HashSet;
import java.util.Hashtable;

public class UniqueCharString {

	public static void main(String[] args) throws Exception {
		boolean unique = areAllCharactersUnique_HashSet("abbcde");
		System.out.println("Are all characters unique? " + unique);
	}

	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public static boolean areAllCharactersUnique_Hashtable(String str) {
		if (str == null || str.length() <= 1) {
			return true;
		}

		else {
			Hashtable<Character, Integer> charMap = new Hashtable<Character, Integer>();
			int freq = 0;
			for (int i = 0; i < str.length(); i++) {
				if (charMap.get(str.charAt(i)) == null) {
					charMap.put(str.charAt(i), 1);
				} else {
					freq = charMap.get(str.charAt(i));
					if (freq < 1)
						charMap.put(str.charAt(i), 1);
					else {
						charMap.put(str.charAt(i), freq + 1);
					}
				}
			}

			for (Character sk : charMap.keySet()) {
				System.out.println("Character Key: " + sk + "\tFrequency: " + charMap.get(sk));
			}

			for (Character sk : charMap.keySet()) {
				if (charMap.get(sk) == 1)
					continue;
				else
					return false;
			}
			return true;
		}
	}

	public static boolean areAllCharactersUnique_HashSet(String str) {
		if (str == null || str.length() <= 1)
			return true;
		
		HashSet<Character> charSet = new HashSet<Character>();
		int len = str.length();
		for (int i=0; i<len; i++) {
			if (!charSet.add(str.charAt(i)))
				return false;
		}
		return true;
	}
}
