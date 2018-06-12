package NumberArrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Nth = 4;
		int Nth_result = fib(Nth);
		System.out.println("The element at postion " + Nth + " of Fibonacci = " + Nth_result);
	}

	public static int fib(int n) {
		if (n == 0)
			return 0;
		else if (n <= 2)
			return 1;
		// else {
		// int first = 1, second = 1, current = first + second;
		// for (int p = 3; p <= n; p++,first = second, second = current) {
		// current = first + second;
		// //System.out.println(p + "th number = " + current);
		// }
		// return current;
		// }
		return fib(n - 1) + fib(n - 2);
	}
}
