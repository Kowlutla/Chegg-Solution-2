import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataTest {
	public static void main(String args[]) {
		// TODO1: assign the String variable fileName to the correct path and filename
		// for the text file
		// whitmanpoem.txt. Note: do not move the file from its location. String
		// fileName = "";

		String fileName = ":whitmanpoem.txt";
		// TODO2: put all of the following code in a try/catch block. Catch an
		// IOException
		// in the catch part and print the stack trace.
		FileReader fr = null;
		File file = new File(fileName);
		try {
			fr = new FileReader(file);
			
			char[] arr = new char[50];
			for (char charLetter : arr) {
				// reads the content to the array
				fr.read(arr);
				// prints the characters one by one }
				System.out.print(charLetter);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
		
		// TODO3: add a finally clause inside which you have a try/catch block: Try to
		// close the FileReader,
		// and Catch an IOException in the catch part and print the stack trace.
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}