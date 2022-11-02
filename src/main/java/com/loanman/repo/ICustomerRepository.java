package com.loanman.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loanman.model.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer> {

}
