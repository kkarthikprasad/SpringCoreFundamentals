package com.daimler.spring.service;

import java.util.List;

import com.daimler.spring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}