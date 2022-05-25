package question1;

public class Driver {

	public static void main(String[] args) {

		// Creating ten student objects
		Student s1 = new Student(101, "kowlutla", "CS04OS", 4.5f);
		Student s2 = new Student(102, "Hindu", "CS02DBMS", 2.5f);
		Student s3 = new Student(103, "Roopa", "CS03DAA", 3.2f);
		Student s4 = new Student(104, "Hari", "CS01COA", 3.5f);
		Student s5 = new Student(105, "Deepti", "CS03AGT", 2.2f);
		Student s6 = new Student(106, "Aruna", "CS02DM", 3.4f);
		Student s7 = new Student(107, "Lakshmi", "CS02DLD", 4.2f);
		Student s8 = new Student(108, "Renuka", "CS01OOPS", 2.3f);
		Student s9 = new Student(109, "keshava", "CS05MAD", 4.2f);
		Student s10 = new Student(110, "Rahitya", "CS02CN", 3.3f);

		/*
		 * Creating queue named studentCGPA and enqueue queue with above student objects
		 */
		Queue studentCGPA = new Queue();
		studentCGPA.enQueue(s1);
		studentCGPA.enQueue(s2);
		studentCGPA.enQueue(s3);
		studentCGPA.enQueue(s4);
		studentCGPA.enQueue(s5);
		studentCGPA.enQueue(s6);
		studentCGPA.enQueue(s7);
		studentCGPA.enQueue(s8);
		studentCGPA.enQueue(s9);
		studentCGPA.enQueue(s10);

		/*
		 * create Queue object firstClassStudents to hold students whose cgpa is greater
		 * than or equal to 3.5
		 */
		Queue firstClassStudents = new Queue();

		/*
		 * Create a temp Queue to store students whose cgpa is less than or equal to 3.5
		 */
		Queue temp = new Queue();
		while (!studentCGPA.isEmpty()) {
			// extract each Student from Queue
			Student s = (Student) studentCGPA.deQueue();
			if (s.getCgpa() >= 3.5)// if student cgpa>=3.5
			{
				firstClassStudents.enQueue(s);// enqueue to firstClassStudents
			} else// if student cgpa<3.5
			{
				temp.enQueue(s);// enqueue to temp
			}
		}

		studentCGPA = temp;// assign temp to studentCGPA

		// printing how many students with CGPA greater than or equal to 3.5
		System.out
				.println("Number of students with CGPA greater than or equal to 3.5: " + firstClassStudents.getSize());

		System.out.println("\n--------------------------------------------------------");
		// printing students with CGPA greater than or equal to 3.5
		System.out.println("* * * Students with CGPA greater than or equal to 3.5 * * * ");
		while (!firstClassStudents.isEmpty()) {
			System.out.println(firstClassStudents.deQueue());
		}

		System.out.println("\n--------------------------------------------------------");
		// printing students with CGPA less than or equal to 3.5
		System.out.println("* * * Students with CGPA less than or equal to 3.5 * * * ");
		while (!studentCGPA.isEmpty()) {
			System.out.println(studentCGPA.deQueue());
		}
	}
}
