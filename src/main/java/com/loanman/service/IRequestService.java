package com.loanman.service;

import java.util.List;

import com.loanman.model.Request;

public interface IRequestService {

	List<Request> getAllRequest();
	
	List<Request> getOfficerPendingRequests();
	
	List<Request> getAdminPendingRequests();
	
	List<Request> getApprovedRequests();
	
	double getTotalLoan();
	
	void updateRequest(Request request);
}
