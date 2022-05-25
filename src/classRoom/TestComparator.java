package classRoom;

import java.util.ArrayList;
import java.util.Collections;
//class TestComparator
public class TestComparator {
	// Main method
	public static void main(String[] args) {
		// creates an ArrayList of Rooms
		ArrayList<Classroom> rooms = new ArrayList<Classroom>();
		// Add about 5 Classrooms to the list in a random order
		rooms.add(new Classroom("B7", "Block1", 50));
		rooms.add(new Classroom("A9", "Block5", 56));
		rooms.add(new Classroom("B7", "Block3", 30));
		rooms.add(new Classroom("B4", "Block2", 45));
		rooms.add(new Classroom("B2", "Block3", 80));
		// print the list
		System.out.println("* * * Rooms in Random Order * * *  ");
		printRooms(rooms);
		// Then call sort() method to sort the Classrooms based by capacity
		Collections.sort(rooms, new ComparatorByCapacity());
		System.out.println("\n* * * Rooms in Sorting Order Of Capacity * * * ");
		// Print out that ordering
		printRooms(rooms);
		// Then call the Collections.sort() method to sort the Classrooms
		// based on building name/room number
		Collections.sort(rooms, new ComparatorByName());
		System.out.println("\n* * * Rooms in Sorting Order Of Name/RoomNumber * * * ");
		// Print out that ordering.
		printRooms(rooms);
	}
	// Method to print the Classroom's in list
	private static void printRooms(ArrayList<Classroom> rooms) {
		for (Classroom c : rooms) {
			System.out.println(c.getRoomNumber() + "\t" + c.getBuildingName() + "\t" + c.getCapacity());
		}
	}
}
