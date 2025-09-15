interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccountBS implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccountBS(String accountNumber, String holderName, double openingBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = openingBalance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    protected void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) { balance += amount; }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; return true; }
        return false;
    }

    public abstract double calculateInterest();
}

class SavingsAccountBS extends BankAccountBS {
    private double rate = 0.04; // 4%
    public SavingsAccountBS(String acc, String name, double bal) { super(acc, name, bal); }
    @Override public double calculateInterest() { return getBalance() * rate; }
    @Override public boolean applyForLoan(double amount) { return amount <= getBalance() * 5; }
    @Override public double calculateLoanEligibility() { return getBalance() * 5; }
}

class CurrentAccountBS extends BankAccountBS {
    private double rate = 0.01; // 1%
    public CurrentAccountBS(String acc, String name, double bal) { super(acc, name, bal); }
    @Override public double calculateInterest() { return getBalance() * rate; }
    @Override public boolean applyForLoan(double amount) { return amount <= getBalance() * 2; }
    @Override public double calculateLoanEligibility() { return getBalance() * 2; }
}

class BankingSystemDemo {
    public static void main(String[] args) {
        BankAccountBS[] accounts = new BankAccountBS[] {
            new SavingsAccountBS("SB001", "Leena", 10000),
            new CurrentAccountBS("CA001", "Mark", 5000)
        };
        for (BankAccountBS a : accounts) {
            a.deposit(1000);
            a.withdraw(500);
            System.out.println(a.getHolderName() + " interest: " + String.format("%.2f", a.calculateInterest()) + ", loan eligibility: " + a.calculateLoanEligibility());
        }
    }
}
