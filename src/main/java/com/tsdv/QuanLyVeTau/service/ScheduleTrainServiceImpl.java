package com.tsdv.QuanLyVeTau.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tsdv.QuanLyVeTau.dao.ScheduleTrainDAO;
import com.tsdv.QuanLyVeTau.model.ScheduleTrain;

public class ScheduleTrainServiceImpl implements ScheduleTrainService{
	private ScheduleTrainDAO scheduleTrainDAO;

	public void setScheduleTrainDAO(ScheduleTrainDAO scheduleTrainDAO) {
		this.scheduleTrainDAO = scheduleTrainDAO;
	}

	@Override
	@Transactional
	public void addScheduleTrain(ScheduleTrain k) {
		this.scheduleTrainDAO.addScheduleTrain(k);
	}

	@Override
	@Transactional
	public void updateScheduleTrain(ScheduleTrain p) {
		this.scheduleTrainDAO.updateScheduleTrain(p);
	}

	@Override
	@Transactional
	public List<ScheduleTrain> listScheduleTrains() {
		return this.scheduleTrainDAO.listScheduleTrains();
	}

	@Override
	@Transactional
	public ScheduleTrain getScheduleTrainById(int id) {
		return this.scheduleTrainDAO.getScheduleTrainById(id);
	}

	@Override
	@Transactional
	public void removeScheduleTrain(int id) {
		this.scheduleTrainDAO.removeScheduleTrain(id);
	}
}
