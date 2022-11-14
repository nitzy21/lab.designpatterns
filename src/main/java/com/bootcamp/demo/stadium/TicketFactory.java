package com.bootcamp.demo.stadium;


public class TicketFactory {
	
	private static TicketFactory INSTANCE;

	private TicketFactory() {
		
	}
	
	public static TicketFactory instance() {
		if (INSTANCE == null) {
			INSTANCE = new TicketFactory();
		}
		return INSTANCE;
	}

	public Ticket ticket(TicketType type) {
		Ticket ticket = null;
		switch (type) {
		case CHILDREN:
			ticket = new Children();
			break;
		case ADULT:
			ticket = new Adult();
			break;
		case SENIOR:
			ticket = new Seniors();
			break;
		}
		return ticket;
	}
}