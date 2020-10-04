package com.bankingexample.loans.service;

import com.bankingexample.loans.dao.LoanDAO;
import com.bankingexample.loans.model.Loan;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LoanService {

    @Autowired
    LoanDAO loanDAO;

    private static SessionFactory sessionFactory;

    public Loan addLoan(Loan loan) {
        loan.setAmountReturned(0.0);
        loan.setVerificationDone(Boolean.FALSE);
        loan.setClosed(Boolean.FALSE);
        loan.setAmountReturnable(
                loan.getSanctionedAmount() + ((loan.getSanctionedAmount() * loan.getInterestRate() * loan.getPeriod()) / 100));
        loan.setCurrentPeriod(0);
        return this.loanDAO.save(loan);
    }

    public Loan closeLoan(Integer loanId) {
        Loan loan = loanDAO.findById(loanId).get();
        loan.setClosed(Boolean.TRUE);
        return loanDAO.save(loan);
    }

    public Loan payInterest(Integer loanId) {
        Loan loan = loanDAO.findById(loanId).get();
        loan.setCurrentPeriod(
                loan.getCurrentPeriod() + 1
        );
        if(loan.getCurrentPeriod()<loan.getPeriod()) {
            loan.setAmountReturned(
                    loan.getAmountReturned() + (loan.getSanctionedAmount() * loan.getInterestRate() / 100)
            );
        }
        else if (loan.getCurrentPeriod()==loan.getPeriod()) {
            loan.setAmountReturned(
                    loan.getAmountReturned() + loan.getSanctionedAmount()
                            + (loan.getSanctionedAmount() * loan.getInterestRate() / 100)
            );
            loan.setClosed(Boolean.TRUE);
        }
        else {
            loan.setAmountReturned(loan.getAmountReturned() + 0);
        }
        return loanDAO.save(loan);
    }

    public Loan verifyLoan(Integer loanId) {
        Loan loan = loanDAO.findById(loanId).get();
        loan.setVerificationDone(Boolean.TRUE);
        return loanDAO.save(loan);
    }

    public List<Loan> viewLoans() {
        return loanDAO.findAll();
    }

    public Loan viewLoanById(Integer loanId) {
        Optional<Loan> optionalLoan = loanDAO.findById(loanId);
        return optionalLoan.get();
    }

    public void deleteLoanById(Integer loanId) {
        loanDAO.deleteById(loanId);
    }

    public List<Loan> viewLoansByAccountAssociated(Integer accountAssociated){
        return loanDAO.findByAccountAssociated(accountAssociated);
    }

}
