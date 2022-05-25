package tickets;


public class Ticket {
	
	private String ticketId="80000005";
	private Time time;
	
	public Ticket(Time t)
	{
		this.time=t;
	}
	
	public Ticket(String id,Time t)
	{
		this.ticketId=id;
		this.time=t;
	}

	public String ID() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", time=" + time + "]";
	}
	
	
	

}
