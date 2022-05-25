package com.Chegg.Doctor;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		// creating 6 doctors object by passing name,specialty and visit fee
		Doctor d1 = new Doctor("kowlutla", "Obstetrician", 2000);
		Doctor d2 = new Doctor("deepu", "Pediatrician", 1500);
		Doctor d3 = new Doctor("Hindu", "Practitioner", 1650);
		Doctor d4 = new Doctor("Hari", "Obstetrician", 2500);
		Doctor d5 = new Doctor("Roopa", "Pediatrician", 2200);
		Doctor d6 = new Doctor("Aruna", "Obstetrician", 2000);

		// creating Array List which can hold only Doctors Objects and add doctor
		// objects to list
		ArrayList<Doctor> list = new ArrayList<Doctor>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);

		// printing all doctor object in list before sorting
		System.out.println("* * * * * before Sorting * * * * *");
		for (Doctor d : list) {
			d.writeOutput();
			System.out.println();
		}

		// Sort the doctor objects according to fee visit in ascending order
		Collections.sort(list);

		// printing all doctor object in list after sorting
		System.out.println("* * * * * After Sorting * * * * *");
		for (Doctor d : list) {
			d.writeOutput();
			System.out.println();
		}

	}

}
