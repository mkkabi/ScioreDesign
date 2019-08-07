package scioredesign;

class BankClient {

    private int current = -1;
    private Scanner scanner;
    private boolean done = false;
    private Bank bank;

    public BankClient(Scanner scanner, Bank bank) {
        this.scanner = scanner;
        this.bank = bank;
    }
}
