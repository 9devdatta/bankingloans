package com.bankingexample.loans.resource;

import com.bankingexample.loans.model.Loan;
import com.bankingexample.loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/loan")
public class LoanResource {

    @Autowired
    LoanService loanService;

    @PostMapping
    public Loan addLoan(@RequestBody Loan loan){
        return loanService.addLoan(loan);
    }

    @DeleteMapping(value = "/{loanId}")
    public void deleteLoan(@PathVariable("loanId") Integer loanId){
        loanService.deleteLoanById(loanId);
    }

    @PutMapping(value = "/close/{loanId}")
    public void closeLoan(@PathVariable("loanId") Integer loanId){
        loanService.closeLoan(loanId);
    }

    @PutMapping(value = "/verify/{loanId}")
    public void verifyLoan(@PathVariable("loanId") Integer loanId){
        loanService.verifyLoan(loanId);
    }

    @GetMapping(value = "/view")
    public List<Loan> viewLoans(){
        return loanService.viewLoans();
    }

    @GetMapping(value = "/view/{loanId}")
    public Loan viewLoanById(@PathVariable Integer loanId){
        return loanService.viewLoanById(loanId);
    }

    @GetMapping(value = "/view/account/{accountAssociated}")
    public List<Loan> viewLoansByAccountAssociated(@PathVariable Integer accountAssociated) {
        return loanService.viewLoansByAccountAssociated(accountAssociated);
    }

    @PutMapping(value = "/payinterest/{loanId}")
    public Loan payInterest(@PathVariable Integer loanId) {
        return loanService.payInterest(loanId);
    }

}
