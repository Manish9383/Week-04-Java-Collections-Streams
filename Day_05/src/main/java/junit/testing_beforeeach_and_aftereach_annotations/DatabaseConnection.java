package junit.testing_beforeeach_and_aftereach_annotations;


public class DatabaseConnection {
    private boolean isConnected;

    // demonstrating establishing a database connection
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    // demonstrating closing the database connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return isConnected;
    }
}
