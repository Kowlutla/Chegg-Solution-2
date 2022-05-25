import java.util.Scanner;
import java.util.Stack;

public class ReverseNumberInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// prompted to enter how many integer numbers want to store in an array
		System.out.print("enter how many integer numbers want to store in an array:");
		int n = sc.nextInt();

		// creating array with given size
		int array[] = new int[n];

		// prompted to enter each number that to be stored into an array
		for (int i = 0; i < n; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}

		// printing size of array
		System.out.println("Size of array: " + n);

		// printing input array
		System.out.print("Input array: ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println(array[n - 1]);

		// calling method reverseArrayNumbers to reverse each number in array
		reverseArrayNumbers(array, n - 1);
		// printing output array
		System.out.print("Output Array: ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println(array[n - 1]);
		sc.close();
	}

	// method to reverse each number in array using RECURSION
	public static void reverseArrayNumbers(int[] array, int index) {
		if (index < 0)// base condition
		{
			return;
		} else {
			// reverse the current number using reverseNumber method
			int reverse = reverseNumber(array[index]);
			// store the reversed number in current position of array
			array[index] = reverse;
			// recursively call reverseArrayNumbers to reverse all numbers
			reverseArrayNumbers(array, index - 1);
		}
	}

	// method to reverse a number using STACK
	public static int reverseNumber(int number) {

		// create stack of integer
		Stack<Integer> stack = new Stack<Integer>();

		// store the each digit in stack
		while (number != 0) {
			stack.push(number % 10);
			number = number / 10;
		}

		int reverse = 0;// initialize reverse to 0
		int i = 1;// initialize i to 1 (Decimal place)
		while (!stack.isEmpty()) {
			int data = stack.pop();// take current value in stack
			reverse = reverse + (data * i);// add data to reverse with respect to its decimal place
			i = i * 10;// change the decimal place
		}
		return reverse;// return reversed number
	}
}
