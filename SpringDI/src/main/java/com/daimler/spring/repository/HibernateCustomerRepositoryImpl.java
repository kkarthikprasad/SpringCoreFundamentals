package com.daimler.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.daimler.spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	/* (non-Javadoc)
	 * @see com.daimler.spring.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Johnny");
		customer.setSecondName("Depp");
		
		customers.add(customer);
		
		return customers;
	}
}
