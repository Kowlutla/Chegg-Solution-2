import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fileMerge("file1.txt", "file2.txt", "words.txt");
	}

	private static void fileMerge(String filename1, String filename2, String filename3) {
		// TODO Auto-generated method stub
		Scanner str1 = null;
		Scanner str2 = null;
		PrintWriter output = null;

		try {
			str1 = new Scanner(new File(filename1));
			str2 = new Scanner(new File(filename2));
			output = new PrintWriter(new File(filename3));

			fileWriter(str1, str2, output);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			// e.printStackTrace();

		} finally {
			if (str1 != null)
				str1.close();
			if (str2 != null)
				str2.close();
			if (output != null)
				output.close();

		}
	}

	/**
	 * 
	 * @param str1   Scanner for file1.txt
	 * @param str2   Scanner for file2.txt
	 * @param output PrintWriter for words.txt file
	 */
	private static void fileWriter(Scanner str1, Scanner str2, PrintWriter output) {
		// TODO Auto-generated method stub
		String s1 = null;// get the words from file1
		String s2 = null;// get the words from file2
		if (str1.hasNextLine()) {
			s1 = str1.nextLine();
		}
		if (str2.hasNextLine()) {
			s2 = str2.nextLine();
		}

		while (s1 != null && s2 != null) {
			if (s1.compareTo(s2) < 0) {
				output.println(s1);
				if (str1.hasNextLine())
					s1 = str1.nextLine();
				else {
					s1 = null;
				}
			} else if (s1.compareTo(s2) > 0) {
				output.println(s2);
				if (str2.hasNextLine())
					s2 = str2.nextLine();
				else {
					s2 = null;
				}
			}
		}

		// for remaining words in File1
		while (s1 != null) {
			output.println(s1);
			if (str1.hasNextLine())
				s1 = str1.nextLine();
			else {
				s1 = null;
			}
		}

		// for remaining words in File2
		while (s2 != null) {
			output.println(s2);
			if (str2.hasNextLine())
				s2 = str1.nextLine();
			else {
				s2 = null;
			}
		}

	}

}