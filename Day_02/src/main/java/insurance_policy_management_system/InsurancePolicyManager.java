package insurance_policy_management_system;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class InsurancePolicyManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    public Set<Policy> getHashSet() {
        return hashSet;
    }

    public Set<Policy> getLinkedHashSet() {
        return linkedHashSet;
    }

    public Set<Policy> getTreeSet() {
        return treeSet;
    }


    public void displayAllPolicies() {
        System.out.println("All Unique Policies:");
        System.out.println("HashSet: ");
        hashSet.forEach(System.out::println);
        System.out.println();
        System.out.println("LinkedHashSet: ");
        linkedHashSet.forEach(System.out::println);
        System.out.println();
        System.out.println("TreeSet (Sorted by Expiry Date): ");
        treeSet.forEach(System.out::println);
        System.out.println();
    }

    public void displayExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysLater = today.plusDays(30);

        System.out.println("Policies Expiring Soon (Within 30 Days): ");
        hashSet.stream().filter(policy -> !policy.getExpiryDate().isBefore(today) && policy.getExpiryDate().isBefore(thirtyDaysLater))
                .forEach(System.out::println);
    }

    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        hashSet.stream().filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    public void findDuplicatePolicies() {
        Set<String> policyNumbers = new HashSet<>();
        System.out.println("Duplicate Policies Based on Policy Number: ");
        hashSet.stream()
                .filter(policy -> !policyNumbers.add(policy.getPolicyNumber())) // If the policy number is already added, it's a duplicate
                .forEach(System.out::println);
    }

    public void comparePerformance() {
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            addPolicy(new Policy("POL" + i, "Holder " + i, LocalDate.now().plusDays(i), "Health", 100.0));
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add 10,000 policies: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        hashSet.contains(new Policy("POL5000", "Holder 5000", LocalDate.now(), "Health", 100.0));
        endTime = System.nanoTime();
        System.out.println("Time taken to search in HashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.contains(new Policy("POL5000", "Holder 5000", LocalDate.now(), "Health", 100.0));
        endTime = System.nanoTime();
        System.out.println("Time taken to search in LinkedHashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.contains(new Policy("POL5000", "Holder 5000", LocalDate.now(), "Health", 100.0));
        endTime = System.nanoTime();
        System.out.println("Time taken to search in TreeSet: " + (endTime - startTime) + " ns");
    }
}
