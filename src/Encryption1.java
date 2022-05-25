import java.util.Scanner;

public class Encryption1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter message to encrypt: ");
		String message = sc.nextLine();
		String result = encrypt(message);
		System.out.println("Encrypted Message is: \n" + result);
		sc.close();
	}

	// Method to encrypt the message
	public static String encrypt(String message) {
		// Create StringBuffer Object to hold encrypted message
		StringBuffer result = new StringBuffer();
		// for all letters in message
		for (int i = 0; i < message.length(); i++) {
			// take the current character
			char current = message.charAt(i);

			// if current character is Uppercase
			// converted to its successor
			if (current >= 'A' && current <= 'Z') {
				// if current character is UpperCase 'Z'
				// add the 'A' to result
				if (current == 'Z') {
					result.append('A');
				}
				// Otherwise add its successor to result
				else {
					result.append((char) (current + 1));
				}
			}
			// if current character is lowercase
			// converted to its successor
			else if (current >= 'a' && current <= 'z') {
				// if current character is UpperCase 'z'
				// add the 'a' to result
				if (current == 'z') {
					result.append('a');
				}
				// Otherwise add its successor to result
				else {
					result.append((char) (current + 1));
				}
			}
			// if current character is digit
			// converted to its predecessor except 0
			else if (current >= '0' && current <= '9') {
				// if current character is digit '0'
				// add the '9' to result
				if (current == '0') {
					result.append('9');
				}
				// Otherwise add its predecessor to result
				else {
					result.append((char) (current - 1));
				}
			} else {//if any other character add to result
				result.append(current);
			}
		}
		//return result as String
		return result.toString();
	}
}
