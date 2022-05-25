import java.util.Scanner;

public class Packing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Asking user to enter Number of things to pack for person1
		System.out.print("Number of things to pack for person1: ");
		int person1 = sc.nextInt();
		// Asking user to enter Number of things to pack for person2
		System.out.print("Number of things to pack for person1: ");
		int person2 = sc.nextInt();

		if (person1 == 0 || person2 == 0)// if either values are 0
		{
			System.out.println("No zero values! Exiting!");
		} 
		else if (person1 > person2)// if person1 things are more than person2 things
		{
			System.out.printf("Person 1 has %d more things to pack.", (person1 - person2));
		}
		else if (person2 > person1)// if person2 things are more than person1 things
		{
			System.out.printf("Person 2 has %d more things to pack.", (person2 - person1));
		} else// if both persons have same no of items
		{
			System.out.println("Same amount to pack!");
		}
		sc.close();
	}
}
