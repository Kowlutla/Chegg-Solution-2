import java.util.Scanner;

public class Build_2DArray {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int nRows = Integer.parseInt(console.nextLine());

		// Define arrays
		String[] inputData;
		int data[][] = new int[nRows][];// allocate number of rows

		int ir, ic;
		for (ir = 0; ir < nRows; ir++) {
			System.out.println("Enter a row of comma seperated numbers: ");
			String string = console.nextLine();
			// store the comma seperated values in inputData
			inputData = string.split(",");
			data[ir] = new int[inputData.length];// allocate row length
			// convert above values to integer and store in 2D array
			for (ic = 0; ic < inputData.length; ic++) {
				data[ir][ic] = Integer.parseInt(inputData[ic].trim());
			}
		}

		// printing 2D array
		System.out.println("\n2D array is: ");
		for (ir = 0; ir < nRows; ir++) {
			for (ic = 0; ic < data[ir].length; ic++) {
				System.out.print(data[ir][ic] + " ");
			}
			System.out.println();
		}
		console.close();
	}
}
