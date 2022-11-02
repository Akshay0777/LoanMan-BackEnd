package com.loanman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loanman.model.Request;
import com.loanman.repo.IRequestRepository;

@Service
public class RequestServiceImpl implements IRequestService {
	
	@Autowired
	IRequestRepository reqRepo;

	@Override
	public List<Request> getAllRequest() {
		// TODO Auto-generated method stub
		return (List<Request>)reqRepo.findAll();
	}

	@Override
	public List<Request> getOfficerPendingRequests() {
		// TODO Auto-generated method stub
		return reqRepo.getOfficerPendingRequests();
	}

	@Override
	public List<Request> getAdminPendingRequests() {
		// TODO Auto-generated method stub
		return reqRepo.getAdminPendingRequests();
	}

	@Override
	public List<Request> getApprovedRequests() {
		// TODO Auto-generated method stub
		return reqRepo.getApprovedRequests();
	}

	@Override
	public double getTotalLoan() {
		// TODO Auto-generated method stub
		return reqRepo.getTotalLoan();
	}
	
	@Transactional
	@Override
	public void updateRequest(Request request) {
		// TODO Auto-generated method stub
		reqRepo.save(request);
		return;
	}

}
