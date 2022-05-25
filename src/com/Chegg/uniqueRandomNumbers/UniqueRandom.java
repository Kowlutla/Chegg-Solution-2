package com.Chegg.uniqueRandomNumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
//UniqueRandom class  implementing the Iterable<Integer> interface.
class UniqueRandom implements Iterable<Integer>
{

	private ArrayList<Integer> data;

	public UniqueRandom(int number, int range) {
		long seed = 30;
		data = new ArrayList<Integer>();
		Random rand = new Random(seed);
		for (int i = 0; i < number; i++) {
			data.add(rand.nextInt(range));
		}
	}

	//toString method
	public String toString() {
		int i = 0;
		String result = "[";
		for (i = 0; i < data.size(); i++) {
			if (i < data.size() - 1)
				result = result + data.get(i) + ", ";
		}
		result = result + data.get(i - 1);
		result = result + "]";
		return result;
	}

	
	/*
	 * implement the iterator() method. 
	 * The method should return an Iterator<Integer> object.
	 * add an anonymous class which implements the Iterator<Integer> interface 
	 * and implements the hasNext() and next() methods.
	 * */
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>()//anonymous class which implements the Iterator<Integer> interface
		{
			int index=0;
			
			//implements the hasNext()
			@Override
			public boolean hasNext() {
				return index<data.size();
			}

			//implements the next()
			@Override
			public Integer next() {
				return data.get(index++);
			}
			
		};
	}
}

