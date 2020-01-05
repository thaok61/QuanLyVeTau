package com.tsdv.QuanLyVeTau.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thong_tin_ve")
public class Ticket {
	@Id
	@Column(name = "idve")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTicket;
	@Column(name = "idlich_tau_chay")
	private Integer idScheduleTrain;
	@Column(name = "ma_cho")
	private Integer idSlot;
	@Column(name = "idkhach_hang")
	private Integer idCustomer;

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Integer getIdScheduleTrain() {
		return idScheduleTrain;
	}

	public void setIdScheduleTrain(Integer idScheduleTrain) {
		this.idScheduleTrain = idScheduleTrain;
	}

	public Integer getIdSlot() {
		return idSlot;
	}

	public void setIdSlot(Integer idSlot) {
		this.idSlot = idSlot;
	}

	public Integer getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(Integer idTicket) {
		this.idTicket = idTicket;
	}

	public Ticket() {
		super();
	}

	public Ticket(Integer idTicket, Integer idScheduleTrain, Integer idSlot, Integer idCustomer) {
		super();
		this.idTicket = idTicket;
		this.idScheduleTrain = idScheduleTrain;
		this.idSlot = idSlot;
		this.idCustomer = idCustomer;
	}

}
