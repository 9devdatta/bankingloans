package com.bankingexample.loans.dao;

import com.bankingexample.loans.dao.LoanDAO;
import com.bankingexample.loans.model.Loan;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServiceLayerTest {

    /*@InjectMocks
    Loan loan;

    @Mock
    LoanDAO loanDAO;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @BeforeEach
    public void setUp() {
        *//*loan = new Loan(10000.0, (float) 10.0, "John Smith", 738476,
                Boolean.FALSE, 0, 10, 20000.0, 0.0, Boolean.FALSE);*//*
    }

    @Test
    public void getAllLoansTest() {
        loanDAO.save(loan);
        Assert.assertNotNull(loanDAO.findAll());
    }

    @Test
    public void getAllLoansAssociatedByAccountNumTest() {
        *//*Loan loan1 = loan = new Loan(20000.0, (float) 10.0, "John Smith", 738476,
                Boolean.FALSE, 0, 10, 40000.0, 0.0, Boolean.FALSE);*//*
        List<Loan> loanList = new ArrayList<Loan>();
        loanList.add(loan);
        loanList.add(loan1);
        loanDAO.saveAll(loanList);
        Assert.assertNotNull(loanDAO.findByAccountAssociated(loan.getAccountAssociated()));
    }

    @Test
    public void getLoanByIdTest() {
        loanDAO.save(loan);
        Assert.assertNotNull(loanDAO.findById(loan.getLoanId()));
    }

    @Test
    public void deleteLoanByIdTest() {
        loanDAO.save(loan);
        loanDAO.deleteById(loan.getLoanId());
    }*/

}

