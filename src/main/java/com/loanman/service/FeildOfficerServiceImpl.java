package com.loanman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanman.model.FeildOfficer;
import com.loanman.repo.IFeildOfficerRepository;

@Service
public class FeildOfficerServiceImpl implements IFeildOfficerService {
	
	@Autowired
	IFeildOfficerRepository officerRepo;

	@Override
	public List<FeildOfficer> getAllFeildOfficer() {
		
		return (List<FeildOfficer>)officerRepo.findAll();
	}

}
