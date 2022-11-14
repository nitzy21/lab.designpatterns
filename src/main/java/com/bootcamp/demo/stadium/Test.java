package com.bootcamp.demo.stadium;

public class Test {

	public static void main(String[] args) {
		
		Tax tax = new Tax();

		TicketBuyer buyer = new TicketBuyer(10);
		TicketFunctions ticketPayment = new TicketFunctions(buyer, tax);
		ticketPayment.getTicketType();
		ticketPayment.getTicketSale();
		System.out.println();

		TicketBuyer newBuyer = new TicketBuyer(55);
		ticketPayment = new TicketFunctions(newBuyer, tax);
		ticketPayment.getTicketType();
		ticketPayment.getTicketSale();
		System.out.println();

		TicketBuyer seniorBuyer = new TicketBuyer(60);
		ticketPayment = new TicketFunctions(seniorBuyer, tax);
		ticketPayment.getTicketType();
		ticketPayment.getTicketSale();
		System.out.println();

		tax.setTax(0.22);
		TicketBuyer adult = new TicketBuyer(34);
		ticketPayment = new TicketFunctions(adult, tax);
		ticketPayment.getTicketType();
		ticketPayment.getTicketSale();
	}
}
