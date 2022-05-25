import java.util.Scanner;
//Class PrintHex
public class PrintHex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;// input integer number
		do {
			// Asking user to enter number
			System.out.print("enter a number:");
			number = sc.nextInt();
			// call intToHex Method and store results in hexValue
			String hexValue = intToHex(number);
			// print the hexValue
			System.out.println(hexValue);
		} while (number >= 0);
		// Continue above process until user enter negative number
		sc.close();
	}
	//Method to convert integer to hexDecimal value
	public static String intToHex(int number) {
		//Create StringBuilder Object to store hexadecimal value
		StringBuilder builder = new StringBuilder();
		//if number greater than 0
		if (number >0) {
			//recursively call the intToHex method 
			String hexNumber = intToHex(number / 16);
			//hexCode is digits in HexaDecimal representation
			String hexCode = "0123456789ABCDEF";
			//get the current digit from number
			int hexDigit = number % 16;
			//append the character present at hexDigit in hexCode
			builder.append(hexNumber + hexCode.charAt(hexDigit));
		}
		//return builder by converting into String
		return builder.toString();
	}
}
