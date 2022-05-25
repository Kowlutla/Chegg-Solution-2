import java.util.Scanner;

public class ProblemSet4 {

	// All these are constants
	static final double SUGAR = 1.5;// sugar to produce 48 cookies
	static final double BUTTER = 1;// Butter to produce 48 cookies
	static final double FLOUR = 2.75;// Flour to produce 48 cookies
	static final int COOKIES = 48;// Number of cookies can produce using above ingredients

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int batches;// asking user to enter no of batches of cookies
		System.out.print("How many batches of cookies do you want? ");
		batches = sc.nextInt();// taking input
		System.out.printf("%d batches?", batches);// printing no of batches statements
		System.out.println(" That's " + batches * COOKIES + " cookies.");// printing no of cookies statements
		System.out.println("Alright, here is what you need");
		System.out.println((SUGAR * batches) + " cups of sugar");// printing how many cups of sugar needed to make
																	// required cookies
		System.out.println((BUTTER * batches) + " cups of butter");// printing how many cups of butter needed to make
																	// required cookies
		System.out.println((FLOUR * batches) + " cups of flour");// printing how many cups of flour needed to make
																	// required cookies
		sc.close();
	}

}
