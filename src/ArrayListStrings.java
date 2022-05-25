import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListStrings {

	static ArrayList<String> list = new ArrayList<String>();// arraylist of string

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int option;
		do {
			// printing option menu
			System.out.println("\n1.FillRand\n2.Print\n3.Set at\n4.Remove at index"
					+ "\n5.Remove String\n6.Remove all occurences\n7.Print at\n8.Get Range\n9.Set Range"
					+ "\n10.Min of All\n11.End");

			// taking option from user
			System.out.print("Enter your Choice: ");
			option = sc.nextInt();

			switch (option) {
			case 1:// if selected 1 Fill Rand
			{
				System.out.println("* * * Selected Fill Rand * * *");
				System.out.println("Enter No of names: ");
				int n = sc.nextInt();
				fillRand(n);
				break;
			}
			case 2:// if selected 2 print
			{
				System.out.println("* * * Selected Print * * *");
				print();
				break;
			}
			case 3:// if selected 3 Set at
			{
				System.out.println("* * * Selected Set at * * *");
				System.out.print("Enter index: ");
				int index = sc.nextInt();
				System.out.print("Enter string: ");
				String s = sc.next();
				setAt(index, s);
				break;
			}
			case 4:// if selected 4 remove at
			{
				System.out.println("* * * Selected to remove at * * *");
				System.out.print("Enter index: ");
				int index = sc.nextInt();
				removeIndex(index);
				break;
			}
			case 5:// if selected 5 Remove string
			{
				System.out.println("* * * Selected Remove string* * *");
				System.out.print("Enter String: ");
				String s = sc.next();
				removeString(s);
				break;
			}
			case 6:// if selected 6 Remove all occurrences
			{
				System.out.println("* * * Selected Remove all occurences * * *");
				System.out.print("Enter String: ");
				String s = sc.next();
				removeAllOccurrenceS(s);
				break;
			}
			case 7:// if selected 7 Print at
			{
				System.out.println("* * * Selected Print at * * *");
				System.out.print("Enter index: ");
				int index = sc.nextInt();
				String value = printAt(index);
				System.out.println(value);
				break;
			}
			case 8:// if selected 8 Get Range
			{
				System.out.println("* * * Selected Get Range * * *");
				System.out.print("Enter starting index: ");
				int start = sc.nextInt();
				System.out.print("Enter ending index: ");
				int end = sc.nextInt();
				ArrayList<String> sublist = getList(start, end);
				System.out.println("Names between indexes are: ");
				for (String k : sublist) {
					System.out.print(k + " ");
				}
				System.out.println();
				break;
			}
			case 9:// if selected 9 set Range
			{
				System.out.println("* * * Selected set Range * * * ");
				System.out.print("Enter starting index: ");
				int start = sc.nextInt();
				System.out.print("Enter ending index: ");
				int end = sc.nextInt();
				String[] array = new String[end - start + 1];
				setList(start, end, array);
				System.out.println("Array after Setting values from list: ");
				for (String k : array) {
					System.out.print(k + " ");
				}
				System.out.println();
				break;

			}
			case 10:// if selected 10 Min Off All
			{
				System.out.println("* * * Selected Min Off All * * *");
				String min = minOfAll();
				System.out.println("Minimum String is: " + min);
				break;
			}
			case 11:// if selected 11 End
			{
				break;
			}
			default:// if invalid option
			{
				System.out.println("Invalid Option...Please Try again");
			}
			}
		} while (option != 11);

	}

	// method to populates the arraylist with random names.
	public static void fillRand(int n) {
		String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
		for (int i = 0; i < n; i++) {
			StringBuilder builder = new StringBuilder();
			int count = 10;

			while (count-- != 0) {

				int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());

				builder.append(ALPHA_NUMERIC_STRING.charAt(character));

			}

			list.add(builder.toString());
		}

	}

	// Method displays the arraylist on the screen.
	public static void print() {

		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	// Method to given an index, overwrite the string at the given location.
	public static void setAt(int index, String s) {
		list.set(index, s);

	}

	// Method given an index, deletes the string at the given location.
	public static void removeIndex(int index) {
		list.remove(index);

	}

	// Method to given a string, deletes the 1st occurrence string.
	public static void removeString(String s) {
		list.remove(s);

	}

	// Method to given a string, deletes the all occurrence of the string.
	public static void removeAllOccurrenceS(String s) {

		list.removeAll(Collections.singleton(s));
	}

	// Method given an index, returns and displays the value at the given location.
	public static String printAt(int index) {

		return list.get(index);
	}

	// Method given 1st index and last index, returns and displays all elements in
	// the range.
	public static ArrayList<String> getList(int start, int end) {

		ArrayList<String> sublist = new ArrayList<String>();

		for (int i = start; i <= end; i++) {
			sublist.add(list.get(i));
		}
		return sublist;
	}

	// Method to given 1st index, last index and an array of strings sets all
	// elements in the range
	// to the passed array of strings.
	public static void setList(int start, int end, String[] array) {

		int j = 0;
		for (int i = start; i <= end; i++) {
			array[j++] = list.get(i);
		}

	}

	// Method computes returns and displays smallest string in the arraylist.
	public static String minOfAll() {

		String s = Collections.min(list);
		return s;
	}
}
