package com.Chegg.Inheritence;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//Class To test the classes
public class Tester {

	public static void main(String[] args) throws ParseException {

		// to create the Date Object from String
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		// Create Student Object by using Person reference
		Person student = new Student("Kowlutla", sdf.parse("05-05-2000"), "Physics");
		// printing student
		System.out.println(student);

		// Create Instructor Object by using Person reference
		Person instructor = new Instructor("Deeskhi", sdf.parse("09-03-1996"), 60000);
		// printing instructor
		System.out.println(instructor);
	}
}
