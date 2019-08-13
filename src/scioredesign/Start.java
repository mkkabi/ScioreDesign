package scioredesign;

public class Start {
    
    public static void main(String[] args) {
        BankAccount ca = new CheckingAccount(0);
        
        BankAccount ba = BankAccount.createSavingsWithDeposit(0, 20);
    }
}
