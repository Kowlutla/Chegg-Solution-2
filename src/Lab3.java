import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		// checking a number is prime or not by passing to method
		System.out.print("Enter a number to check: ");
		int n=sc.nextInt();
		System.out.println(n+" is prime: "+isPrime(n));
		sc.close();
	}

	// method to check given number is prime or not
	public static boolean isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			// if any number completely dividing given number then num is not prime
			if (num % i == 0) {
				return false;
			}
		}

		// if no number completely dividing given number then num is prime
		return true;
	}

}
