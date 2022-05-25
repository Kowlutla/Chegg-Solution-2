
import java.util.Scanner;

public class TensDigit {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int first = keyboard.nextInt();
		int second = keyboard.nextInt();

		System.out.println(tensDigitsEqual(first, second));

		keyboard.close();
	}

	public static boolean tensDigitsEqual(int first, int second) {

		// finding digit present at tens place of first number
		int temp1 = (first % 100) / 10;// we can use (first/10)%10;

		// finding digit present at tens place of second number
		int temp2 = (second % 100) / 10;// we can use (second/10)%10;

		// return true is both digits are same otherwise return false
		return temp1 == temp2;
	}

}
