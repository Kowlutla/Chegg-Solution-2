import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner console = new Scanner(System.in);

		// Prompt user to enter input file name
		System.out.print("Enter the input file name: ");
		String fileName = console.nextLine();

		// Create list to to store lines of text from input file
		ArrayList<String> list = new ArrayList<String>();
		// Scanner Object to read list from input file
		Scanner scanner = new Scanner(new File(fileName));

		/*
		 * Calling read list method to read data from input file and store in list
		 */

		readData(list, scanner);

		int size = list.size();// number of lines in input file

		System.out.println();
		int line;// to take line number from user

		// infinate loop
		while (true) {

			// showing how many lines in input file
			System.out.printf("The file has %d lines.\n", size);

			// prompting user to enter line number
			System.out.print("Enter a line number [0 to quit]: ");
			line = console.nextInt();

			// if user enter '0' stop
			if (line == 0) {
				break;
			}
			// if user entered line is higher than size of input file,display error
			else if (line > size) {
				System.out.println("ERROR: line number must be less than " + size + ".");
			}
			// Otherwise print the content of entered line
			else {
				System.out.println(line + ": " + list.get(line - 1));
			}

		}

		console.close();
	}
	/**
	 * 
	 * @param list     :list to hold data of input file
	 * @param scanner: to read the data from input file
	 */
	private static void readData(ArrayList<String> list, Scanner scanner) {
		// if file contain more line
		while (scanner.hasNextLine()) {
			// take the current line from file
			String line = scanner.nextLine();
			// add that line to list
			list.add(line);
		}
	}
}
