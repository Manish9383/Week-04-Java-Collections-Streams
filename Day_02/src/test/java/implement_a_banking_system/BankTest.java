package implement_a_banking_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void testAddCustomer() {
        bank.addCustomer("A123", 1000);
        bank.addCustomer("B456", 500);

        assertEquals(2, bank.getAccounts().size(), "There should be 2 customers.");
        assertEquals("A123", bank.getAccounts().get("A123").getAccountNumber());
        assertEquals(1000, bank.getAccounts().get("A123").getBalance());
        assertEquals("B456", bank.getAccounts().get("B456").getAccountNumber());
        assertEquals(500, bank.getAccounts().get("B456").getBalance());
    }

    @Test
    void testDisplayCustomersSortedByBalance() {
        bank.addCustomer("A123", 1000);
        bank.addCustomer("B456", 500);
        bank.addCustomer("C789", 1500);

        bank.displayCustomersSortedByBalance();

        // We expect customers sorted by balance from highest to lowest
        assertEquals("C789", bank.getAccounts().get("C789").getAccountNumber());
        assertEquals(1500, bank.getAccounts().get("C789").getBalance());
        assertEquals("A123", bank.getAccounts().get("A123").getAccountNumber());
        assertEquals(1000, bank.getAccounts().get("A123").getBalance());
        assertEquals("B456", bank.getAccounts().get("B456").getAccountNumber());
        assertEquals(500, bank.getAccounts().get("B456").getBalance());
    }
}
