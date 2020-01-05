package com.tsdv.QuanLyVeTau.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tsdv.QuanLyVeTau.model.ScheduleTrain;

public class ScheduleTrainDAOImpl implements ScheduleTrainDAO{
	private static final Logger logger = LoggerFactory.getLogger(ScheduleTrainDAO.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addScheduleTrain(ScheduleTrain c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("ScheduleTrain saved successfully, ScheduleTrain Details=" + c);
	}

	@Override
	public void updateScheduleTrain(ScheduleTrain c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("ScheduleTrain updated successfully, ScheduleTrain Details=" + c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScheduleTrain> listScheduleTrains() {
		Session session = this.sessionFactory.getCurrentSession();
		List<ScheduleTrain> categoriesList = session.createQuery("from ScheduleTrain").list();
		for (ScheduleTrain c : categoriesList) {
			logger.info("ScheduleTrain List::" + c);
		}
		return categoriesList;
	}

	@Override
	public ScheduleTrain getScheduleTrainById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		ScheduleTrain c = (ScheduleTrain) session.load(ScheduleTrain.class, new Integer(id));
		logger.info("ScheduleTrain loaded successfully, ScheduleTrain details=" + c);
		return c;
	}

	@Override
	public void removeScheduleTrain(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		ScheduleTrain c = (ScheduleTrain) session.load(ScheduleTrain.class, new Integer(id));
		if (null != c) {
			session.delete(c);
		}
		logger.info("ScheduleTrain deleted successfully, ScheduleTrain details=" + c);
	}
}
