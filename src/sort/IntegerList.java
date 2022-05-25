package sort;
// *************************************************************

// IntegerList.java
// *************************************************************

public class IntegerList {
	int[] list; // values in the list

	public IntegerList(int size) {
		list = new int[size];
	}

	public void randomize() {
		for (int i = 0; i < list.length; i++)
			list[i] = (int) (Math.random() * 100) + 1;
	}

	public void print() {
		for (int i = 0; i < list.length; i++)
			System.out.println(i + ":\t" + list[i]);
	}

	public int search(int target) {
		int location = -1;
		for (int i = 0; i < list.length && location == -1; i++)
			if (list[i] == target)
				location = i;
		return location;
	}

	public void selectionSort() {
		int minIndex;
		for (int i = 0; i < list.length - 1; i++) {
//find smallest element in list starting at location i
			minIndex = i;
			for (int j = i + 1; j < list.length; j++)
				if (list[j] < list[minIndex])
					minIndex = j;
//swap list[i] with smallest element
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}

	public void replaceFirst(int oldVal, int newVal) {
		int something = this.search(oldVal);
		if (something == -1) {
			System.out.println("Nothing");
		} else {
			list[something] = newVal;
		}
	}

	public void replaceAll(int oldVal, int newVal) {
		int counter = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == oldVal) {
				list[i] = newVal;
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("Could not find your number");
		}
	}

	public void sortDecreasing() {
		int minIndex;
		for (int i = 0; i < list.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] > list[minIndex]) {
					minIndex = j;
				}
				int temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
	}

	public void binarySearch(Integer target) {
		int min = 0, max = list.length - 1, mid = 0;
		boolean found = false;
		while (!found && min <= max) {
			mid = (min + max) / 2;
			if (target.equals(list[mid]))
				found = true;
			else if ((target.compareTo(list[mid])) < 0)
				max = mid - 1;
			else
				min = mid + 1; // works in increasing order, not decreasing :(
		}
		if (found)
			System.out.println("found the number! the index is: " + mid);
		else
			System.out.println("could not find it");
	}

}