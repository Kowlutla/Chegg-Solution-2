package com.chegg.shopping;

//Create a class called “Game” that is one type of Product
public class Game extends Product {

	/*
	 * A full constructor that initializes the attributes Id and prices and prints
	 * out: “[Game constructor] price = "price_value" and id = "id_value" ”
	 */
	public Game(int price, int id) {
		super(price, id);
		System.out.println("[Game constructor] price =" + price + " and id = " + id + " ");
	}

	// toString( ) that returns the values of price and Id
	public String toString() {
		return super.toString();
	}
}
