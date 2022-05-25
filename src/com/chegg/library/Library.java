package com.chegg.library;

import java.util.HashSet;

public class Library {
	// attributes of Library
	String libcode;
	String libname;
	HashSet<Book> books;

	// Constructor to create Library Object
	public Library(String libcode, String libname) {
		this.libcode = libcode;
		this.libname = libname;
		this.books = new HashSet<Book>();
	}

	/*
	 * Method to add book to book list return true if successfully added and return
	 * false if already present
	 */
	public boolean add(Book b) {
		return books.add(b);
	}

	/*
	 * Method to delete book from book list return true if successfully delete book
	 * from list and return false it book not present in list
	 */
	public boolean delete(Book b) {
		return books.remove(b);
	}

	// Method to show the books in list
	public void showList() {
		if (books.size() == 0) {
			System.out.println("No Books in list");
		} else {
			System.out.println("Books List: ");
			for (Book b : books) {
				System.out.println(b);
			}
		}
	}
}
