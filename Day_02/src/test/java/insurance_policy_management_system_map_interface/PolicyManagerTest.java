package insurance_policy_management_system_map_interface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

class PolicyManagerTest {

    private PolicyManager policyManager;

    @BeforeEach
    void setUp() {
        policyManager = new PolicyManager();
    }

    @Test
    void testAddPolicy() {
        InsurancePolicy policy = new InsurancePolicy("DP001", "Manish", LocalDate.of(2025, 5, 15));
        policyManager.addPolicy(policy);


        assertEquals(policy, policyManager.getPolicyByNumber("DP001"));
    }

    @Test
    void testGetPolicyByNumber() {
        InsurancePolicy policy1 = new InsurancePolicy("DP001", "Manish", LocalDate.of(2025, 5, 15));
        InsurancePolicy policy2 = new InsurancePolicy("DP002", "Kailash", LocalDate.of(2024, 3, 10));
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);


        assertEquals(policy1, policyManager.getPolicyByNumber("DP001"));
        assertEquals(policy2, policyManager.getPolicyByNumber("DP002"));
        assertNull(policyManager.getPolicyByNumber("INVALID")); // Non-existent policy
    }

    @Test
    void testGetPoliciesExpiringIn30Days() {
        LocalDate today = LocalDate.now();
        InsurancePolicy policy1 = new InsurancePolicy("DP001", "Manish", today.plusDays(10)); // Expires in 10 days
        InsurancePolicy policy2 = new InsurancePolicy("DP002", "Kailash", today.plusDays(20)); // Expires in 20 days
        InsurancePolicy policy3 = new InsurancePolicy("DP003", "Kamlesh", today.plusDays(40)); // Expires in 40 days (not in 30 days)
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        List<InsurancePolicy> expiringPolicies = policyManager.getPoliciesExpiringIn30Days();


        assertEquals(2, expiringPolicies.size());
        assertTrue(expiringPolicies.contains(policy1));
        assertTrue(expiringPolicies.contains(policy2));
        assertFalse(expiringPolicies.contains(policy3));
    }

    @Test
    void testGetPoliciesByHolder() {
        InsurancePolicy policy1 = new InsurancePolicy("DP001", "Manish", LocalDate.of(2025, 5, 15));
        InsurancePolicy policy2 = new InsurancePolicy("DP002", "Kailash", LocalDate.of(2024, 3, 10));
        InsurancePolicy policy3 = new InsurancePolicy("DP003", "Manish", LocalDate.of(2024, 2, 25));
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        List<InsurancePolicy> policiesForManish = policyManager.getPoliciesByHolder("Manish");


        assertEquals(2, policiesForManish.size());
        assertTrue(policiesForManish.contains(policy1));
        assertTrue(policiesForManish.contains(policy3));
        assertFalse(policiesForManish.contains(policy2));
    }

    @Test
    void testRemoveExpiredPolicies() {
        LocalDate today = LocalDate.now();
        InsurancePolicy policy1 = new InsurancePolicy("DP001", "Manish", today.minusDays(10)); // Expired
        InsurancePolicy policy2 = new InsurancePolicy("DP002", "Kailash", today.plusDays(20)); // Not expired
        InsurancePolicy policy3 = new InsurancePolicy("DP003", "Kamlesh", today.minusDays(5)); // Expired
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        policyManager.removeExpiredPolicies();

        assertNull(policyManager.getPolicyByNumber("DP001"));
        assertNull(policyManager.getPolicyByNumber("DP003"));
        assertEquals(policy2, policyManager.getPolicyByNumber("DP002")); // Not expired, should still exist
    }

    @Test
    void testListAllPolicies() {
        InsurancePolicy policy1 = new InsurancePolicy("DP001", "Manish", LocalDate.of(2025, 5, 15));
        InsurancePolicy policy2 = new InsurancePolicy("DP002", "Kailash", LocalDate.of(2024, 3, 10));
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);


        policyManager.listAllPolicies();
    }
}