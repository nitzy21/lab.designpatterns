package com.bootcamp.demo.stadium;

public class Seniors implements Ticket {
	public static final double TICKET_PRICE = 12;

	@Override
	public double getPriceByType() {
		return TICKET_PRICE;
	}

	@Override
	public String getTicketCategory() {
		return "Senior";
	}
}
