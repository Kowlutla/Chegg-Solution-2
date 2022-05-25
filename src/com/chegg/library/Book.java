package com.chegg.library;

public class Book {
	// Attributes of Book
	private String bookcode;
	private String bookname;
	private double price;

	// Constructor to create Book Object
	public Book(String bookcode, String bookname, double price) {
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.price = price;
	}

	// accessor methods
	public String getBookcode() {
		return bookcode;
	}

	public String getBookname() {
		return bookname;
	}

	public double getPrice() {
		return price;
	}

	// Mutator methods
	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Overrided hashCode method
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookcode == null) ? 0 : bookcode.hashCode());
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	// Overrided equals method
	public boolean equals(Object obj) {
		// if both references are same
		if (this == obj)
			return true;
		// if provided obj is null
		if (obj == null)
			return false;
		// if class name is different
		if (getClass() != obj.getClass())
			return false;
		// type cast obj to Book
		Book other = (Book) obj;

		// if this object bookcode is null and other bookcode is not null
		if (bookcode == null) {
			if (other.bookcode != null)
				return false;
		}
		// if this object bookcode is not equals to other book bookcode
		else if (!bookcode.equals(other.bookcode))
			return false;
		// if this object bookname is null and other bookname is not null
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		}
		// if this object bookname is not equals to other book bookname
		else if (!bookname.equals(other.bookname))
			return false;
		// if prices are not same
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		// if above all conditions are not satisfied both objects are same return true
		return true;
	}

	// toString method to return String representation of Book Object
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", price=" + price + "]";
	}
}
