package NumberArrays;

public class PrintUntilN {

	public static void main(String[] args) {
		String result = PrintUntilN_recursive(20);
		System.out.println(result);
	}
	
	public static String PrintUntilN_recursive(int n) {
		if (n==1)
			return Integer.toString(n);
		else {
			return PrintUntilN_recursive(n-1) + " " + n;
		}
	}

}
