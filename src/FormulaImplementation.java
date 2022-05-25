import java.util.Scanner;

public class FormulaImplementation {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// asking user to enter P from range 10-10000
		System.out.print("Enter P(10-10000):");
		int p = sc.nextInt();
		// i=p-1
		int i = p - 1;
		// to generate binary sequence of length i
		// (start from 0 because i is non-negative number)
		for (int temp = 0; temp < i; temp++) {
			// printing current number in sequence by calling
			System.out.print(formulaResults(p, temp) + " ");
		}
		sc.close();
	}
	// Problem 3 Solution
	public static int formulaResults(int p, int i) {
		int a = (int) ((Math.pow(2, i) % p) % 2);
		return a;
	}
}
