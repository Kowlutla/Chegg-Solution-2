package classRoom;

import java.util.Comparator;
//class ComparatorByName
public class ComparatorByName implements Comparator<Classroom> {
	/**
	 * the compare() method in that class so that Classrooms are ordered based on
	 * building name (and in cases where the building names are the same, order the
	 * rooms by room number).*/
	@Override
	public int compare(Classroom o1, Classroom o2) {
		// o1 buildning name is greater than o2 building name(Alphabetical order)
		// return +ve nummber
		if (o1.getBuildingName().compareTo(o2.getBuildingName()) > 0) {
			return 1;
		}
		// o1 buildning name is lesser than o2 building name(Alphabetical order)
		// return -ve nummber
		else if (o1.getBuildingName().compareTo(o2.getBuildingName()) < 0) {
			return -1;
		}
		// if both buliding names are equal then compare them with room number
		else {
			// o1 room number is greater than o2 room number(Alphabetical order)
			// return +ve nummber
			if (o1.getRoomNumber().compareTo(o2.getRoomNumber()) > 0) {
				return 1;
			}
			// o1 room number is greater than o2 room number(Alphabetical order)
			// return -1ve nummber
			else if (o1.getRoomNumber().compareTo(o2.getRoomNumber()) < 0) {
				return -1;
			}
			// if both room numbers are equal return 0
			else {
				return 0;
			}
		}
	}
}
