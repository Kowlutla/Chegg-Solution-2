package com.Chegg.Shopping;

public class Test {

	public static void main(String[] args) {
		
		Item i1=new Shoe(123,98,"Adidas",10);
		Tshirt i2=new Tshirt(122,99,"puma","Red");
		Item i3=new Shoe(121,97,"Adidas",130);
		Item i4=new Shoe(120,95,"Puma",140);
		Item i5=new Shoe(119,94,"Adidas",105);
		
		ShoppingCart sc=new ShoppingCart(5);
		sc.addItem(i1);
		sc.addItem(i2);
		sc.addItem(i3);
		sc.addItem(i4);
		sc.addItem(i5);
		sc.addItem(i4);
		
		System.out.println(sc);
		System.out.println(sc.getNumberOfShoes());
		sc.displayTshirts("Red");

	}

}
