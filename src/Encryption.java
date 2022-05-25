import java.util.Random;
import java.util.Scanner;
public class Encryption {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// Asking user to enter plain text
		System.out.println("Enter the plaintext to encrypt: ");
		String text = sc.nextLine();

		// Asking user to enter key(either -ve or +Ve)
		System.out.println("Enter an Encryption key: ");
		int key = sc.nextInt();

		// Generating salt value by using above key
		int salt = rand.nextInt(Math.abs(key)) + 1;

		// printing important statements
		System.out.println("The key is - " + key + " and the salt value is - " + salt);
		System.out.println("The Plaintext is - " + text);

		// calculating saltedEncryptionKey
		int saltedEncryptionKey = key + salt;

		/*
		 * Calling encryptText method by passing text and saltedEncryptionKey and store
		 * the results in cipher
		 */
		String cipher = encryptText(text, saltedEncryptionKey);

		// printing encrypted text
		System.out.println("The Cipher text is - " + cipher);
		sc.close();
	}

	/*
	 * Method to encrypt the given text by shifting key number of characters and
	 * return the resulted string as encrypted tect
	 */
	public static String encryptText(String text, int key) {

		// creating StringBuffer object to store encrypted text
		StringBuffer result = new StringBuffer();
		// change the text to upper case
		text = text.toUpperCase();

		// Look for entire text
		for (int i = 0; i < text.length(); i++) {
			// if current character is letter
			if (Character.isLetter(text.charAt(i))) {
				// shift the current letter by key characters
				char ch = (char) (((int) text.charAt(i) + key));
				/*
				 * After shifting current letter is less than 65(A) (which means key is
				 * negative) add 26 to it
				 */
				if (ch < 65) {
					ch += 26;
				}
				/*
				 * After shifting current letter is greater than 90(Z) (which means key is
				 * positive) subtract 26 to it
				 */
				else if (ch > 90) {
					ch -= 26;
				}
				// add shifted letter to string buffer object
				result.append(ch);
			} else// if any other characters do not do any modifications
			{
				result.append(text.charAt(i));
			}
		}

		// return resulted encrypted text in string form
		return result.toString();
	}
}
