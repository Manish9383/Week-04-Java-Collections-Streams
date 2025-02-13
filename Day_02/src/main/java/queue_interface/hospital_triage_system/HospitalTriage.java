package queue_interface.hospital_triage_system;

import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTriage {
    private Queue<Patient> patientQueue;

    public HospitalTriage() {
        this.patientQueue = new PriorityQueue<>(Patient.severityComparator);
    }

    public void addPatient(String name, int severityLevel) {
        Patient patient = new Patient(name, severityLevel);
        patientQueue.add(patient);
        System.out.println(name + " (Severity: " + severityLevel + ") added to the queue.");
    }

    public void treatNextPatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in the queue.");
            return;
        }
        Patient treatedPatient = patientQueue.poll();
        System.out.println("Treating patient: " + treatedPatient.getName() + " (Severity: " + treatedPatient.getSeverityLevel() + ")");
    }

    public void displayQueue() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in the queue.");
            return;
        }
        System.out.println("Current Patients in Triage Queue:");
        for (Patient p : patientQueue) {
            System.out.println(p);
        }
    }
}
