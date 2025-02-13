package insurance_policy_management_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagerTest {

    private InsurancePolicyManager manager;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManager();
        manager.addPolicy(new Policy("AZOL001", "Reji John", LocalDate.now().plusDays(5), "Health", 250.0));
        manager.addPolicy(new Policy("AZOL002", "Manish Patel", LocalDate.now().plusDays(10), "Auto", 200.0));
        manager.addPolicy(new Policy("AZOL003", "Chota Bheam", LocalDate.now().plusDays(30), "Home", 150.0));
        manager.addPolicy(new Policy("AZOL004", "Raju Khan", LocalDate.now().plusDays(50), "Health", 300.0));
    }

    @Test
    void testAddPolicy() {
        Policy policy = new Policy("AZOL005", "New User", LocalDate.now().plusDays(20), "Health", 100.0);
        manager.addPolicy(policy);

        assertTrue(manager.getHashSet().contains(policy));
        assertTrue(manager.getLinkedHashSet().contains(policy));
        assertTrue(manager.getTreeSet().contains(policy));
    }

    @Test
    void testDisplayExpiringPolicies() {

        manager.displayExpiringPolicies();
    }

    @Test
    void testDisplayPoliciesByCoverageType() {
        manager.displayPoliciesByCoverageType("Health");
    }

    @Test
    void testFindDuplicatePolicies() {
        manager.addPolicy(new Policy("AZOL002", "Manish Patel", LocalDate.now().plusDays(10), "Auto", 200.0));
        manager.findDuplicatePolicies();
    }

    @Test
    void testComparePerformance() {
        manager.comparePerformance();
    }
}
