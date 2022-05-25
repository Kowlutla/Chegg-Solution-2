package com.chegg.interfaces;
/*
 * NameCollection Class that implements interface Enumerate
 * */
public class NameCollection implements Enumerate {
	// instance variables
	String[] array;// Array of 10 strings to store names
	int currentIndex;// to keep track of how many names in array
	int index;// store current index in array used by both hasNext and getNext
	// Constructor
	public NameCollection() {
		this.array = new String[10];// creates array
		// sets instance variable to appropriate starting value
		this.currentIndex = 0;
		this.index = 0;
	}
	// Method to add new names to array
	public void addNames(String name) {
		if (currentIndex == array.length) {
			System.out.println("array is full");
		} else {
			array[currentIndex++] = name;
		}
	}
	/*
	 * Overriden method return true if another element in collection exist
	 */
	public boolean hasNext() {
		return (index < currentIndex);
	}
	/*
	 * Overriden method returns the next element in collection
	 */
	public Object getNext() {
		return array[index++];
	}
}
