package com.Chegg.uniqueRandomNumbers;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		//create UniqueRandom object
		UniqueRandom numbers=new UniqueRandom(10,100);
		//creating Iterator object and printing elements
		Iterator iterator=numbers.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		
		System.out.println("\n");
		//create UniqueRandom object
		UniqueRandom numbers1=new UniqueRandom(3,20);
		//printing elements using enhanced for loop
		for(Integer i:numbers1)
		{
			System.out.println(i);
		}

	}
}
