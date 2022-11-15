package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount{
    public ClassicBankAccount(AccountHolder accountHolder, double balance){
        super(accountHolder, balance);
    }
    public double computeFee(){
        return MANAGEMENT_FEE;
    }
}
