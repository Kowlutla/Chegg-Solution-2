package genericClasses;

public class GC_Test {

	public static void main(String[] args) {
		// creating WaitingList of Cars
		WaitingList<Car> cars = new WaitingList<Car>();
		// add Three cars
		cars.add(new Car(123, "Maruti"));
		cars.add(new Car(234, "Santro"));
		cars.add(new Car(345, "Honda"));

		System.out.println("* * * * * Cars List Before removing * * * * * ");
		cars.print();
		System.out.println("* * * * * Cars List After removing * * * * * ");
		cars.remove();
		cars.print();
		System.out.println("* * * * * Cars List Before Reverse * * * * * ");
		cars.print();
		System.out.println("* * * * * Cars List After Reverse * * * * * ");
		cars.reverse();
		cars.print();

		// creating WaitingList of Students
		WaitingList<Student> students = new WaitingList<Student>();
		// add four Students
		students.add(new Student(111, "Pyari", 9.9));
		students.add(new Student(222, "Tanvi", 8.7));
		students.add(new Student(333, "Manvi", 8.9));
		students.add(new Student(444, "Pranab", 9.2));
		
		System.out.println("* * * * * Student List Before removing * * * * * ");
		students.print();
		System.out.println("* * * * * Student List After removing * * * * * ");
		students.remove();
		students.print();
		System.out.println("* * * * * Student List Before Reverse * * * * * ");
		students.print();
		System.out.println("* * * * * Student List After Reverse * * * * * ");
		students.reverse();
		students.print();
	}

}
