package com.loanman.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanman.model.Customer;
import com.loanman.model.FeildOfficer;
import com.loanman.model.Request;
import com.loanman.service.ICustomerService;
import com.loanman.service.IFeildOfficerService;
import com.loanman.service.IRequestService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	ICustomerService custService;
	
	@Autowired
	IRequestService reqService;
	
	@Autowired
	IFeildOfficerService officerService;
	
	
	
	
	//get all Customer
	@GetMapping("/officer")
	public List<FeildOfficer> getFeildOfficer() {
		return officerService.getAllFeildOfficer();
	}
	
	
	
	
}
