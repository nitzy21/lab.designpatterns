package com.bootcamp.demo.stadium;

import java.math.BigDecimal;

public class Adult implements Ticket {
    public static final double TICKET_PRICE = 15;

    @Override
    public double getPriceByType() {
        return TICKET_PRICE;
    }

    @Override
    public String getTicketCategory() {
        return "Adult";
    }
}
