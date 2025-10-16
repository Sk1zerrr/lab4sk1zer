package ua.opnu.java.inheritance.account;

public class MinMaxAccount extends BankingAccount {
    private int min;
    private int max;

    public MinMaxAccount(Startup s) {
        super(s);
        this.min = getBalance();
        this.max = getBalance();
    }

    @Override
    public void debit(Debit d) {
        super.debit(d);
        updateMinMax();
    }

    @Override
    public void credit(Credit c) {
        super.credit(c);
        updateMinMax();
    }

    private void updateMinMax() {
        int current = getBalance();
        if (current < min) min = current;
        if (current > max) max = current;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
