import java.util.Scanner;
public class PaymentCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// prompting user to enter loan amount
		System.out.println("Enter loan amount:");
		double loanAmount = sc.nextDouble();

		// prompting user to enter loan period in months
		System.out.println("Enter loan period in months:");
		int numberOfMonths = sc.nextInt();

		// prompting user to enter annual interest rate
		System.out.println("Enter annual interest rate: ");
		double annualInterestRate = sc.nextDouble();

		// calculating monthlyInterestRate
		double monthlyInterestRate = annualInterestRate / 100 / 12;

		// calculating monthlyPayment
		double monthlyPayment = (loanAmount * monthlyInterestRate)
				/ (1 - 1 / (Math.pow(1 + monthlyInterestRate, numberOfMonths)));

		// calculating totalPayment
		double totalPayment = monthlyPayment * numberOfMonths;

		// calculating totalInterest
		double totalInterest = totalPayment - loanAmount;

		// printing all payment details
		System.out.printf("\nMonthly payment: %.2f\n", monthlyPayment);
		System.out.printf("Total payment: %.2f\n", totalPayment);
		System.out.printf("Total interest: %.2f\n", totalInterest);
		sc.close();
	}
}
