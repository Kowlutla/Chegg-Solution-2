import java.util.Scanner;

public class TelephoneNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		for(int j=1;j<=10;j++) {
		System.out.print("Please enter a telephone number using letter : ");
		String s = in.nextLine().toUpperCase();
		s = s.replaceAll(" ", "");// remove all spaces from given input
		char ch;
		int count = 0;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			switch (ch) {
			case 'A':
			case 'B':
			case 'C':
				ch = '2';
				break;
			case 'D':
			case 'E':
			case 'F':
				ch = '3';
				break;
			case 'G':
			case 'H':
			case 'I':
				ch = '4';
				break;
			case 'J':
			case 'K':
			case 'L':
				ch = '5';
				break;
			case 'M':
			case 'N':
			case 'O':
				ch = '6';
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				ch = '7';
				break;
			case 'T':
			case 'U':
			case 'V':
				ch = '8';
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				ch = '9';
				break;
			}
			if (Character.isDigit(ch)) {
				result = result + ch;
				count++;
			}
			if (count == 3) {
				result = result + "-";
			}
			if (count == 7) {
				break;
			}
		}
		System.out.println(result);
		System.out.println();
		}
		in.close();
	}
}
