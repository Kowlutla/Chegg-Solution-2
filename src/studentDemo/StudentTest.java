package studentDemo;

import java.util.Scanner;

//StudentTest Class
public class StudentTest {

	public static void main(String[] args) {

		// create three students Objects
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		Scanner sc = new Scanner(System.in);
		// Aksing user to enter student1 name and number
		System.out.println("Please enter name and number of student 1:");
		String student1_name = sc.next();
		String student1_number = sc.next();
		// setting student1 name
		student1.setName(student1_name);
		// setting student1 number
		student1.setNumber(student1_number);

		// Aksing user to enter student2 name and number
		System.out.println("Please enter name and number of student 2:");
		String student2_name = sc.next();
		String student2_number = sc.next();
		// setting student2 name
		student2.setName(student2_name);
		// setting student2 number
		student2.setNumber(student2_number);

		// Aksing user to enter student3 name and number
		System.out.println("Please enter name and number of student 3:");
		String student3_name = sc.next();
		String student3_number = sc.next();
		// setting student3 name
		student3.setName(student3_name);
		// setting student3 name
		student3.setNumber(student3_number);

		// Aksing user to enter student1 marks (Java English,Maths)
		System.out.println("Please enter marks for " + student1_name + " (Java English,Maths) ");
		int student1_java = sc.nextInt();
		int student1_english = sc.nextInt();
		int student1_maths = sc.nextInt();

		// if any marks not in between 0 and 100. exit
		if (student1_java < 0 || student1_java > 100 || student1_english < 0 || student1_english > 100
				|| student1_maths < 0 || student1_maths > 100) {
			System.out.println("All Marks should between 0 and 100!");
			System.exit(0);
		} else// if all marks are valid
		{
			// set the marks for student1
			student1.enterMarks(student1_java, student1_english, student1_maths);
		}

		// Aksing user to enter student2 marks (Java English,Maths)
		System.out.println("Please enter marks for " + student2_name + " (Java English,Maths)");
		int student2_java = sc.nextInt();
		int student2_english = sc.nextInt();
		int student2_maths = sc.nextInt();

		// if any marks not in between 0 and 100. exit
		if (student2_java < 0 || student2_java > 100 || student2_english < 0 || student2_english > 100
				|| student2_maths < 0 || student2_maths > 100) {
			System.out.println("All Marks should between 0 and 100!");
			System.exit(0);
		} else// if all marks are valid
		{
			// set the marks for student2
			student2.enterMarks(student2_java, student2_english, student2_maths);
		}

		// Aksing user to enter student3 marks (Java English,Maths)
		System.out.println("Please enter marks for " + student3_name + " (Java English,Maths)");
		int student3_java = sc.nextInt();
		int student3_english = sc.nextInt();
		int student3_maths = sc.nextInt();

		// if any marks not in between 0 and 100. exit
		if (student3_java < 0 || student3_java > 100 || student3_english < 0 || student3_english > 100
				|| student3_maths < 0 || student3_maths > 100) {
			System.out.println("All Marks should between 0 and 100!");
			System.exit(0);
		} else// if all marks are valid
		{
			// set the marks for student3
			student3.enterMarks(student3_java, student3_english, student3_maths);
		}

		// printing information of student1 using get methods
		System.out.println("Information About student 1: ");
		System.out.println("Name : " + student1.getName());
		System.out.println("Number : " + student1.getNumber());
		System.out.println("Java Marks : " + student1.getJavaMark());
		System.out.println("English Mark : " + student1.getEnglishMark());
		System.out.println("Maths Mark : " + student1.getMathsMark());
		System.out.printf("Average : %.2f\n" ,student1.calculateAverageMark());
		
		System.out.println();
		// printing information of student2 using get methods
		System.out.println("Information About student 2: ");
		System.out.println("Name : " + student2.getName());
		System.out.println("Number : " + student2.getNumber());
		System.out.println("Java Marks : " + student2.getJavaMark());
		System.out.println("English Mark : " + student2.getEnglishMark());
		System.out.println("Maths Mark : " + student2.getMathsMark());
		System.out.printf("Average : %.2f\n" ,student2.calculateAverageMark());

		System.out.println();
		// printing information of student3 using get methods
		System.out.println("Information About student 3: ");
		System.out.println("Name : " + student3.getName());
		System.out.println("Number : " + student3.getNumber());
		System.out.println("Java Marks : " + student3.getJavaMark());
		System.out.println("English Mark : " + student3.getEnglishMark());
		System.out.println("Maths Mark : " + student3.getMathsMark());
		System.out.printf("Average : %.2f\n" ,student3.calculateAverageMark());
		sc.close();
	}
}
