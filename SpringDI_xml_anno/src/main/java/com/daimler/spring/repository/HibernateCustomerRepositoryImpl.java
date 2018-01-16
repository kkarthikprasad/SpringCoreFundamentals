package com.daimler.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.daimler.spring.model.Customer;


@Repository("customerRepositoryabc")
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
	
	
	
	
	public HibernateCustomerRepositoryImpl() {
		// TODO Auto-generated constructor stub
		
		System.out.println("HibernateCustomerRepositoryImpl constructor is  being run");
	}
	
}
