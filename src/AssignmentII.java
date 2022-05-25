import java.util.Arrays;
import java.util.LinkedHashSet;

public class AssignmentII {

	public static void main(String[] args) {

		// creating list1
		String[] group1 = { "SALMAN", "ALI", "GHADA", "Ayman", "FATMA", "TAHERA", "MARYAM", "ALI", "FADHEL" };
		// creating list2
		String[] group2 = { "SAJID", "MOHAMED", "AYAT", "Noor", "Omar", "Fahad", "Abdalrahman", "Mohd" };

		// printing list1
		System.out.print("Group1: " + Arrays.toString(group1));

		// printing list1
		System.out.print("\nGroup2: " + Arrays.toString(group2));

		// calling method transferFrom to merge above two list and store in itcs224
		// array
		String[] itcs224 = transferFrom(group1, group2);
		// making two lists as empty
		group1 = new String[0];
		group2 = new String[0];
		// printing itcs224 array and group1 and group2 arrays
		System.out.print("\nITCS224: " + Arrays.toString(itcs224));
		System.out.println("\nSection1: " + Arrays.toString(group1));
		System.out.println("Section2: " + Arrays.toString(group2));

		// sorting itcs224 array and printing resulted array
		System.out.println("ITCS 224 After Sorting: ");
		itcs224 = sortList(itcs224);
		System.out.println(Arrays.toString(itcs224));

		// removing duplicates from itcs224 array by calling method and printing
		// resulted array
		System.out.println("ITCS 224 After Removing duplicates: ");
		itcs224 = filterDuplicates(itcs224);
		System.out.println(Arrays.toString(itcs224));
	}

	// Method to merge two lists into single list
	public static String[] transferFrom(String[] group1, String[] group2) {

		// create array with size of total elements in group1 and group2
		String[] itcs224 = new String[group1.length + group2.length];
		int i = 0;

		// copy the elements of group1
		for (i = 0; i < group1.length; i++) {
			itcs224[i] = group1[i];
		}

		// copy the elements of group2
		for (int j = 0; j < group2.length; j++, i++) {
			itcs224[i] = group2[j];
		}
		return itcs224;
	}

	// Method to sort the list
	public static String[] sortList(String[] itcs224) {

		for (int i = 0; i < itcs224.length - 1; i++) {
			for (int j = 0; j < itcs224.length - i - 1; j++) {
				if (itcs224[j].compareTo(itcs224[j + 1]) > 0) {
					String temp = itcs224[j];
					itcs224[j] = itcs224[j + 1];
					itcs224[j + 1] = temp;
				}
			}
		}
		return itcs224;
	}

	// Method to remove duplicates from list and return resulted list
	public static String[] filterDuplicates(String[] itcs224) {
		// set does not accepts duplicates
		// create set equivalent to given itcs224 array
		LinkedHashSet<String> lhSetColors = new LinkedHashSet<String>(Arrays.asList(itcs224));

		// create array from the LinkedHashSet
		String[] newArray = lhSetColors.toArray(new String[lhSetColors.size()]);

		return newArray;// return newArray
	}
}
