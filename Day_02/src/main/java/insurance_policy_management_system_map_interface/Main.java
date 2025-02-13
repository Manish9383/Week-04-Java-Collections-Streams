package insurance_policy_management_system_map_interface;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();


        manager.addPolicy(new InsurancePolicy("DP001", "Manish", LocalDate.of(2025, 5, 15)));
        manager.addPolicy(new InsurancePolicy("DP02", "Kailash", LocalDate.of(2024, 3, 10)));
        manager.addPolicy(new InsurancePolicy("DP03", "Kamlesh", LocalDate.of(2024, 2, 25))); // Expired
        manager.addPolicy(new InsurancePolicy("DP04", "Ravi Kumar", LocalDate.now().plusDays(20)));


        System.out.println("All Policies:");
        manager.listAllPolicies();


        System.out.println("\nPolicies Expiring in 30 Days:");
        manager.getPoliciesExpiringIn30Days().forEach(System.out::println);


        System.out.println("\nPolicies for Kailash:");
        manager.getPoliciesByHolder("Kailash").forEach(System.out::println);


        System.out.println("\nRemoving Expired Policies...");
        manager.removeExpiredPolicies();


        System.out.println("\nAll Policies After Removing Expired:");
        manager.listAllPolicies();
    }
}
