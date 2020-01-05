package com.tsdv.QuanLyVeTau.dao;

import java.util.List;

import com.tsdv.QuanLyVeTau.model.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer k);

	public void updateCustomer(Customer k);

	public List<Customer> listCustomers();

	public Customer getCustomerById(int id);

	public void removeCustomer(int id);
}
