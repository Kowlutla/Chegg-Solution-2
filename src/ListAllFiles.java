import java.io.File;
import java.util.Scanner;

public class ListAllFiles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// asking user to enter file path
		System.out.print("Enter File Path: ");
		String filePath = sc.nextLine();

		// Creating File Object
		File directory = new File(filePath);

		// if entered file is exist and it is type of directory(Folder)
		if (directory.exists() && directory.isDirectory()) {
			// get the all files from directory
			File array[] = directory.listFiles();

			// print files,directories and subdirectories in nested form
			int level = 0;// to hold level
			int index = 0;// to hold the current index in array
			printFiles(array, index, level);
		} else {
			System.out.println("Entered File Path is not Directory");
		}
		sc.close();
	}

	// Method to print file structure recursively
	public static void printFiles(File[] array, int index, int level) {

		// if we reach end of array(means all files are printed) terminate
		if (index == array.length) {
			return;
		}
		// printing tabs for internal sub directories
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}

		// for files
		if (array[index].isFile()) {
			System.out.println(array[index].getName());
		}

		// for sub directories
		if (array[index].isDirectory()) {
			System.out.println(array[index].getName());

			// recursively print sub directories and its files
			printFiles(array[index].listFiles(), 0, level + 1);
		}

		// Recursively print main directory
		printFiles(array, index + 1, level);
	}
}
