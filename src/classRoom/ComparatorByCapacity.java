package classRoom;

import java.util.Comparator;

//class ComparatorByCapacity
public class ComparatorByCapacity implements Comparator<Classroom> {

	/*
	 * compare() method in that class so that Classrooms are ordered based on
	 * capacity.
	 */
	@Override
	public int compare(Classroom o1, Classroom o2) {

		// if o1 capacity is greater than o2 capacity return +ve number
		if (o1.getCapacity() > o2.getCapacity()) {
			return 1;
		}
		// if o2 capacity is greater than o1 capacity return -ve number
		else if (o2.getCapacity() > o1.getCapacity()) {
			return -1;
		}
		// return 0 if both o1 capacity and o2 capacity are equal
		else {
			return 0;
		}

		// Single Line Statement equivalant to above code
		/* return o1.getCapacity()-o2.getCapacity(); */
	}
}
