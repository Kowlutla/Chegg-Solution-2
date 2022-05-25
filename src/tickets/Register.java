package tickets;

public class Register {

	// instance variables
	Ticket[] tickets;
	int numTickets;

	// Constructor
	public Register() {
		this.tickets = new Ticket[100];
		this.numTickets = 0;
	}

	// Method to add ticket
	public void add(Ticket ticket) {
		if (numTickets == 100) {
			System.out.println("Full....");
		} else {
			tickets[numTickets++] = ticket;
		}
	}

	// method to check if Ticket is present or not
	public boolean contains(String ticketID) {
		// Look for all tickets in array
		for (int i = 0; i < numTickets; i++) {
			// if current string id matches to given id return true
			if (tickets[i].ID().equalsIgnoreCase(ticketID)) {
				return true;
			}
		}
		// return false if not found
		return false;
	}

	// method to retrieve Ticket from array by taking ticketId
	public Ticket retrieve(String ticketID) {
		// Look for all tickets in array
		for (int i = 0; i < numTickets; i++) {
			// if current string id matches to given id return that tickets[i]
			if (tickets[i].ID().equalsIgnoreCase(ticketID)) {
				return tickets[i];
			}
		}
		// if not found return null
		return null;
	}
}
