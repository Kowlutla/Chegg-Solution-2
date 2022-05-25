import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		char triangleChar;// symbol
		int triangleHeight;// height
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");// Asking user to enter character
		triangleChar = sc.next().charAt(0);
		System.out.println("Enter triangle height: ");// Asking user to enter Height
		triangleHeight = sc.nextInt();

		// starts from line1 to height
		for (int i = 1; i <= triangleHeight; i++) {
			for (int j = 1; j <= i; j++)// print symbol along with space after symbol for i times
			{
				System.out.print(triangleChar + " ");
			}
			System.out.println();// printing new line
		}
	}
}
