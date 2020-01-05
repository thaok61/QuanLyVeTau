package com.tsdv.QuanLyVeTau.dao;

import java.util.List;

import com.tsdv.QuanLyVeTau.model.Ticket;

public interface TicketDAO {
	public void addTicket(Ticket k);

	public void updateTicket(Ticket k);

	public List<Ticket> listTickets();

	public Ticket getTicketById(int id);

	public void removeTicket(int id);
}
