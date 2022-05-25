package com.chegg.books;

import java.util.ArrayList;

public class Book {

	// Attributes
	private String isbn;
	private String title;
	private ArrayList<String> authors;
	private int edition;
	private int pages;
	private double price;

	// Default constructor
	public Book() {
		this.authors = null;
		this.title = "No Title Yet";
	}

	// Parameterized constructor
	public Book(String isbn, String title, int edition) {
		this.isbn = isbn;
		this.title = title;
		this.edition = edition;
		this.authors = new ArrayList<String>();
	}

	// getter(accessor) methods
	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getEdition() {
		return edition;
	}

	public int getPages() {
		return pages;
	}

	public double getPrice() {
		return price;
	}

	// Setter(mutator) methods
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// method to add new Author
	public void addAuthor(String author) {
		// if no authors list is there create new list
		if (this.authors == null) {
			this.authors = new ArrayList<String>();
		}
		// Add the author to authors list
		this.authors.add(author);
	}
	// Method to remove Author
	public void removeAuthor(String author) {
		this.authors.remove(author);
	}
	// Method to change Author
	public void changeAuthor(String oldAuthor, String newAuthor) {
		// getting index of oldAuthor
		int index = this.authors.indexOf(oldAuthor);
		// if oldAuthor found replace it with new Author
		if (index != -1) {
			this.authors.set(index, newAuthor);
		}
	}
	// to String method
	public String toString() {
		String s = "";
		s += "Title: " + this.title;
		s += "\nEdition " + this.edition;
		s += "\nISBN: " + this.isbn;
		s += "\nAuthors";
		String del = ": ";
		if (this.authors != null) {
			for (String author : this.authors) {
				s += del + author;
				del = ",";
			}
		}
		s += "\nPages: " + this.pages;
		s += "\nPrice: " + this.price;
		return s;
	}
}
