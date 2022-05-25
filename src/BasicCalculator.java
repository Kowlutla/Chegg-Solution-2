
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		// Scanner Object to take inputs
		Scanner scanner = new Scanner(System.in);
		double number1, number2;
		// Asking user to enter first number
		System.out.print("Enter first number:");
		number1 = scanner.nextDouble();

		// Asking user to enter second number
		System.out.print("Enter second number:");
		number2 = scanner.nextDouble();

		// Asking user to enter an operator to perform
		System.out.print("Enter an operator(+,-,*,/): ");
		char operator = scanner.next().charAt(0);

		// if operator is '+' add number1 and number2
		if (operator == '+') {
			System.out.println("* * * chosen Operation is ADDITION * * *");
			System.out.println(number1 + " " + operator + " " + number2 + ": " + (number1 + number2));
		}
		// if operator is '-' subtract number1 and number2
		else if (operator == '-') {
			System.out.println("* * * chosen Operation is SUBTRSCTION * * *");
			System.out.println(number1 + " " + operator + " " + number2 + ": " + (number1 - number2));
		}
		// if operator is '*' multiplicate number1 and number2
		else if (operator == '*') {
			System.out.println("* * * chosen Operation is MULTIPLICATION * * *");
			System.out.println(number1 + " " + operator + " " + number2 + ": " + (number1 * number2));
		}

		// if operator is '/' divid number1 with number2
		else if (operator == '/') {
			System.out.println("* * * chosen Operation is DIVISION * * *");
			System.out.println(number1 + " " + operator + " " + number2 + ": " + (number1 / number2));
		}
		// any other character print invalid operator
		else {
			System.out.println("Invalid Operator");
		}
		scanner.close();
	}
}
