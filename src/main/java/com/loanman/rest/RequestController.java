package com.loanman.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanman.model.Request;
import com.loanman.service.IRequestService;

@CrossOrigin
@RestController
@RequestMapping("api/req/")
public class RequestController {
	
	@Autowired
	IRequestService reqService;
	
	//get all Customer
	@GetMapping("/")
	public List<Request> getRequests() {
		return reqService.getAllRequest();
	}
	
	//get all Customer
	@GetMapping("/officerpending")
	public List<Request> getOfficerPendingRequests() {
		return reqService.getOfficerPendingRequests();
	}
	
	//get all Customer
	@GetMapping("/adminpending")
	public List<Request> getAdminPendingRequests() {
		return reqService.getAdminPendingRequests();
	}

	//get all Customer
		@GetMapping("/approved")
		public List<Request> getApprovedRequests() {
			return reqService.getApprovedRequests();
		}
		
	//get total amount of loan
	@GetMapping("/totalloan")
	public double getTotalLoan() {
		return reqService.getTotalLoan();
	}
	
	// update request
	@PutMapping("/")
	public void updateRequest(@RequestBody Request request) {
		System.out.println("Updating user....");
		reqService.updateRequest(request);
	}
}
