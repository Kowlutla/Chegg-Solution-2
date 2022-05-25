import java.util.Random;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		char operators[] = { '+', '-', '*' };// to store operators
		Random random = new Random();// to get the random numbers
		Scanner sc = new Scanner(System.in);
		// to store number1,number2 and their results
		int number1, number2, result;
		// oper to to random operation,option is for whether or not take another quiz
		char oper, option;
		do {
			number1 = random.nextInt(9) + 1;// generate random number between 1 and 9 store in number1
			number2 = random.nextInt(9) + 1;// generate random number between 1 and 9 store in number2
			oper = operators[random.nextInt(3)];// getting random operator from operators array

			// displaying the equation to user
			System.out.print("what is the result of " + number1 + " " + oper + " " + number2 + "?");
			// getting results from user
			result = sc.nextInt();
			switch (oper)// based on operator
			{
			// if random operator is '+' addition
			case '+': {
				// if results equals to addtion of number1 and number2
				if (result == (number1 + number2)) {
					System.out.println("Very good,this is correct");
				}
				// if results not equals to addition of number1 and number2
				else {
					System.out.println("Incorrect,the correct answer is " + (number1 + number2));
				}
				break;
			}
			// if random operator is '-' addition
			case '-': {
				// if results equals to subtraction of number1 and number2
				if (result == (number1 - number2)) {
					System.out.println("Very good,this is correct");
				}
				// if results not equals to subtraction of number1 and number2
				else {
					System.out.println("Incorrect,the correct answer is " + (number1 - number2));
				}
				break;
			}
			// if random operator is '-' addition
			case '*': {
				// if results equals to multiplication of number1 and number2
				if (result == (number1 * number2)) {
					System.out.println("Very good,this is correct");
				}
				// if results not equals to multiplication of number1 and number2
				else {
					System.out.println("Incorrect,the correct answer is " + (number1 * number2));
				}
				break;
			}
			}
			// Asking user to enter option for whether he/she play another quiz or not
			System.out.print("\nDo you want to try again?");
			option = sc.next().charAt(0);
		} while (option != 'n' && option != 'N');// continue above process until user enter 'n' or 'N'

		// print Goodbye before quit
		System.out.println("\nGoodbye");
		sc.close();
	}
}
