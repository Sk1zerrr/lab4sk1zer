package ua.opnu;

import ua.opnu.java.inheritance.account.BankingAccount;
import ua.opnu.java.inheritance.account.Credit;
import ua.opnu.java.inheritance.account.Debit;
import ua.opnu.java.inheritance.account.Startup;

public class MinMaxAccount extends BankingAccount {
    private int minBalance;
    private int maxBalance;

    public MinMaxAccount(Startup s) {
        super(s);
        int balance = super.getBalance();
        this.minBalance = balance;
        this.maxBalance = balance;
    }

    public void credit(Credit amount) {
        super.credit(amount);
        int balance = super.getBalance();
        if (balance > maxBalance) maxBalance = balance;
        if (balance < minBalance) minBalance = balance;
    }

    public void debit(Debit amount) {
        super.debit(amount);
        int balance = super.getBalance();
        if (balance > maxBalance) maxBalance = balance;
        if (balance < minBalance) minBalance = balance;
    }

    public int getMin() {
        return minBalance;
    }

    public int getMax() {
        return maxBalance;
    }
}
