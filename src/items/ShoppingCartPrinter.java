package items;

import java.util.Scanner;
public class ShoppingCartPrinter {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ItemToPurchase item1 = new ItemToPurchase();
		ItemToPurchase item2 = new ItemToPurchase();
		// Asking user to get item1 details
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		String item1Name = scnr.nextLine();
		System.out.println("Enter the item price: ");
		int item1Price = scnr.nextInt();
		System.out.println("Enter the item Quantity: ");
		int item1Quantity = scnr.nextInt();
		// Asking user to get item2 details
		System.out.println("\nItem 2");
		scnr.nextLine();
		System.out.println("Enter the item name:");
		String item2Name=scnr.nextLine();
		System.out.println("Enter the item price: ");
		int item2Price = scnr.nextInt();
		System.out.println("Enter the item Quantity: ");
		int item2Quantity = scnr.nextInt();
		// assign data to item1 using mutators
		item1.setName(item1Name);
		item1.setPrice(item1Price);
		item1.setQuantity(item1Quantity);
		// assign data to item2 using mutators
		item2.setName(item2Name);
		item2.setPrice(item2Price);
		item2.setQuantity(item2Quantity);
		//calculating and printing total cost
		System.out.println("TOTAL COST");
		//calculating total cost for item1
		int item1TotalCost = item1.getPrice() * item1.getQuantity();
		//calculating total cost for item2
		int item2TotalCost = item2.getPrice() * item2.getQuantity();
		//printing item1 with total cost
		System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1TotalCost);
		//printing item1 with total cost
		System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2TotalCost);

		//printing total cost (cost of both item1 and item2)
		System.out.println("\nTotal: $" + (item1TotalCost + item2TotalCost));
	}
}
