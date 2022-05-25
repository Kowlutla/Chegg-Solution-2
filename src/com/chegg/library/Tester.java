package com.chegg.library;

public class Tester {
	public static void main(String[] args) {
		
		Library l=new Library("libcode1","Rgukt");
		Book b1=new Book("bookcode1","bookname1",100);
		Book b2=new Book("bookcode2","bookname2",200);
		Book b3=new Book("bookcode3","bookname3",300);
		Book b4=new Book("bookcode4","bookname4",400);
		Book b5=new Book("bookcode5","bookname5",500);
		Book b6=new Book("bookcode5","bookname5",500);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		l.add(b6);
		l.delete(b6);
		l.delete(b3);
		l.showList();
	}

}
