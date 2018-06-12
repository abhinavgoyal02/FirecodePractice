package Strings;

public class ReplaceAllSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = replace("This is a test","/");
		System.out.println("replace All String= " + result);
	}
	
	public static String replace(String a, String b) {
	    if (a==null || a.length() < 1)
	        return a;
	    else if (a==""){
	        StringBuilder sb = new StringBuilder();
	        
	        return sb.append(b).toString();
	    }
	    
	    else {
	    	StringBuilder sb = new StringBuilder();
	        int l=a.length();
	        for (int i=0; i < l; i++){
	            if (a.charAt(i)!=' '){
	                sb.append(a.charAt(i));
	            }
	            else {
	                sb.append(b);
	            }
	        }
	        return sb.toString();
	    }
	}
}
