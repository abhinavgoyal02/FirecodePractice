package Strings;

public class LongestWord {

	public static void main(String[] args) {
		String input = "Thissssssssssss is a bigggEEEEEEEEEE sentennceeee";
		String longestWord = longestWordFinder(input);
		System.out.println("LongestWord=" + longestWord);
	}

	public static String longestWordFinder(String str) {
		if (str == null || str.length() <= 1)
			return str;

		String[] wordList = str.split(" ");
		int len = wordList.length, maxLen = 0, maxPOS = 0;
		for (int i = 0; i < len; i++) {
			if (maxLen < wordList[i].length()) {
				maxLen = wordList[i].length();
				maxPOS = i;
			}
		}

		return wordList[maxPOS];
	}
}

// TreeMap<Integer, String> sortedWords = new TreeMap<Integer, String>();
// for (int i=0; i<len; i++) {
// sortedWords.put(wordList[i].length(), wordList[i]);
// }
// return sortedWords.get(sortedWords.lastKey());
// }
// }