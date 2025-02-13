package insurance_policy_management_system_map_interface;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PolicyManager {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<InsurancePolicy>> sortedPoliciesByExpiry = new TreeMap<>();


    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);


        sortedPoliciesByExpiry
                .computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>())
                .add(policy);
    }


    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }


    public List<InsurancePolicy> getPoliciesExpiringIn30Days() {
        LocalDate today = LocalDate.now();
        LocalDate thresholdDate = today.plusDays(30);


        return sortedPoliciesByExpiry.subMap(today, true, thresholdDate, true)
                .values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }


    public List<InsurancePolicy> getPoliciesByHolder(String policyHolderName) {
        return policyMap.values()
                .stream()
                .filter(policy -> policy.getPolicyHolderName().equalsIgnoreCase(policyHolderName))
                .collect(Collectors.toList());
    }


    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        List<LocalDate> expiredDates = sortedPoliciesByExpiry.headMap(today, false).keySet().stream().toList();


        for (LocalDate date : expiredDates) {
            for (InsurancePolicy policy : sortedPoliciesByExpiry.get(date)) {
                policyMap.remove(policy.getPolicyNumber());
                orderedPolicyMap.remove(policy.getPolicyNumber());
            }
            sortedPoliciesByExpiry.remove(date);
        }
    }


    public void listAllPolicies() {
        orderedPolicyMap.values().forEach(System.out::println);
    }
}
