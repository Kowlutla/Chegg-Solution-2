import java.util.LinkedList;
import java.util.List;
public class BasicSorting {
	// Method to sort List in ascending order using insertion method
	public static <E extends Comparable<E>> void InsertionSort(List<E> seq) {
		for (int i = 1; i < seq.size(); i++) {
			E key = seq.get(i);
			int j = i - 1;
			/*
			 * Move elements of seq[0..i-1], that are greater than key, to one position
			 * ahead of their current position*/
			while (j >= 0 && seq.get(j).compareTo(key) > 0) {
				seq.set(j + 1, seq.get(j));
				j = j - 1;
			}
			seq.set(j + 1, key);
		}
	}
	public static void main(String args[]) {
		// creating seq Objects
		Student s1 = new Student("kowlu", 89.5);
		Student s2 = new Student("Hindu", 54);
		Student s3 = new Student("Roopa", 80);
		Student s4 = new Student("Deekshi", 89);
		Student s5 = new Student("Deepu", 90);
		Student s6 = new Student("Hari", 45);
		// Create a sequence of type Students
		List<Student> seq = new LinkedList<Student>();
		// Add studens to seq
		seq.add(s1);
		seq.add(s2);
		seq.add(s3);
		seq.add(s4);
		seq.add(s5);
		seq.add(s6);
		// printing seq before sorting
		System.out.println("Before Sorting: ");
		for (Student s : seq) {
			System.out.println(s);
		}
		// Sorting seq by calling InsertionSort of generic type
		InsertionSort(seq);
		// Printing Seq after Sorting based on marks
		System.out.println("\nAfter Sorting: ");
		for (Student s : seq) {
			System.out.println(s);
		}
	}
}
