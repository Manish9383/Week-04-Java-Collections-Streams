package queue_interface.hospital_triage_system;

import java.util.Comparator;

public class Patient {
    private String name;
    private int severityLevel;

    // Constructors
    public Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    // Getter functions
    public String getName() {
        return name;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + ", Severity Level: " + severityLevel;
    }

    public static Comparator<Patient> severityComparator = (p1, p2) -> Integer.compare(p2.getSeverityLevel(), p1.getSeverityLevel());
}
