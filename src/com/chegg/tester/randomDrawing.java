package com.chegg.tester;

import java.util.ArrayList;
import java.util.Random;

public class randomDrawing<T> implements Cloneable {

	private ArrayList<T> box = new ArrayList();

	public void add(T t) {
		box.add(t);
	}

	public boolean isEmpty() {
		return box.isEmpty();
	}

	public T drawItem() {
		if (isEmpty())
			return null;
		else {
			return box.remove(new Random().nextInt(box.size()));
		}
	}

	@Override
	public String toString() {
		String s="";
		for(int i=0;i<box.size();i++)
		{
			s+=box.get(i)+" ";
		}
		return s;
	}

	protected Object clone() throws CloneNotSupportedException {
		randomDrawing<T> obj = (randomDrawing<T>) super.clone();
		obj.box = (ArrayList<T>) box.clone();
		return obj;
	}
}