package com.Chegg.Ring;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		// creating an array of 10 Ring Objects
		Ring array[] = new Ring[10];
		// Creating Random number Object
		Random rand = new Random();
		// Filling array with Ring,KeyRing and WeddingRing Objects
		for (int i = 0; i < array.length; i++) {
			// getting random number among 1,2 and 3
			int value = rand.nextInt(3) + 1;

			// if Random value is 1 Create Ring Object
			if (value == 1) {
				array[i] = new Ring(1.5);

			}
			// if Random value is 2 Create KeyRing Object
			else if (value == 2) {
				array[i] = new KeyRing(2.5, "Acrylic", 10);
			}
			// if Random value is 3 Create WeddingRing Object
			else {
				array[i] = new WeddingRing(2, 4, 5);
			}
		}

		// Display All elements Of Array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// initialize keyRingCount,weddingRingCount to 0
		int keyRingCount = 0, weddingRingCount = 0;

		// Count the Objects
		for (int i = 0; i < 10; i++) {
			// if current object is type KeyRing increase keyRingCount
			if (array[i] instanceof KeyRing) {
				keyRingCount++;
			}
			// if current object is type WeddingRing increase WeddingRingCount
			else if (array[i] instanceof WeddingRing) {
				weddingRingCount++;
			}
		}

		// Printing keyRingCount,weddingRingCount
		System.out.println("\nKeyRing Objects Count: " + keyRingCount);
		System.out.println("WeddingRing Object Count: " + weddingRingCount);

		// increase the diameter of first Wedding Object by 0.5
		for (int i = 0; i < 10; i++) {
			if (array[i] instanceof WeddingRing) {
				array[i].resize(0.5, '+');
				break;
			}
		}
		// Finding last occurrence of keyRing object
		int lastOccurance = -1;
		for (int i = 0; i < 10; i++) {
			if (array[i] instanceof KeyRing) {
				lastOccurance = i;
			}
		}
		// decrease the diameter of last keyRing Object by 0.5
		array[lastOccurance].resize(0.5, '-');

		// Display all objects again
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
