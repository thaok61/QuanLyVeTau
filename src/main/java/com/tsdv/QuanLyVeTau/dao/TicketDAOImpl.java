package com.tsdv.QuanLyVeTau.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tsdv.QuanLyVeTau.model.Ticket;

public class TicketDAOImpl implements TicketDAO{
	private static final Logger logger = LoggerFactory.getLogger(TicketDAO.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addTicket(Ticket c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("Ticket saved successfully, Ticket Details=" + c);
	}

	@Override
	public void updateTicket(Ticket c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("Ticket updated successfully, Ticket Details=" + c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> listTickets() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Ticket> categoriesList = session.createQuery("from Ticket").list();
		for (Ticket c : categoriesList) {
			logger.info("Ticket List::" + c);
		}
		return categoriesList;
	}

	@Override
	public Ticket getTicketById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Ticket c = (Ticket) session.load(Ticket.class, new Integer(id));
		logger.info("Ticket loaded successfully, Ticket details=" + c);
		return c;
	}

	@Override
	public void removeTicket(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Ticket c = (Ticket) session.load(Ticket.class, new Integer(id));
		if (null != c) {
			session.delete(c);
		}
		logger.info("Ticket deleted successfully, Ticket details=" + c);
	}
}
