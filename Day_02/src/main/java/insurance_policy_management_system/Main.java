package insurance_policy_management_system;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new Policy("AZOL001", "Reji John", LocalDate.now().plusDays(5), "Health", 250.0));
        manager.addPolicy(new Policy("AZOL002", "Manish Patel", LocalDate.now().plusDays(10), "Auto", 200.0));
        manager.addPolicy(new Policy("AZOL003", "Chota Bheam", LocalDate.now().plusDays(30), "Home", 150.0));
        manager.addPolicy(new Policy("AZOL004", "Raju Khan", LocalDate.now().plusDays(50), "Health", 300.0));


        manager.displayAllPolicies();
        System.out.println();


        manager.displayExpiringPolicies();
        System.out.println();


        manager.displayPoliciesByCoverageType("Health");
        System.out.println();

        manager.findDuplicatePolicies();


        manager.comparePerformance();
    }
}
