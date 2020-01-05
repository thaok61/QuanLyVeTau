package com.tsdv.QuanLyVeTau.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "khach_hang")
public class Customer {
	@Id
	@Column(name = "idkhach_hang")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCustomer;
	@Column(name = "namekhach_hang")
	@NotEmpty
	private String nameCustomer;
	@NotEmpty
	private String sdt;
	@NotEmpty
	private String mail;
	@NotEmpty
	private String cmnd;
	@NotEmpty
	private String tuoi;
	@Column(name = "doi_tuong")
	@NotEmpty
	private String doiTuong;

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getSdt() {
		return sdt;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public String getTuoi() {
		return tuoi;
	}

	public Customer() {
		super();
	}

	public Customer(int idCustomer,String nameCustomer,String sdt, String cmnd, String tuoi, String doiTuong) {
		super();
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.sdt = sdt;
		this.cmnd = cmnd;
		this.tuoi = tuoi;
		this.doiTuong = doiTuong;
	}

}
