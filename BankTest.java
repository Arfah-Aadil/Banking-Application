import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
class BankTest {
 
    private Bank bank;
 
    @BeforeEach
    void setUp() {
        bank = new Bank();
        bank.addAccount("Yash", 1000.0);
        bank.addAccount("Parth", 500.0);
    }
 
    @Test
    void testAccountList() {
        // Ensure that the account list contains the added accounts
        assertEquals("List of Bank Accounts: \nYash\nParth\n", getOutput(() -> bank.AccountList()));
    }
 
    @Test
    void testAccountInformation() {
        // Ensure that account information is displayed correctly
        assertEquals("Account Name: Yash\nBalance : 1000.0\nTransaction : []\n", getOutput(() -> bank.AccountInformation("John")));
    }
 
    @Test
    void testAddTransaction() {
        // Ensure that adding a transaction updates the balance and transaction history
        bank.addTransaction("Parth", 200.0);
        assertEquals("Added Transaction Successfully!!\n", getOutput(() -> {}));
        assertEquals("Account Name: Alice\nBalance : 700.0\nTransaction : [200.0]\n", getOutput(() -> bank.AccountInformation("Alice")));
    }
 
    private String getOutput(Runnable runnable) {
        // Capture System.out.println output for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
runnable.run();
        System.setOut(System.out);
        return outputStream.toString();
    }
}