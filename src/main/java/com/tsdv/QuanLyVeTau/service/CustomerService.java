package com.tsdv.QuanLyVeTau.service;

import java.util.List;

import com.tsdv.QuanLyVeTau.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer p);
	public void updateCustomer(Customer p);
	public List<Customer> listCustomers();
	public Customer getCustomerById(int id);
	public void removeCustomer(int id);
}
