package implement_a_banking_system;


import java.util.*;

public class Bank {
    private Map<String, Customer> accounts = new HashMap<>();
    private Map<Double, List<Customer>> customersSortedByBalance = new TreeMap<>(Collections.reverseOrder());
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void addCustomer(String accountNumber, double balance) {
        Customer customer = new Customer(accountNumber, balance);
        accounts.put(accountNumber, customer);

        customersSortedByBalance
                .computeIfAbsent(balance, k -> new ArrayList<>())
                .add(customer);
    }

    public void requestWithdrawal(String accountNumber) {
        withdrawalQueue.add(accountNumber);
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            Customer customer = accounts.get(accountNumber);
            if (customer != null && customer.getBalance() >= 100) {
                double newBalance = customer.getBalance() - 100;
                customer.setBalance(newBalance);
                System.out.println("Processed withdrawal for " + accountNumber + ". New balance: $" + newBalance);
            } else {
                System.out.println("Withdrawal failed for " + accountNumber + ". Insufficient balance.");
            }
        }
    }

    public void displayCustomersSortedByBalance() {
        System.out.println("Customers Sorted by Balance (Highest to Lowest):");
        customersSortedByBalance.forEach((balance, customers) ->
                customers.forEach(customer -> System.out.println(customer))
        );
    }

    public Map<String, Customer> getAccounts() {
        return accounts;
    }

    public Queue<String> getWithdrawalQueue() {
        return withdrawalQueue;
    }
}
