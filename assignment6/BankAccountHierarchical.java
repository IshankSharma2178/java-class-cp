class BankAccountBase {
    protected String accountNumber;
    protected double balance;
    public BankAccountBase(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountType() { System.out.println("Generic Bank Account"); }
}

class SavingsAccountHA extends BankAccountBase {
    private double interestRate;
    public SavingsAccountHA(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override public void displayAccountType() { System.out.println("Savings Account (Rate: " + interestRate + "%)"); }
}

class CheckingAccountHA extends BankAccountBase {
    private double withdrawalLimit;
    public CheckingAccountHA(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override public void displayAccountType() { System.out.println("Checking Account (Limit: " + withdrawalLimit + ")"); }
}

class FixedDepositAccountHA extends BankAccountBase {
    private int termMonths;
    public FixedDepositAccountHA(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
    }
    @Override public void displayAccountType() { System.out.println("Fixed Deposit Account (Term: " + termMonths + " months)"); }
}

class BankAccountHierarchicalDemo {
    public static void main(String[] args) {
        BankAccountBase[] accounts = new BankAccountBase[] {
            new SavingsAccountHA("SA001", 1000, 3.5),
            new CheckingAccountHA("CA001", 1500, 500),
            new FixedDepositAccountHA("FD001", 5000, 12)
        };
        for (BankAccountBase a : accounts) { a.displayAccountType(); }
    }
}
