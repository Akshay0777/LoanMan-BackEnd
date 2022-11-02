package com.loanman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanman.model.Customer;
import com.loanman.repo.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerRepository custRepo;
	

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>)custRepo.findAll();
	}


	@Override
	public Customer getCustomerById(int custId) {
		return custRepo.findById(custId).get();
	}

}
