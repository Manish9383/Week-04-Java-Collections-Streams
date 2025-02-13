package implement_a_banking_system;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("A123", 1000);
        bank.addCustomer("B456", 500);
        bank.addCustomer("C789", 1500);

        bank.requestWithdrawal("A123");
        bank.requestWithdrawal("B456");
        bank.requestWithdrawal("C789");

        bank.processWithdrawals();
        System.out.println();

        bank.displayCustomersSortedByBalance();
        System.out.println();
    }
}