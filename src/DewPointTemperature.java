import java.util.Scanner;

public class DewPointTemperature {

	// variables a,b values
	static double a = 17.27;
	static double b = 237.7;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Asking user to enter Relative Humidity
		System.out.print("Enter Relative Humidity( between 0-1): ");
		double RH = sc.nextDouble();

		// Asking user to enter temperature
		System.out.print("Enter temperature(in degrees C):");
		double T = sc.nextDouble();

		// Calculating f(T,RH) using method
		double ftrh = function(T, RH);

		// Finding dew point temperature using formula
		double Td = (b * ftrh) / (a - ftrh);

		// printing dew point temperature
		System.out.println("Dew Point temperature: " + Td);
		sc.close();

	}

	// Method to calculate f(T,RH)
	public static double function(double T, double RH) {

		double temp = Math.log(RH);// ln(RH)
		double numerator = a * T;// a*T
		double denominator = b + T;// b+T
		return (numerator / denominator) + temp;// f(T,RH)=((a*T)/(b+T))+ln(RH)
	}

}
