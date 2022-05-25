import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.print("\nEnter distance in meters: ");// asking user to enter distance in meters
			double distance = sc.nextInt();
			// display menu
			System.out.println("\na.Convert to kilometers\nb.Convert to Inches\nc.Convert to Feets\nd.Quit the program");
			System.out.print("Enter Your choice: ");
			choice = sc.next().toLowerCase().charAt(0);// accept the choice

			switch (choice) {
				case 'a':// if choose 'a' convert to kilo meters
				{
					toKilometer(distance);
					break;
				}
				case 'b':// if choose 'b' convert to inches
				{
					toInches(distance);
					break;
				}
				case 'c':// if choose 'c' convert to to feets
				{
					toFeets(distance);
					break;
				}
				case 'd':// if choose 'd' quit the program
				{
					break;
				}
				default:// any other entry error message
				{
					System.out.println("Invalid choice....");
					break;
				}

			}
		} while (choice != 'd');

		sc.close();
	}
	// method to convert meters to kilo meters
	public static void toKilometer(double meter) {
		System.out.println("Meters: " + meter + "\tKilo Meters: " + (meter * 0.001));
	}
	// method to convert meters to inches
	public static void toInches(double meter) {
		System.out.println("Meters: " + meter + "\tInches: " + (meter * 39.37));
	}
	// method to convert meters to feets
	public static void toFeets(double meter) {
		System.out.println("Meters: " + meter + "\tFeets: " + (meter * 3.281));
	}
}
