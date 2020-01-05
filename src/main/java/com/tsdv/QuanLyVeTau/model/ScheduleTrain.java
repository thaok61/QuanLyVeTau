package com.tsdv.QuanLyVeTau.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lich_tau_chay")
public class ScheduleTrain {
	@Id
	@Column(name = "idlich_tau_chay")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idScheduleTrain;
	@Column(name = "ga_den")
	private String destinationPoint;
	@Column(name = "ma_tau")
	private String idTrain;
	@Column(name = "thoi_gian_di")
	private String timeTravel;
	@Column(name = "gia_ve")
	private String price;
	@Column(name = "so_cho")
	private Integer slot;

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public Integer getIdScheduleTrain() {
		return idScheduleTrain;
	}

	public void setIdScheduleTrain(Integer idScheduleTrain) {
		this.idScheduleTrain = idScheduleTrain;
	}

	public String getIdTrain() {
		return idTrain;
	}

	public void setIdTrain(String idTrain) {
		this.idTrain = idTrain;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public String getTimeTravel() {
		return timeTravel;
	}

	public void setTimeTravel(String timeTravel) {
		this.timeTravel = timeTravel;
	}

}
