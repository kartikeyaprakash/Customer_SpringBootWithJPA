package com.cg.customerapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customerapp.entities.Customer;
import com.cg.customerapp.repository.ICustomerRepository;

@Service

public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerRepository repository;
	
	@Override
	@Transactional
	public Customer register(Customer customer) {
		customer = repository.add(customer);
		return customer;
	}
	

	@Override
	@Transactional
	public Customer updateName(Long id, String name) {
		Customer customer = repository.findById(id);
		customer.setName(name);
		customer = repository.update(customer);
		return customer;
	}

}
