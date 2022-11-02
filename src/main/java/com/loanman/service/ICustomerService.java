package com.loanman.service;

import java.util.List;

import com.loanman.model.Customer;

public interface ICustomerService {

	List<Customer> getAllCustomers();
	
	Customer getCustomerById(int custId);
}
