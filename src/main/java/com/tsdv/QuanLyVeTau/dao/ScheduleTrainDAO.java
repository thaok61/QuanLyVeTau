package com.tsdv.QuanLyVeTau.dao;

import java.util.List;

import com.tsdv.QuanLyVeTau.model.ScheduleTrain;

public interface ScheduleTrainDAO {
	public void addScheduleTrain(ScheduleTrain k);

	public void updateScheduleTrain(ScheduleTrain k);

	public List<ScheduleTrain> listScheduleTrains();

	public ScheduleTrain getScheduleTrainById(int id);

	public void removeScheduleTrain(int id);
}
