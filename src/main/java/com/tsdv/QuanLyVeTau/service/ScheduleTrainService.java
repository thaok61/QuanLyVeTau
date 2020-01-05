package com.tsdv.QuanLyVeTau.service;

import java.util.List;

import com.tsdv.QuanLyVeTau.model.ScheduleTrain;

public interface ScheduleTrainService {
	public void addScheduleTrain(ScheduleTrain p);
	public void updateScheduleTrain(ScheduleTrain p);
	public List<ScheduleTrain> listScheduleTrains();
	public ScheduleTrain getScheduleTrainById(int id);
	public void removeScheduleTrain(int id);
}
