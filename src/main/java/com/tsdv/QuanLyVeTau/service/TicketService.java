package com.tsdv.QuanLyVeTau.service;

import java.util.List;

import com.tsdv.QuanLyVeTau.model.Ticket;

public interface TicketService {
	public void addTicket(Ticket p);
	public void updateTicket(Ticket p);
	public List<Ticket> listTickets();
	public Ticket getTicketById(int id);
	public void removeTicket(int id);
}
