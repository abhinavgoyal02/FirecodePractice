package Strings;

public class IsStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isStringPalindrome_Recursive("missim");
		System.out.println("Is String Palindrome? " + result);
	}

	public static boolean isStringPalindrome_Iterative(String str) {
		if (str == null || str.length() <= 1)
			return true;

		else {
			int l = str.length() - 1;
			for (int i = 0; i <= l / 2; i++) {
				if (str.charAt(i) == str.charAt(l - i)) {
					continue;
				} else
					return false;
			}
			return true;
		}
	}

	public static boolean isStringPalindrome_Recursive(String str) {
		int len = str.length() - 1;
		if (str == null || len <= 1)
			return true;

		else
			return str.charAt(0) == str.charAt(len) && isStringPalindrome_Recursive(str.substring(1, len));
	}
}
