package com.example.designpattern.singleton;

public class TicketManager {
	private static final TicketManager TicketManager = new TicketManager();
	private static TicketManager instance = new TicketManager();
	
	private TicketManager() { // private constructor
		count = 0;
	}
	
	public static TicketManager getInstance() {
		return TicketManager;
	}
	
	static int count;
	
	public synchronized static Ticket sellTicket() {
		return new Ticket(count++);
	}
}
