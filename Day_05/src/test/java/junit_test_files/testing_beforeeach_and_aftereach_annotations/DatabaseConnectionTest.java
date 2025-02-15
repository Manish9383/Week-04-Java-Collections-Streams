package junit_test_files.testing_beforeeach_and_aftereach_annotations;


import static org.junit.jupiter.api.Assertions.*;

import junit.testing_beforeeach_and_aftereach_annotations.DatabaseConnection;
import org.junit.jupiter.api.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected before each test.");
    }

    @Test
    void testConnectionIsClosedAfterEachTest() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Database should be disconnected after test execution.");
    }
}
