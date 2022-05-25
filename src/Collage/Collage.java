package Collage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Collage {

	public static void main(String[] args) throws IOException {

		int option;// to take option
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> studentList = new ArrayList<Person>();// to hold student objects
		ArrayList<Person> teacherList = new ArrayList<Person>();// to hold teaches objects
		do {
			// Displaying Menu
			System.out.println("\n1.Create Teacher\n2.Create Student\n0.Exit");
			try {
				option = Integer.parseInt(br.readLine());// taking option from user
				try {
					switch (option) {
					/*
					 * if Choose option as 1 create Ask to enter information about teacher and
					 * create teacher object and add to teacher list
					 */
					case 1: {
						System.out.println("You Selected to create Teacher Object ");
						System.out.print("Name: ");
						String name = br.readLine();
						System.out.print("Age: ");
						int age = Integer.parseInt(br.readLine());
						System.out.print("Gender: ");
						String gender = br.readLine();
						System.out.print("Subject: ");
						String subject = br.readLine();
						System.out.print("Salary:");
						double salary = Double.parseDouble(br.readLine());
						Teacher t = new Teacher(name, age, gender, subject, salary);
						teacherList.add(t);
						break;
					}
					/*
					 * if Choose option as 2 create Ask to enter information about student and
					 * create student object and add to student list
					 */
					case 2: {
						System.out.println("You Selected to create Student Object ");
						System.out.print("Name: ");
						String name = br.readLine();
						System.out.print("Age: ");
						int age = Integer.parseInt(br.readLine());
						System.out.print("Gender: ");
						String gender = br.readLine();
						System.out.print("Student ID: ");
						int stuID = Integer.parseInt(br.readLine());
						System.out.print("Student GPA: ");
						float stuGPA = Float.parseFloat(br.readLine());
						System.out.print("Address: ");
						String stuAddress = br.readLine();
						Student s = new Student(name, age, gender, stuID, stuGPA, stuAddress);
						studentList.add(s);
						break;
					}
					/*
					 * if Choose option as not in menu print as invalid entry
					 */
					case 0: {
						break;
					}
					default: {
						System.out.println("InValid Entry ");
						break;
					}
					}
				} catch (Exception e) {
					System.out.println("Invalid entry .... Please choose option again");
				}
			} catch (Exception e) {
				option = Integer.parseInt(br.readLine());
			}
		} while (option != 0);
		System.out.println("Teachers Information: ");// printing teacher list info
		printInfo(teacherList);
		System.out.println("\nStudent Information: ");// printing student list info
		printInfo(studentList);
	}

	// method to print information of lists
	public static void printInfo(ArrayList<Person> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
