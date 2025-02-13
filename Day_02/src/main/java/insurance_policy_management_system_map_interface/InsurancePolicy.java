package insurance_policy_management_system_map_interface;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;




public class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;


    public InsurancePolicy(String policyNumber, String policyHolderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
    }


    public String getPolicyNumber() {
        return policyNumber;
    }


    public String getPolicyHolderName() {
        return policyHolderName;
    }


    public LocalDate getExpiryDate() {
        return expiryDate;
    }


    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Holder: " + policyHolderName + ", Expiry: " + expiryDate;
    }
}
