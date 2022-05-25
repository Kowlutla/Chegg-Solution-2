import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {

		Random rand = new Random();
		// generating random number between 0-100
		int number = rand.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int guess;
		int count = 0;// to hold number of guesses

		// continue guessing number until some conditions occurred
		while (true) {
			// Asking user to enter guessed number
			System.out.print("Enter your guess: ");
			guess = sc.nextInt();
			// incrementing guessing count
			count++;
			// calculating difference between number and guess number
			int diff = Math.abs(number - guess);
			// If diff is 0 then the user guessed the correct number and stop guessing
			if (diff == 0) {
				System.out.println("user guessed the correct number");
				break;
			}
			// If diff is greater than or equal 50
			else if (diff >= 50) {
				// guess is very high (if the guess is greater than num)
				if (guess > number) {
					System.out.println("guess is very high");
				}
				// very low (if guess is less than num)
				else if (number > guess) {
					System.out.println("guess is very Low");
				}
			}
			// If diff is greater than or equal to 30 and less than 50
			else if (diff >= 30) {
				// guess is high (if the guess is greater than num)
				if (guess > number) {
					System.out.println("guess is high");
				}
				// guess is low (if the guess is lesser than num)
				else if (number > guess) {
					System.out.println("guess is Low");
				}
			}
			// If diff is greater than or equal to 15 and less than 30
			else if (diff >= 15) {
				// guess is moderately high (if the guess is greater than num)
				if (guess > number) {
					System.out.println("guess is moderately high");
				}
				// guess is moderately low (if the guess is lesser than num)
				else if (number > guess) {
					System.out.println("guess is moderately low");
				}
			}
			// If diff is greater than 0 and less than 15
			else if (diff > 0) {
				// guess is somewhat high (if guess is greater than num)
				if (guess > number) {
					System.out.println("guess is somewhat high");
				}
				// guess is somewhat low (if guess is lesser than num)
				else if (number > guess) {
					System.out.println("guess is somewhat low");
				}
			}

			// if number of guesses reaches 5 stop guessing
			if (count == 5) {
				System.out.println("YOU LOSE");
				break;
			}
		}
		sc.close();
	}
}
