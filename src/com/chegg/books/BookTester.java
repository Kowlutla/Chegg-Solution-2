package com.chegg.books;

import java.util.ArrayList;
import java.util.Collections;

public class BookTester {

    public static void main(String[] args) {

        ArrayList<Book> myBooks = new ArrayList<>();
        Book book = new Book();
        myBooks.add(book);

        book = new Book("1239812482912", "The Hunchback", 2);
        myBooks.add(book);

        book = new Book("2923981728291", "Mind and Cosmos", 1);
        myBooks.add(book);

        book = new Book("2923981728291", "Another Book", 1);
        myBooks.add(book);

        myBooks.get(0).setTitle("War and Peace");
        myBooks.get(0).addAuthor("Tolstoy");
        myBooks.get(0).setPrice(99.85);

        myBooks.get(1).addAuthor("Victor Hugo");
        myBooks.get(1).setPrice(120);

        myBooks.get(3).addAuthor("Adam");
        myBooks.get(3).addAuthor("Bernard");
        myBooks.get(3).addAuthor("Kelly");
        myBooks.get(3).removeAuthor("Adam");
        myBooks.get(3).changeAuthor("Kelly","Kyle");
        myBooks.get(0).setPages(250);

        System.out.println("List of my books");
        System.out.println("----------------");
        for (Book b: myBooks) {
            System.out.println(b);
            System.out.println("------");
        }
    }
}