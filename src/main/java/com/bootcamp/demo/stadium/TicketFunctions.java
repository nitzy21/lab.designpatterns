package com.bootcamp.demo.stadium;

public class TicketFunctions {
	
	Ticket ticket;
	TicketBuyer ticketBuyer;
	Tax tax;
	double price;

	TicketFactory ticketFactory = TicketFactory.instance();

	public TicketFunctions(TicketBuyer ticketBuyer, Tax tax) {
		this.ticketBuyer = ticketBuyer;
		this.tax = tax;
	}

	public void getTicketType() {
		setTicketType();
	}

	private void getTicketSaleTax() {
		this.ticket.getTicketPriceTypeAndTax(tax);
	}

	public void getTicketSale () {
		getTicketSaleTax();
	}
	
	private void setTicketType() {
		if (ticketBuyer.getAge() <= 16) {
			this.ticket = ticketFactory.ticket(TicketType.CHILDREN);
		} else if (ticketBuyer.getAge() > 65) {
			this.ticket = ticketFactory.ticket(TicketType.SENIOR);
		} else {
			this.ticket = ticketFactory.ticket(TicketType.ADULT);
		}
	}

	public Ticket getTicket() {
		return this.ticket;
	}

}
