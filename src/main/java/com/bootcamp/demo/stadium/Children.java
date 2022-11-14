package com.bootcamp.demo.stadium;

import java.math.BigDecimal;

public class Children implements  Ticket {
    public static final double TICKET_PRICE = 10;

    @Override
    public double getPriceByType() {
        return TICKET_PRICE;
    }

    @Override
    public String getTicketCategory() {
        return "Children";
    }
}
