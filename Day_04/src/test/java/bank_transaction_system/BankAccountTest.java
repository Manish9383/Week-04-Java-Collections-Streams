package bank_transaction_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testWithdraw_InsufficientBalance() {
        BankAccount account = new BankAccount(500);
        assertThrows(InsufficientBalanceException.class, () -> account.withdraw(600));
    }

    @Test
    void testWithdraw_NegativeAmount() {
        BankAccount account = new BankAccount(10000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }
}
