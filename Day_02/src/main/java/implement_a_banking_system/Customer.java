package implement_a_banking_system;

public class Customer {
    private String accountNumber;
    private double balance;

    public Customer(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber + ", Balance: $" + balance;
    }
}