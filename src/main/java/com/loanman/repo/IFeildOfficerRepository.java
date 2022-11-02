package com.loanman.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loanman.model.FeildOfficer;

@Repository
public interface IFeildOfficerRepository extends CrudRepository<FeildOfficer, Integer> {

}
