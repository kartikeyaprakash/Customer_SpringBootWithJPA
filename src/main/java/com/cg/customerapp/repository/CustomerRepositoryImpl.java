package com.cg.customerapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.customerapp.entities.Customer;

@Repository
public class CustomerRepositoryImpl implements ICustomerRepository {

	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public Customer add(Customer customer) {
		entitymanager.persist(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		return entitymanager.merge(customer);
	}

	@Override
	public Customer findById(Long id) {
		return entitymanager.find(Customer.class, id);
	}

}
