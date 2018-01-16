package com.daimler.spring.service;

import java.util.List;

import com.daimler.spring.model.Customer;
import com.daimler.spring.repository.CustomerRepository;
import com.daimler.spring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.daimler.spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
