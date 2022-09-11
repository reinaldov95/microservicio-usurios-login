package com.naldox.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naldox.customer.entity.Customer;
import com.naldox.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerDao;
	
	@Override
	public Customer save(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	@Override
	public Customer findById(Long id) {
		return customerDao.findById(id).get();
	}

	@Override
	public Customer update(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public void detele(Long id) {
		customerDao.deleteById(id);
	}

}
