package com.bankingexample.loans.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Assumes Simple Interest
@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer loanId;

    Double sanctionedAmount;
    Float interestRate;
    String accountHolderName;
    Integer accountAssociated;
    Boolean isVerificationDone;
    Integer currentPeriod;
    Integer period;
    Double amountReturnable;
    Double amountReturned;
    Boolean isClosed;

    /*public Loan() {

    }*/

    /*public Loan(Double sanctionedAmount, Float interestRate, String accountHolderName, Integer accountAssociated, Boolean isVerificationDone, Integer currentPeriod, Integer period, Double amountReturnable, Double amountReturned, Boolean isClosed) {
        this.sanctionedAmount = sanctionedAmount;
        this.interestRate = interestRate;
        this.accountHolderName = accountHolderName;
        this.accountAssociated = accountAssociated;
        this.isVerificationDone = isVerificationDone;
        this.currentPeriod = currentPeriod;
        this.period = period;
        this.amountReturnable = amountReturnable;
        this.amountReturned = amountReturned;
        this.isClosed = isClosed;
    }*/

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Integer getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(Integer currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Double getSanctionedAmount() {
        return sanctionedAmount;
    }

    public void setSanctionedAmount(Double sanctionedAmount) {
        this.sanctionedAmount = sanctionedAmount;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    /*public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }*/

    public Integer getAccountAssociated() {
        return accountAssociated;
    }

    public void setAccountAssociated(Integer accountAssociated) {
        this.accountAssociated = accountAssociated;
    }

    public Boolean getVerificationDone() {
        return isVerificationDone;
    }

    public void setVerificationDone(Boolean verificationDone) {
        isVerificationDone = verificationDone;
    }

    public Double getAmountReturnable() {
        return amountReturnable;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public void setAmountReturnable(Double amountReturnable) {
        this.amountReturnable = amountReturnable;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }

    public Double getAmountReturned() {
        return amountReturned;
    }

    public void setAmountReturned(Double amountReturned) {
        this.amountReturned = amountReturned;
    }
}
