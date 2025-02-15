package junit.testing_beforeeach_and_aftereach_annotations;


public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        dbConnection.connect();
        System.out.println("Is connected? " + dbConnection.isConnected());

        dbConnection.disconnect();
        System.out.println("Is connected? " + dbConnection.isConnected());
    }
}
