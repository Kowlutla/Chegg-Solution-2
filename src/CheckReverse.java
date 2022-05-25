import java.util.Stack;

public class CheckReverse {
	public static void main(String[] args) {

		// checking two strings "Hello" and "olleH" are reverse to each other or not
		System.out.println("checkReverse(\"Hello\",\"olleH\")- - > " + checkReverse("Hello", "olleH"));

		// checking two strings "Hello" and "Ahead" are reverse to each other or not
		System.out.println("checkReverse(\"Hello\",\"Ahmad\")- - > " + checkReverse("Hello", "Ahmad"));
	}

	// method to check two strings are reverse to each other
	public static boolean checkReverse(String string1, String string2) {
		// if the two string having different length they never reverse
		if (string1.length() != string2.length()) {
			return false;
		}
		// Creating stack Object(I am using predefined Stack)
		Stack<Character> stack = new Stack<Character>();

		// push all string1 characters into stack
		// stack will store the characters of string1 in reverse order(LIFO order)
		for (int i = 0; i < string1.length(); i++) {
			stack.push(string1.charAt(i));
		}

		/*
		 * compare all characters in string2 and stack
		 */
		int index = 0;
		while (!stack.isEmpty() && index < string2.length()) {
			/*
			 * compare current stack top character and current string2 character if not same
			 * return as false
			 */
			if (stack.peek() != string2.charAt(index)) {
				return false;
			}
			// pop the character from stack
			stack.pop();
			// increment the index for next character in string 2
			index++;
		}
		// return true if all characters matched in stack and string2
		return true;
	}
}
