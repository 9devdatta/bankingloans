package com.bankingexample.loans.dao;

import com.bankingexample.loans.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanDAO extends CrudRepository<Loan, Integer> {

    @Override
    List<Loan> findAll();

    List<Loan> findByAccountAssociated(Integer accountAssociated);

}
