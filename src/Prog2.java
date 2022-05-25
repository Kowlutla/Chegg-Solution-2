import java.util.Scanner;

/**
 * This program to calculate the charge for downloading movies by including
 * tax(based on state of residency) and excluding the discount(based on total
 * price for downloading movies)
 * 
 * @author Kowlutla
 * @date 20/09/2020 
 * Pledged!
 *
 */
public class Prog2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Prompting user to enter first name
		System.out.println("Enter your first name: ");
		String firstName = sc.nextLine();

		// Prompting user to enter last name
		System.out.println("Enter your last name: ");
		String lastName = sc.nextLine();

		// Prompting user to enter number of movies downloaded
		System.out.println("Enter the number of movies downloaded: ");
		int noOfMovies = sc.nextInt();

		// //Prompting user to enter price per movie
		System.out.println("Enter the price per movie:");
		double price = sc.nextDouble();

		// //Prompting user to enter state residency
		System.out.println("Enter the state residency:");
		System.out.println("(1 represents the State of Alabama(AL),\n" + " 2 represents the State of Mississippi(MS),\n"
				+ " 3 represents the State of Louisiana(LA),\n"
				+ " and all other integers represents any other states.)");
		int state = sc.nextInt();

		// calculating total payment
		double payment = price * noOfMovies;
		double discount = 0;// initializing discount

		// if payment less than $50
		if (payment < 50) {
			discount = 0;// discount is 0
		}
		// if payment atleast $50 but less than $75
		else if (payment < 75) {
			discount = (payment * 3) / 100;// discount is 3% of payment
		}
		// if payment atleast $70 but less than $100
		else if (payment < 100) {
			discount = (payment * 5) / 100;// discount is 5% of payment
		}
		// if payment atleast $100
		else {
			discount = (payment * 8) / 100;// discount is 8% of payment
		}

		// calculating net payment
		double netPayment = payment - discount;

		double tax = 0;// initialize tax
		// based on state of residency
		switch (state) {
		// if Case1(State is AL)
		case 1:
			tax = (netPayment * 4) / 100;// tax is 4% of netPayment
			break;
		// if Case2(State is MS)
		case 2:
			tax = (netPayment * 7) / 100;// tax is 7% of netPayment
			break;
		// if Case3(State is LA)
		case 3:
			tax = (netPayment * 4.45) / 100;// tax is 4.45% of netPayment
			break;
		// Any other states
		default:
			tax = (netPayment * 2) / 100;// tax is 2% of netPayment
			break;
		}

		// calculating total Charge
		double totalCharge = netPayment + tax;

		// printing All the information
		System.out.println("\nFull name: " + firstName + " " + lastName);
		System.out.println("Number of movies downloaded: " + noOfMovies);
		System.out.println("Price per movie: " + price);
		System.out.println("Net payment: " + netPayment);
		System.out.println("Tax: " + tax);
		System.out.println("Total charge: " + totalCharge);
		sc.close();
	}
}
