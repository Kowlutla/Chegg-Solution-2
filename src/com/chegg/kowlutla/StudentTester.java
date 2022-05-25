package com.chegg.kowlutla;

public class StudentTester {

	public static void main(String[] args) {
		
		Student s1 = new Student("kowlutla", "mail1", 80);

		// Get values of attributes using getters methods
		System.out.println("Name: " + s1.get_name());
		System.out.println("Email: " + s1.get_email());
		System.out.println("Grade: " + s1.get_grade());

		// set the values to attributes by using setter methods
		s1.set_name("Deepthi");
		s1.set_email("mail2");
		s1.set_grade(95);

		System.out.println("* * * After using setter method * * *");
		// Get values of attributes using getters methods
		System.out.println("Name: " + s1.get_name());
		System.out.println("Email: " + s1.get_email());
		System.out.println("Grade: " + s1.get_grade());
	}
}
