package scioredesign;

public class SavingsAccount implements BankAccount {

    private double rate = 0.01;

    private int acctnum;

    private int balance = 0;

    private boolean isforeign = false;

    public SavingsAccount(int acctnum) {
        this.acctnum = acctnum;
    }

    public boolean hasEnoughCollateral(int loanamt) {
        return balance >= loanamt / 2;
    }

    public String toString() {
        return "Savings account " + acctnum + ": balance=" + balance + ", is " + (isforeign ? "foreign" : "domestic");
    }

    public void addInterest() {
        balance += (int) (balance * rate);
    }

    @Override
    public int compareTo(BankAccount ba) {
        int bal1 = getBalance();
        int bal2 = ba.getBalance();
        if (bal1 == bal2) {
            return getAcctNum() - ba.getAcctNum();
        } else {
            return bal1 - bal2;
        }
    }

    @Override
    public int getAcctNum() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getBalance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isForeign() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setForeign(boolean isforeign) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deposit(int amt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
