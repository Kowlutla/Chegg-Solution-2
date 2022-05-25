package com.chegg.shopping;

import java.util.LinkedList;
import java.util.SortedSet;
public class ProductTest {
	public static void main(String[] args) {
		/*
		 * Create three Product object p1, p2 and p3 of type Game such that (price, Id)
		 * are (35,1), (75,2) and (50,3) respectively.
		 */
		Product p1 = new Product(35, 1);
		Product p2 = new Product(75, 2);
		Product p3 = new Product(50, 3);

		// Create a LinkedList<Product> called prodList.
		LinkedList<Product> prodList = new LinkedList<Product>();
		// Fill in it with the three created objects.
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);

		// Display the prodList
		System.out.println("prodList:");
		System.out.println(prodList);

		// Create a new ShopSet object called prodSet of type Product
		ShopSet<Product> prodSet = new ShopSet<Product>(new LinkedList<Product>());
		// Add to prodSet all the created Product objects (p1, …, p3)
		prodSet.add(p1);
		prodSet.add(p2);
		prodSet.add(p3);
		// Display prodSet
		System.out.println("\nprodSet: ");
		System.out.println(prodSet);
		
		// Remove from prodSet object p3
		prodSet.remove(p3);
		// Display prodSet after removal
		System.out.println("\nprodSet after removal:");
		System.out.println(prodSet);
		// Display the largest object of prodSet
		System.out.println("\nLargest Object of prodSet: " + prodSet.getMax());

		// Display (from prodSet) all the objects lesser than p2
		System.out.println("\nall the objects lesser than p2 :");
		SortedSet<Product> lesser = prodSet.getLess(p2);
		System.out.println(lesser);
	}
}
