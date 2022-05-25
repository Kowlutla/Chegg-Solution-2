package com.Chegg.Shopping;

public class ShoppingCart {

	private Item[] items;// array to hold the Items
	private int nbAddedItems;// to count the number of items

	// Constructor
	public ShoppingCart(int maxNbItems) {
		items = new Item[maxNbItems];
	}

	// Getter method for items
	public Item[] getItems() {
		return items;
	}

	/*
	 * Method to add item into items array
	 */
	public void addItem(Item i) {
		// if number of items added reaches the maximum number of items
		if (nbAddedItems == items.length) {
			System.out.println("We can't add item .. because it is full ");
		} else// add item to items array
		{
			items[nbAddedItems++] = i;
		}
	}

	// Method to get Number Of Items added
	public int getNbAddedItems() {
		return nbAddedItems;
	}

	// Method to return the price of item based on id to buy Item
	public double buyItem(int id) {
		// Look For all items
		for (int i = 0; i < nbAddedItems; i++) {
			// if any item id matches the given id return item price
			if (items[i].getId() == id) {
				return items[i].getPrice();
			}
		}
		// if no item present with given id return -1
		return -1;
	}

	// Method to get the no of Shoes in items array
	public int getNumberOfShoes() {
		int count = 0;// initialize the count
		for (int i = 0; i < nbAddedItems; i++) {
			Item item = items[i];
			// if current item is type of shoe increment count
			if (item instanceof Shoe) {
				count++;
			}
		}
		// return count
		return count;
	}

	// Method to displayTshirts with specified color
	public void displayTshirts(String color) {
		// Look for all item
		for (int i = 0; i < nbAddedItems; i++) {
			Item item = items[i];
			// if item is type of Tshirt
			if (item instanceof Tshirt) {
				Tshirt t = (Tshirt) item;
				// if Tshirt color is same as given color print it
				if (t.getColor().equalsIgnoreCase(color)) {
					System.out.println(item);
				}
			}
		}
	}

	// toString method to return the all items in items array as String form
	public String toString() {
		String s = "";
		for (int i = 0; i < nbAddedItems; i++) {
			s = s + items[i] + "\n";
		}
		return s;
	}

}
