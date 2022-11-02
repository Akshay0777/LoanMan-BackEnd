package com.loanman.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loanman.model.Request;

@Repository
public interface IRequestRepository extends CrudRepository<Request, Integer> {

	@Query("from Request where fieldofficer = null and status != 0")
	public List<Request> getOfficerPendingRequests();
	
	@Query("from Request where status = 2")
	public List<Request> getApprovedRequests();
	
	@Query("from Request where status = 1 AND officerStatus = 2")
	public List<Request> getAdminPendingRequests();
	
	@Query("SELECT SUM(amount) FROM Request WHERE status = 2")
	public double getTotalLoan();
}
