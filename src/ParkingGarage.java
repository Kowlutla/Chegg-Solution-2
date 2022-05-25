import java.text.DecimalFormat;
import java.util.Scanner;

public class ParkingGarage {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		// getting how many test cases from user
		int tests = keyboard.nextInt();
		// create two dimensional array to store values
		double values[][] = new double[tests][2];
		// get tests*2 values from user and store in values array
		for (int i = 0; i < tests; i++) {
			for (int j = 0; j < 2; j++) {
				values[i][j] = keyboard.nextDouble();
			}
		}

		// in values array each row is inputs for each test case
		// for all test cases
		for (int i = 0; i < tests; i++) {
			// get the starting time of current test case
			double start = values[i][0];
			// get the ending time of current test case
			double end = values[i][1];

			// calculate the difference between end and start time
			double dif = end - start;
			// initialize the total to zero
			double total = 0;
			// if dif is less than or equal to 3.0 the charge is RM3.0
			if (dif <= 3.0) {
				total = 3.0;
			}
			// if dif id greater than 3 then add additional RM0.50 per hour
			else {
				total = 3.0 + (dif - 3 + 1) * 0.5;
			}
			// if total is greater than RM10.0 then make is as RM10.0 which is maximum
			// charge
			if (total > 10.0) {
				total = 10.0;
			}
			// print the total using decimal format along with Test case number
			System.out.println("Case #" + (i + 1) + ": " + "RM" + df.format(total));
		}
		keyboard.close();
	}
}
