package com.bootcamp.demo.stadium;

public interface Ticket {

	public static final double ticketPrice = 0;

	double getPriceByType();
	String getTicketCategory();

	default double getTax(Tax tax) {
		return tax.getTax();
	}

	default double getTicketPrice(Tax tax) {
		return getPriceByType() + (tax.getTax() * getPriceByType());
	}

	default void getTicketPriceTypeAndTax(Tax tax) {
		System.out.println(String.format("Ticket Price:%s, Type:%s, Tax:%s", getTicketPrice(tax), getTicketCategory(), getTax(tax)));
	}

}