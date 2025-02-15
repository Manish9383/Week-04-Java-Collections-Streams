package junit_test_files.advanced_junit_practice_problems_testing_files.testing_banking_transactions;


import static org.junit.jupiter.api.Assertions.*;

import junit.advanced_junit_practice_problems.testing_banking_transactions.BankAccount;
import org.junit.jupiter.api.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0); // Initialize with $100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be updated correctly after deposit.");
    }

    @Test
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), "Balance should be updated correctly after withdrawal.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    @Test
    void testNegativeWithdrawal() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5.0));
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
    }
}
