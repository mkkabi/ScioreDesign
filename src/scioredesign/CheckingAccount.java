package scioredesign;

public class CheckingAccount implements BankAccount {
    // the rate variable is omitted

    private int acctnum;
    private int balance = 0;
    private boolean isforeign = false;

    public CheckingAccount(int acctnum) {
        this.acctnum = acctnum;
    }

    public boolean hasEnoughCollateral(int loanamt) {
        return balance >= 2 * loanamt / 3;
    }

    public String toString() {
        return "Checking account " + acctnum + ": balance="
                + balance + ", is "
                + (isforeign ? "foreign" : "domestic");
    }
    
    public void addInterest() {
         // do nothing
      }

    @Override
    public int getAcctNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isForeign() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setForeign(boolean isforeign) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposit(int amt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
