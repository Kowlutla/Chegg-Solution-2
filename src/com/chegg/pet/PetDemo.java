package com.chegg.pet;

import java.util.Scanner;

public class PetDemo {

	public static void main(String[] args) {
		// creating new pet object
		Pet p = new Pet();
		System.out.println("My records on your pet incomplete.");
		System.out.println("Here is what they currently say: ");
		// displaying details of pet p
		p.display();

		Scanner sc = new Scanner(System.in);
		// asking user to enter pet name and set to Pet p
		System.out.println("Please enter the pet's name: ");
		String name = sc.nextLine();
		p.setPetName(name);

		// asking user to enter pet type and set to Pet p
		System.out.println("Please enter the pet's type(dog or cat): ");
		String type = sc.nextLine().toLowerCase();
		p.setPetType(type);

		// asking user to enter age name and set to Pet p
		System.out.println("Please enter the pet's age: ");
		int age = sc.nextInt();
		p.setAge(age);

		// asking user to enter pet weight and set to Pet p
		System.out.println("Please enter the pet's weight: ");
		double weight = sc.nextDouble();
		p.setWeight(weight);

		// printing Pet p details
		System.out.println("My records now say: ");
		p.display();

		// calling carprofen method and printing resulted carprofen dose
		System.out.printf("Dose of carprofen: %.4f\n", carprofen(p));

		// calling acepromazine method and printing resulted acepromazine dose
		System.out.printf("Dose of acepromazine: %.4f", acepromazine(p));
		sc.close();
	}
	// Method to return acepromazine of pet p
	public static double acepromazine(Pet p) {
		double mgperkg;// to hold mgperkg based on petType
		if (p.getPetType().equals("dog"))// if petType is dog
		{
			mgperkg = 0.03;// assign mgperkg as 0.03
		} else// if petType is cat
		{
			mgperkg = 0.02;// assign mgperkg as 0.02
		}
		double dosage = (p.getWeight() / 2.2) * (mgperkg / 10);// calculate dosage
		return dosage;// return dosage
	}

	// Method to return carprofen of pet p
	public static double carprofen(Pet p) {
		double mgperkg;// to hold mgperkg based on petType
		if (p.getPetType().equals("dog"))// if petType is dog
		{
			mgperkg = 0.5;// assign mgperkg as 0.5
		} else// if petType is cat
		{
			mgperkg = 0.25;// assign mgperkg as 0.25
		}
		double dosage = (p.getWeight() / 2.2) * (mgperkg / 12);// calculate dosage
		return dosage;// return dosage
	}
}
