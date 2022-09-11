package com.naldox.customer.service;

import java.util.List;

import com.naldox.customer.entity.Customer;

public interface CustomerService {
	
	public Customer save(Customer customer);
	
	public List<Customer> findAll();
	
	public Customer findById(Long id);
	
	public Customer update(Customer customer);
	
	public void detele(Long id);

}
