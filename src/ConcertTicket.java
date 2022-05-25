
public class ConcertTicket {

	ConcertTicket array[];
	int size = 0;

	public ConcertTicket remove() {
		// Create a ConcertTicket reference variable
		ConcertTicket ticket = null;

		if (this.size > 0) {
			// TODO Use the size variable(which always points at the next empty
			// slot) to get the last added ConcertTicket from array
			ticket = array[size - 1];

			// TODO Set the array slot to null
			array[size - 1] = null;

			// TODO Dercement the size variable
			size--;
		}

		// Return the ConcertTicket
		return ticket;
	}
}
