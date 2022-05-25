package genericMethods;

public class GM_Test {

	/*
	 * 3.a)generic method swapFirstLast that receive the generic type array, swaps
	 * the last element in array with first one
	 */
	<T> void swapFirstLast(T array[]) {
		int len = array.length;
		T temp = array[0];
		array[0] = array[len - 1];
		array[len - 1] = temp;
	}

	/*
	 * 3.b)generic method reverse that receive the generic type array and reverse
	 * the order of generic array
	 */
	<T> void reverse(T array[]) {
		int start = 0, end = array.length - 1;
		while (start < end) {
			T temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

	/*
	 * 3.c)generic method shift that receive the generic type array and shift its
	 * element one position to the left
	 */
	<T> void shift(T array[]) {
		T temp = array[0];// store the first element in temp
		// swap all elements by one position left
		for (int i = 1; i < array.length; i++) {
			array[i - 1] = array[i];
		}
		// at last position place the previous first element
		array[array.length - 1] = temp;
	}

	// 3.d) generic method print that receives a generic type array
	// and print the elements
	<T> void print(T array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	//main method
	public static void main(String[] args) {
		// ------------ E -------------------------
		// creating Array of type Student
		Student[] students = new Student[3];
		// adding 3 students to student array
		students[0] = new Student(1337, "kowlutla", 9.8);
		students[1] = new Student(1129, "Sudeepthi", 8.9);
		students[2] = new Student(1333, "Hindu", 7.0);

		// creating Array of type Car
		// Note:In Problem they are given account.
		// but in this problem there is no such type of class given
		Car[] cars = new Car[4];
		// adding 3 students to student array
		cars[0] = new Car(1234, "Maruthi");
		cars[1] = new Car(1235, "Honda");
		cars[2] = new Car(344, "Ferari");
		cars[3] = new Car(5783, "BMW");

		GM_Test test = new GM_Test();
		// ------------- F ------------------
		System.out.println("* * * * * * Students Before Calling swapFirstLast * * * * * * ");
		test.print(students);
		System.out.println("* * * * * * Students After Calling swapFirstLast * * * * * * ");
		test.swapFirstLast(students);
		test.print(students);

		System.out.println("* * * * * * Students Before Calling reverse * * * * * * ");
		test.print(students);
		System.out.println("* * * * * * Students After Calling reverse * * * * * * ");
		test.reverse(students);
		test.print(students);

		System.out.println("* * * * * * Students Before Calling Shift * * * * * * ");
		test.print(students);
		System.out.println("* * * * * * Students After Calling Shift * * * * * * ");
		test.shift(students);
		test.print(students);

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("* * * * * * Cars Before Calling swapFirstLast * * * * * * ");
		test.print(cars);
		System.out.println("* * * * * * Cars After Calling swapFirstLast * * * * * * ");
		test.swapFirstLast(cars);
		test.print(cars);

		System.out.println("* * * * * * Cars Before Calling reverse * * * * * * ");
		test.print(cars);
		System.out.println("* * * * * * Cars After Calling reverse * * * * * * ");
		test.reverse(cars);
		test.print(cars);

		System.out.println("* * * * * * Cars Before Calling Shift * * * * * * ");
		test.print(cars);
		System.out.println("* * * * * * Cars After Calling Shift * * * * * * ");
		test.shift(cars);
		test.print(cars);

		// -----------------------G---------------------------------
		Integer intArray[] = { 4, 1, 7, 9 };
		Character chArray[] = { 'a', 'b', 'c', 'd' };
		System.out.println("-----------------------------------------------------------------------");

		System.out.println("* * * * * * intArray Before Calling swapFirstLast * * * * * * ");
		test.print(intArray);
		System.out.println("* * * * * * intArray After Calling swapFirstLast * * * * * * ");
		test.swapFirstLast(intArray);
		test.print(intArray);

		System.out.println("* * * * * * intArray Before Calling reverse * * * * * * ");
		test.print(intArray);
		System.out.println("* * * * * * intArray After Calling reverse * * * * * * ");
		test.reverse(intArray);
		test.print(intArray);

		System.out.println("* * * * * * intArray Before Calling Shift * * * * * * ");
		test.print(intArray);
		System.out.println("* * * * * * intArray After Calling Shift * * * * * * ");
		test.shift(intArray);
		test.print(intArray);

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("* * * * * * chArray Before Calling swapFirstLast * * * * * * ");
		test.print(chArray);
		System.out.println("* * * * * * chArray After Calling swapFirstLast * * * * * * ");
		test.swapFirstLast(chArray);
		test.print(chArray);

		System.out.println("* * * * * * chArray Before Calling reverse * * * * * * ");
		test.print(chArray);
		System.out.println("* * * * * * chArray After Calling reverse * * * * * * ");
		test.reverse(chArray);
		test.print(chArray);

		System.out.println("* * * * * * chArray Before Calling Shift * * * * * * ");
		test.print(chArray);
		System.out.println("* * * * * * chArray After Calling Shift * * * * * * ");
		test.shift(chArray);
		test.print(chArray);
	}
}
