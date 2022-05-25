package com.chegg.supermarket;

public class Item {

	// fields of Item
	private String itemNumber;
	private int numberOfItemsSold;
	private double purchasePrice;
	private double sellingPrice;

	// Constructor without parameters
	public Item() {
	}

	// Constructor with fields
	public Item(String itemNumber, int numberOfItemsSold, double purchasePrice, double sellingPrice) {
		this.itemNumber = itemNumber;
		this.numberOfItemsSold = numberOfItemsSold;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
	}

	// Accessor method for ItemNumber
	public String getItemNumber() {
		return itemNumber;
	}

	// Mutator method for ItemNumber
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	// Accessor method for NumberOfItemsSold
	public int getNumberOfItemsSold() {
		return numberOfItemsSold;
	}

	// Mutator method for NumberOfItemsSold
	public void setNumberOfItemsSold(int numberOfItemsSold) {
		this.numberOfItemsSold = numberOfItemsSold;
	}

	// Accessor method for PurchasePrice
	public double getPurchasePrice() {
		return purchasePrice;
	}

	// Mutator method for PurchasePrice
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	// Accessor method for SellingPrice
	public double getSellingPrice() {
		return sellingPrice;
	}

	// Mutator method for SellingPrice
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	// toString method to display the attributes of Item
	public String toString() {
		return this.itemNumber + "\t" + this.numberOfItemsSold + "\t" + this.purchasePrice + "\t" + this.sellingPrice;
	}
}
