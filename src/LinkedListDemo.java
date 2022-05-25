import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;

//Change the class name from LinkedList to anyOther name(for now LinkedListDemo)
public class LinkedListDemo {
	public static void main(String[] args0) {
		SecureRandom random = new SecureRandom();
		// This will help us generate 25 random number
		LinkedList<Integer> theList = new LinkedList<Integer>();
		// help us create this list needed for the problem
		for (int num = 0; num < 25; num++) {
			int x = random.nextInt((100));
			// seperated this process for train of thought. this will generte
			// the value between 0 - 100
			theList.add(x);
			// this should add a random number 25 times to the list then stop
		}
		Collections.sort(theList);
		// This will sort the list
		System.out.println("Here is the sorted list: ");
		for (int num = 0; num < 25; num++) {
			System.out.println(theList.get(num) + " ");
			// This should print the list sorted out
		}
		float floatAverage = 0;
		int sumList = 0;

		for (int num = 0; num < 25; num++) {
			sumList += theList.get(num) ;
		}
		floatAverage = sumList / 25.0f;
		System.out.println("The Sum of all the numbers is: " + sumList);
		System.out.println("The Floating-point average is: " + floatAverage);
	}
}