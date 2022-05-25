import java.util.Scanner;

public class Fibnocii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Input: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Output:");

		long start=System.nanoTime();
		// Since fibonacci series start from 0
		// for mth number we need to consider as m-1
		for (int i = m - 1; i < n; i++) {
			long result = fibonacci(i);
			System.out.print(result + " ");
		}
		
		long end=System.nanoTime();
		System.out.println("\nDuration: "+(end-start));
		sc.close();
	}
	// method to return nth number in fibnocii series
	public static int fibonacci(int n) {
		// base case(if n is 0 or 1)
		if (n < 2) {
			return 1;
		} else // other wise
		{
			// return sum of fibonacci(n-1) and fibonacci(n-2)
			return fibonacci((n - 1)) + fibonacci((n - 2));
		}
	}
}
