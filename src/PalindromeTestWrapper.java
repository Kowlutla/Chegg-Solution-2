import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeTestWrapper {

	final String isMg = "It a palindrome";
	final String isNotMg = "Is NOT a palindrome";

	public static void main(String[] args) {

		new PalindromeTestWrapper();// creating new PalindromeTestWrapper object
	}

	// Constructor
	public PalindromeTestWrapper() {
		Scanner sc = new Scanner(System.in);
		int option;
		String s;
		do {
			System.out.print("Enter String: ");// asking user to enter string
			s = sc.next();
			boolean pal = isPalindrome(s);// call isPalindrome method to check palindrome or not
			if (pal)// if palindrome(true)
			{
				System.out.println(isMg);
			} else// if not palindrome(false)
			{
				System.out.println(isNotMg);
			}
			// Asking user to continue or exit
			// Enter +ve value to continue and enter -ve value or zero to exit
			System.out.println("\nContinue:+ve number\nExit:-ve number or zero");
			System.out.print("Your Option:");// taking option from user
			option = sc.nextInt();
		} while (!(option <= 0));
		System.out.println("* * * Thank you* * * ");
		sc.close();
	}

	// method to check given string is palindrome or not(used Stack and Queue)
	public boolean isPalindrome(String s) {
		// create stack and queue objects
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();

		// Add all characters to stack and queue
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
			queue.add(s.charAt(i));
		}

		// for all characters in stack and queue
		while (!stack.isEmpty() && !queue.isEmpty()) {
			// pop the character from stack and from queue
			// if two characters are not same return false(not palindrome)
			if (stack.pop() != queue.poll()) {
				return false;
			}
		}
		// return true
		return true;
	}
}
