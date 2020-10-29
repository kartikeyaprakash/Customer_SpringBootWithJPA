package com.cg.customerapp.repository;

import com.cg.customerapp.entities.Customer;

public interface ICustomerRepository {
	 Customer add(Customer customer);
	 Customer update(Customer customer);
	 Customer findById(Long id);
}
