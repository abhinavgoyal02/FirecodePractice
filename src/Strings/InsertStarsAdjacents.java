package Strings;

public class InsertStarsAdjacents {
	public static void main(String[] args) {
		String str = "abba";
		String result = insertPairStar(str);
		System.out.println("The string with stars inserted for adjacent duplicates = " + result);
	}

	//Working solution copied from Firecode
	public static String insertPairStar(String s) {
		if (s == null || s.length() <= 1)
			return s;

		else if (s.substring(0, 1).equals(s.substring(1,2))) {
			return s.substring(0,1) + "*" + insertPairStar(s.substring(1,s.length()));
		}
		return s.substring(0,1) + insertPairStar(s.substring(1,s.length()));
	}
}
