package com.tsdv.QuanLyVeTau.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tsdv.QuanLyVeTau.dao.TicketDAO;
import com.tsdv.QuanLyVeTau.model.Ticket;

public class TicketServiceImpl implements TicketService{
	private TicketDAO ticketDAO;

	public void setTicketDAO(TicketDAO ticketDAO) {
		this.ticketDAO = ticketDAO;
	}

	@Override
	@Transactional
	public void addTicket(Ticket k) {
		this.ticketDAO.addTicket(k);
	}

	@Override
	@Transactional
	public void updateTicket(Ticket p) {
		this.ticketDAO.updateTicket(p);
	}

	@Override
	@Transactional
	public List<Ticket> listTickets() {
		return this.ticketDAO.listTickets();
	}

	@Override
	@Transactional
	public Ticket getTicketById(int id) {
		return this.ticketDAO.getTicketById(id);
	}

	@Override
	@Transactional
	public void removeTicket(int id) {
		this.ticketDAO.removeTicket(id);
	}
}
