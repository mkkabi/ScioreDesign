package scioredesign;

import java.util.HashMap;

public class Bank {

    private HashMap<Integer, BankAccount> accounts;

    private int nextacct;

    public Bank(HashMap<Integer, BankAccount> accounts) {
        this.accounts = accounts;
        nextacct = n;
    }

    public int newAccount(int type, boolean isforeign) {
        int acctnum = nextacct++;
        BankAccount ba;
        if (type == 1) {
            ba = new SavingsAccount(acctnum);
        } else {
            ba = new CheckingAccount(acctnum);
        }
        ba.setForeign(isforeign);
        accounts.put(acctnum, ba);
        return acctnum;
    }

    public int getBalance(int acctnum) {
        BankAccount ba = accounts.get(acctnum);
        return ba.getBalance();
    }

    public void addInterest() {
        for (BankAccount ba : accounts.values()) {
            ba.addInterest();
        }
    }

    public void deposit(int a, int n) {
    }

    public boolean authorizeLoad(int a, int n) {
        return false;
    }

    @Override
    public String toString() {
        return "adsf";
    }

    public void setForeing(int a, boolean b) {
    }
}
