package genericClasses;

import java.util.ArrayList;
//class WaitingList
public class WaitingList<T> {

	//generic ArrayList to hold elements
	private ArrayList<T> list;
	//Constrcutor
	public WaitingList() {
		this.list = new ArrayList<T>();
	}

	//Method to add element at the end of list
	public void add(T element) {
		list.add(element);
	}

	//method to get the value at current given index
	public T get(int index) {
		if (index >= list.size()) {
			return null;
		} else {
			return list.get(index);
		}
	}

	//method to remove and return first element of list
	public T remove() {
		return list.remove(0);
	}

	//method to print the list
	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	//method to reverse the elements in list
	public void reverse() {
		int start=0,end=list.size()-1;
		while(start<end)
		{
			T temp=list.get(start);
			list.set(list.indexOf(temp), list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
	}

}
