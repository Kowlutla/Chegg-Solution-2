
import java.util.Scanner;
public class BCDEncoderDecoder {
	public static void main(String[] args) {
		int repeat;
		Scanner sc = new Scanner(System.in);
		do {
			// displaying menu
			System.out.println("Select Menu:\n1.Encode\n2.Decode");
			int option = sc.nextInt();
			if (option == 1)// if option is 1 perform encode
			{
				System.out.print("Enter decimal value(0-9): ");
				int decimal = sc.nextInt();
				Encode(decimal);
			} else if (option == 2)// if option is 2 perform Decode
			{
				System.out.println("Enter BCD String(0,s and 1's): ");
				String bcd = sc.next();
				Decode(bcd);
			} else// invalid option
			{
				System.out.println("Invalid Input Option");
			}
			// Asking your to perform again or not(0 to exit and any digit to repeat again)
			System.out.println("\n\nRepeatAgain:AnyDigit\nExit:0");
			repeat = sc.nextInt();
		} while (repeat != 0);
		System.out.println("Thank You For using..");
		sc.close();
	}
	// Method to Encode decimal number to BCD
	public static void Encode(int n) {
		StringBuffer sb = new StringBuffer("");
		int temp = n;
		// extract the every bit in number and add to string buffer
		while (n != 0) {
			int bit = n % 2;
			sb.append(bit);
			n = n / 2;
		}
		// reverse string buffer and convert into string
		String bcd = sb.reverse().toString();

		// if bcd string length less than 4 add 0's before bcd string
		while (bcd.length() < 4) {
			bcd = "0" + bcd;
		}
		// print string
		System.out.println(temp + " BCD Value: " + bcd);
	}

	// method to Decode BCD to Decimal
	public static void Decode(String bcd) {
		int num = 0;
		// to convert bcd string to decimal value
		for (int i = 0; i < bcd.length(); i++) {
			int value = Integer.parseInt(String.valueOf(bcd.charAt(i)));
			num = 2 * num + value;
		}

		if (num > 9)// if decimal value is greater than 9 invalid else print decimal number
		{
			System.out.println("Invalid Number");
		} else {
			System.out.println(bcd + " Decimal Value: " + num);
		}
	}
}
