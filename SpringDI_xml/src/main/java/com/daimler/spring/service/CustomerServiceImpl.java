package com.daimler.spring.service;

import java.util.List;

import com.daimler.spring.model.Customer;
import com.daimler.spring.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepositoryboo ;
	
	

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		
		this.customerRepositoryboo = customerRepository;
	}
	
	public void setCustomerRepository(CustomerRepository customerRepositoryboo) {
		this.customerRepositoryboo = customerRepositoryboo;
	}

	/* (non-Javadoc)
	 * @see com.daimler.spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepositoryboo.findAll();
	}
	
}
