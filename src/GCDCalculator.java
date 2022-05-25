
public class GCDCalculator {

	// Function to find greatest common divisor
	public static int Euclid(int m, int n) {
		// step1:Check n is 0 or not
		// if n is 0 return m otherwise go to step2
		while (n != 0) {
			// step2:divide m by n and assign value of reminder to r
			int r = m % n;
			// Step3:Assign value of n to m and value of r to n and go Step1
			m = n;
			n = r;
		}
		return m;

	}

	public static void main(String[] args) {

		// Calling Euclid method to find GCD of 21 and 9
		System.out.println("GCD Of(21,9): " + Euclid(21, 9));
	}
}
