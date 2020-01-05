package com.tsdv.QuanLyVeTau.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tsdv.QuanLyVeTau.dao.CustomerDAO;
import com.tsdv.QuanLyVeTau.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	@Transactional
	public void addCustomer(Customer k) {
		this.customerDAO.addCustomer(k);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer p) {
		this.customerDAO.updateCustomer(p);
	}

	@Override
	@Transactional
	public List<Customer> listCustomers() {
		return this.customerDAO.listCustomers();
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		return this.customerDAO.getCustomerById(id);
	}

	@Override
	@Transactional
	public void removeCustomer(int id) {
		this.customerDAO.removeCustomer(id);
	}
}
