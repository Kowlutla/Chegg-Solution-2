import java.util.Scanner;

public class CeaserCipher {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Asking user to enter message
		System.out.println("Enter Message: ");
		String msg = sc.nextLine();
		// Asking user to enter key to encrypt and decrypt
		System.out.println("Enter key: ");
		int key = sc.nextInt();
		
		// round the key to 26(if user enter any key)
		key = key % 26;
		// printing original message
		System.out.println("Original messge: ");
		System.out.println(msg);
		// printing key
		System.out.println("Key: " + key);

		// encrypting message by calling encrypt method by passing message and key
		String encrypted_message = encrypt(msg, key);
		// printing encrypted message
		System.out.println("Encrypted message: ");
		System.out.println(encrypted_message);

		// decrypting message by calling decrypt method by passing encrypted message and key
		String decrypted_message = decrypt(encrypted_message, key);
		//// printing decrypted message
		System.out.println("Decryped message: ");
		System.out.println(decrypted_message);
		sc.close();
	}

	// Method to encrypt the message s with given key
	public static String encrypt(String s, int key) {
		// create a StringBuffer Object
		StringBuffer ss = new StringBuffer();
		//for all characters in message
		for (int i = 0; i < s.length(); i++) {
			// get the current character ascii value
			int k = (int) s.charAt(i);
			// if ascii value is either small or capital alphabets
			if (k >= 65 && k <= 90 || k >= 97 && k <= 122) {
				// if character ascii value capital alphabet
				if (k >= 64 && k <= 90) {
					// shift the current character by +'key' times
					k = k + key;
					// if any character not in range of capital alphabet
					if (k > 90) {
						// round back to capital alphabet and add to stringBuffer
						k = k - 26;
						ss = ss.append((char) k);
					} else {
						// if shifted character is in range of capital alphabets
						// add to stringBuffer
						ss = ss.append((char) k);
					}
				}
				// if character ascii value small alphabet
				if (k >= 97 && k <= 122) {
					// shift the current character by +'key' times
					k = k + key;
					// if any character not in range of small alphabet
					if (k > 122) {
						// round back to small alphabet and add to stringBuffer
						k = k - 26;
						ss = ss.append((char) k);
					} else {
						// if shifted character is in range of small alphabets
						// add to stringBuffer
						ss = ss.append((char) k);
					}
				}
			} else // if any other character
			{
				// add to stringBuffer
				ss = ss.append(s.charAt(i));
			}
		}
		// return by converting stringBuffer into String
		return ss.toString();
	}

	// Method to decrypt the message s with given key
	public static String decrypt(String s, int key) {
		// Create a StringBuffer Object
		StringBuffer ss = new StringBuffer();
		//for all characters in string
		for (int i = 0; i < s.length(); i++) {
			// get the current character ascii value
			int k = (int) s.charAt(i);
			// if ascii value is either small or capital alphabets
			if (k >= 65 && k <= 90 || k >= 97 && k <= 122) {
				// if character ascii value capital alphabet
				if (k >= 65 && k <= 90) {
					// shift the current character by -'key' times
					k = k - key;
					// if any character not in range of capital alphabet
					if (k < 65) {
						// round back to capital alphabet and add to stringBuffer
						k = k + 26;
						ss = ss.append((char) k);
					} else {
						// if shifted character is in range of capital alphabets
						// add to stringBuffer
						ss = ss.append((char) k);
					}
				}
				// if character ascii value small alphabet
				if (k >= 97 && k <= 122) {
					// shift the current character by -'key' times
					k = k - key;
					// if any character not in range of small alphabet
					if (k < 97) {
						// round back to small alphabet and add to stringBuffer
						k = k + 26;
						ss = ss.append((char) k);
					} else {
						// if shifted character is in range of small alphabets
						// add to stringBuffer
						ss = ss.append((char) k);
					}
				}
			} else // if any other character
			{// add to stringBuffer
				ss = ss.append(s.charAt(i));
			}
		}
		// return by converting stringBuffer into String
		return ss.toString();
	}
}