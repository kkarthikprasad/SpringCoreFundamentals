package com.daimler.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daimler.spring.model.Customer;
import com.daimler.spring.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	// This is a member injection
//	@Autowired
	private CustomerRepository customerRepository ;
	
	/* (non-Javadoc)
	 * @see com.daimler.spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	// setter injection
//	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter for customer Repository is being run");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository cp) {
		
		customerRepository = cp;
		System.out.println("Constructor injection is being executed");
	}
	
}
