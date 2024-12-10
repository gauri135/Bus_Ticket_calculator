package com.busTicketCalculator;

import com.busTicket.logic.Ticket;


public class BusTicketCalculator {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		ticket.getInput();
		ticket.calculation();
		ticket.display();

	}

}
