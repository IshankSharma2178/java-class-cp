public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void display() {
        System.out.println("Savings Account #: " + this.accountNumber + ", Holder: " + this.accountHolder + ", Balance: " + getBalance() + ", Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "Irene", 500.0, 3.5);
        sa.deposit(200);
        sa.withdraw(100);
        sa.display();
    }
}
