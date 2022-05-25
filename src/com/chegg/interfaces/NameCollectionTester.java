package com.chegg.interfaces;

public class NameCollectionTester {

	public static void main(String[] args) {
		//create new NameCollection Object
		NameCollection e=new NameCollection();
		//adding 5 names to NameCollection Object
		e.addNames("kowlutla");
		e.addNames("Hindu");
		e.addNames("Deepu");
		e.addNames("Roopa");
		e.addNames("Hari");
		
		/*
		 * Displaying all the names in NameCollection object 
		 * using Enumerate interface methods
		 */
		while(e.hasNext())
		{
			System.out.println(e.getNext());
		}
	}
}
