package com.chegg.shopping;

/*
 * Product” that implements Shop interface and Comparable interface to compare the 
 * products according to their price
 */
public class Product implements Shop, Comparable<Product> {

	// Two integer attributes: price and id
	private int id;
	private int price;

	// A full constructor that initializes all the attributes.
	public Product(int price, int id) {
		this.id = id;
		this.price = price;
	}

	// implementation of all the abstract methods mentioned in shop interface.
	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public void setId(int i) {
		this.id = i;
	}

	@Override
	public void setPrice(int pr) {
		this.price = pr;

	}

	/*
	 * CompareTo(Product p) method that compares the products according to their
	 * price (returns the difference between two products)
	 */
	@Override
	public int compareTo(Product p) {
		if (this.price > p.price) {
			return this.price - p.price;
		} else if (this.price < p.price) {
			return this.price - p.price;
		} else {
			return 0;
		}
	}

	// toString( ) method that returns ID_value and Price_value.
	@Override
	public String toString() {
		return id + " " + price;
	}
}
