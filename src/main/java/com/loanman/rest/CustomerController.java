package com.loanman.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanman.model.Customer;
import com.loanman.service.ICustomerService;
import com.loanman.service.IFeildOfficerService;
import com.loanman.service.IRequestService;

@CrossOrigin
@RestController
@RequestMapping("api/cust/")
public class CustomerController {
	
	@Autowired
	ICustomerService custService;
	
	
	//get all Customer
	@GetMapping("/")
	public List<Customer> getCustomers() {
		return custService.getAllCustomers();
	}
	
	// find customer by id
	@GetMapping("/{custId}")
	public Customer getCustomerById(@PathVariable int custId) {
		return custService.getCustomerById(custId);
	}

}
