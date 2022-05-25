package com.chegg.shopping;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

//Create a generic class called “ShopSet”
public class ShopSet<T> {
	// One attribute TreeSet called set of generic type T
	private TreeSet<T> set;
	/*
	 * A constructor that takes as a parameter List<T> list and uses the list to
	 * create the TreeSet with the values of list.
	 */
	public ShopSet(List<T> list) {
		this.set = new TreeSet<T>(list);
	}
	// Get and Set methods for this class.
	public TreeSet<T> getSet() {
		return set;
	}
	public void setSet(TreeSet<T> set) {
		this.set = set;
	}
	// A toString() method. (Hint: this method returns set.toString( ))
	public String toString() {
		return set.toString();
	}
	// adds the element t in the set
	public void add(T t) {
		set.add(t);
	}
	// removes the element t from the set
	public void remove(T t) {
		set.remove(t);
	}
	// returns the maximum element of the set
	public T getMax() {
		return set.last();
	}
	/*
	 * returns a subset of the TreeSet in which every element is less than the
	 * specified value t.
	 */
	public SortedSet<T> getLess(T t) {
		return set.headSet(t);
	}
}
