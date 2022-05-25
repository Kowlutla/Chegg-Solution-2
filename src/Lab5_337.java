import java.util.Random;

//Assuming 337 is my ID
public class Lab5_337 {
	public static void main(String[] args) {

		// Creating Random Object to generate Random numbers
		Random rand = new Random();
		// Declaring length to 20(if needed get the random length using rand.nextInt())
		int length = 20;
		// declare array with above length
		int values[] = new int[length];
		// fill the array with random elements between 0 to 1000
		for (int i = 0; i < length; i++) {
			values[i] = rand.nextInt(1000);
		}
		// Creating WorkingWithArrays object by passing above array as arguement
		WorkingWithArrays arrays = new WorkingWithArrays(values);

		// printing elemets of values
		System.out.println("Elements Of Array :");
		System.out.println(arrays);
		// Checking whether array contain duplicates or not
		System.out.println("\nIs array contain duplicates: " + arrays.containsDuplicates());

		// move all Odd elements to front of array by calling method
		arrays.moveOddElements();

		System.out.println("\nElements Of Array After moving all odd elements to front:");
		System.out.println(arrays);
	}
}
