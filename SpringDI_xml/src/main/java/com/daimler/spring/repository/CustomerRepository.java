package com.daimler.spring.repository;

import java.util.List;

import com.daimler.spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}