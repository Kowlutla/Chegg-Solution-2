package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		// creating File instance to reference text file in Java
		// Make sure you need to pass correct File path to File Constructor
		File file = new File("wordlist1-1000.txt");

		// Creating Scanner instance to read File in Java
		Scanner sc = new Scanner(file);

		// initialize count of longer than 5 to 0
		int longerThanFive = 0;
		// initialize count of lesser than 6 to 0
		int below6 = 0;

		// Reading each line of file using Scanner class
		while (sc.hasNext()) {
			// take the current word in text
			String s = sc.next();

			// if current word length is greater than 5
			if (s.length() > 5) {
				longerThanFive++;// increment count of longer than 5
			}
			// if current word length is lesser than 6
			else if (s.length() < 6) {
				below6++;// increment count of lesser than 6
			}
		}

		// printing file name
		System.out.println("File: " + file);
		// printing Number of words with 5 or less characters
		System.out.println("Number of words with 5 or less characters: " + below6);
		// printing Number of words with 6 or more characters
		System.out.println("Number of words with 6 or more characters: " + longerThanFive);
		sc.close();
	}
}
