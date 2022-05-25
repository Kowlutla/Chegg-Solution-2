package com.chegg.tester;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		randomDrawing<Integer> obj1 = new randomDrawing<>();
		obj1.add(35);
		obj1.add(12);
		obj1.add(100);
		obj1.add(10);
		obj1.add(72);
		randomDrawing<String> obj2 = new randomDrawing<>();
		obj2.add("Nancy");
		obj2.add("Cathy");
		obj2.add("Tom");
		obj2.add("David");
		obj2.add("Anna");
		obj2.add("Adam");

		System.out.println("Content of the integer box(toString method):\n"+obj1.toString());
		System.out.println("\nContent of the string box(toString method):\n"+obj2.toString());
		randomDrawing<Integer> dup1;
		randomDrawing<String> dup2;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while (!flag) {
			dup1 = (randomDrawing<Integer>) obj1.clone();
			dup2 = (randomDrawing<String>) obj2.clone();
			System.out.println("\nDrawing from Integer box: ");
			while (!dup1.isEmpty())
				System.out.print(dup1.drawItem() + " ");

			System.out.println("\n\nDrawing from string box: ");
			while (!dup2.isEmpty())
				System.out.print(dup2.drawItem() + " ");

			System.out.print("\n\nDo it again, yes (or no)?");
			if (!sc.nextLine().equalsIgnoreCase("yes"))
				flag = true;

		}
		sc.close();
	}

}