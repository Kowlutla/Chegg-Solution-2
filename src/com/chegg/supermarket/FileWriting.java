package com.chegg.supermarket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FileWriting {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			System.out.println(1 / x);
		} catch (ArithmeticException e) {
			System.out.println("A");
		} catch (InputMismatchException e) {
			System.out.println("B");
		}

	}

}
