
import java.util.Scanner;
public class UnderGraduate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// prompting user to enter completed credit hours
		System.out.print("Enter number of credit hours completed: ");
		int creditHours = sc.nextInt();
		// if creditHours between 0-29 hours
		if (creditHours <= 29) {
			System.out.println("Freshman");
		}
		// if creditHours between 30-59 hours
		else if (creditHours <= 59) {
			System.out.println("Sophomore");
		}
		// if creditHours between 60-89 hours
		else if (creditHours <= 89) {
			System.out.println("Junior");
		}
		// if creditHours 90 hours or more
		else {
			System.out.println("Senior");
		}
		sc.close();
	}
}
