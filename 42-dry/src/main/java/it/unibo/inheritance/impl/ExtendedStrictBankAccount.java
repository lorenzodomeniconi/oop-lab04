package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {
    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(final int id, final double balance) {
        super(id, balance);
    }

    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
        if(isWithdrawAllowed(feeAmount)){
            super.withdraw(id, feeAmount);
            resetTransactions();
        }
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            super.withdraw(id, -amount);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    private boolean isWithdrawAllowed(final double amount) {
        return super.getBalance() >= amount;
    }
}
