package NumberArrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		int Nth = 5000;
		String result = getNthPrime(Nth);
		System.out.println(Nth + "th prime number = " + result);
	}

	public static String getNthPrime(int Nth) {
		if (Nth < 1)
			return "Invalid Input";

		else if (Nth == 1)
			return String.valueOf(2);
		else if (Nth == 2)
			return String.valueOf(3);

		else {
			int input = 5;
			for (int nCount = 2; nCount < Nth; input++) {
				if (isPrime(input))
					nCount++;
			}
			return String.valueOf(input-1);
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
