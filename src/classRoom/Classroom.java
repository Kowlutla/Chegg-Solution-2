package classRoom;

public class Classroom

{
// fields
	private String roomNumber;
	private String buildingName;
	private int capacity;

	/**
	 * Constructor for objects of class Classroom
	 */
	public Classroom() {
		this.capacity = 0;
	}

	/**
	 * Constructor for objects of class Classroom
	 *
	 * @param rN the room number
	 * @param bN the building name
	 * @param c  the room capacity
	 */
	public Classroom(String rN, String bN, int c) {
		setRoomNumber(rN);
		setBuildingName(bN);
		setCapacity(c);
	}

	/**
	 * Mutator method (setter) for room number.
	 *
	 * @param rN a new room number
	 */
	public void setRoomNumber(String rN) {
		this.roomNumber = rN;
	}

	/**
	 * Mutator method (setter) for building name.
	 *
	 * @param bN a new building name
	 */
	public void setBuildingName(String bN) {
		this.buildingName = bN;
	}

	/**
	 * Mutator method (setter) for capacity.
	 *
	 * @param c a new capacity
	 */
	public void setCapacity(int c) {
		this.capacity = c;
	}

	/**
	 * Accessor method (getter) for room number.
	 *
	 * @return the room number
	 */
	public String getRoomNumber() {
		return this.roomNumber;
	}

	/**
	 * Accessor method (getter) for building name.
	 *
	 * @return the building name
	 */
	public String getBuildingName() {
		return this.buildingName;
	}

	/**
	 * Accessor method (getter) for capacity.
	 *
	 * @return the capacity
	 */
	public int getCapacity() {
		return this.capacity;
	}
}