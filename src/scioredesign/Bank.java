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
            if (ba instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) ba;
                sa.addInterest();
            }
        }
    }
}
