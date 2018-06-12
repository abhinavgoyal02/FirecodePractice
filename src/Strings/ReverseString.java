package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String str="abcde";
		String result = reverseString(str);
		System.out.println("Reversed String = " + result);

	}

	public static String reverseString(String str){
	    StringBuilder sb = new StringBuilder();
	    if (str == null)
	    return null;
	    
	    else if (str.length() <=1)
	        return str;
	        
	    else {
	        int l=str.length()-1;
	        for (int i=0; i<=l; i++){
	            sb.append(str.charAt(l-i));
	        }
	        return sb.toString();
	    }

	}
}
