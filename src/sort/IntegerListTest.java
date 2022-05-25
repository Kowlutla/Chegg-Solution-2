package sort;

// ****************************************************************
// IntegerListTest.java
// ****************************************************************
import java.util.Scanner;

public class IntegerListTest {
	static IntegerList list = new IntegerList(10);
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}

	public static void dispatch(int choice) {
		int loc;
		switch (choice) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			System.out.println("How big should the list be?");
			int size = scan.nextInt();
			list = new IntegerList(size);
			list.randomize();
			break;
		case 2:
			list.selectionSort();
			break;
		case 3:
			System.out.print("Enter the value to look for: ");
			loc = list.search(scan.nextInt());

			if (loc != -1)
				System.out.println("Found at location " + loc);
			else
				System.out.println("Not in list");
			break;
		case 4:
			list.print();
			break;
		case 5:
			System.out.println("Enter old value you want to replace: ");
			int oldVal = scan.nextInt();
			System.out.println("Enter new value: ");
			int newVal = scan.nextInt();
			list.replaceFirst(oldVal, newVal);
			break;
		case 6:
			System.out.println("Enter the old value: ");
			int oldVal2 = scan.nextInt();
			System.out.println("Enter new value: ");
			int newVal2 = scan.nextInt();
			list.replaceAll(oldVal2, newVal2);
			break;
		case 7:
			list.sortDecreasing();
			break;
		case 8:
			System.out.println("What number would you like?");
			int answer = scan.nextInt();
			list.binarySearch(answer);
			break;

		default:
			System.out.println("Sorry, invalid choice");
		}
	}

//------------------------------------------------------
// Print the user's choices
//------------------------------------------------------
	public static void printMenu() {
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Create a new list (** do this first!! **)");
		System.out.println("2: Sort the list using selection sort");
		System.out.println("3: Find an element in the list using linear search");
		System.out.println("4: Print the list");
		System.out.println("5: Replace a value");
		System.out.println("6: Replace all values");
		System.out.println("7: Sort in decreasing number");
		System.out.println("8: Find the number");
		System.out.print("\nEnter your choice: ");
	}
}