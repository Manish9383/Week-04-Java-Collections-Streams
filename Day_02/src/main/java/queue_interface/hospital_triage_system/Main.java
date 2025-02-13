package queue_interface.hospital_triage_system;

public class Main {
    public static void main(String[] args) {
        HospitalTriage triage = new HospitalTriage();

        triage.addPatient("Arpita", 3);
        triage.addPatient("Raj", 5);
        triage.addPatient("Kritika", 2);

        System.out.println("\n--- Before Treatment ---");
        triage.displayQueue();

        System.out.println("\n--- Treating Patients ---");
        triage.treatNextPatient();
        triage.treatNextPatient();
        triage.treatNextPatient();

        System.out.println("\n--- After Treatment ---");
        triage.displayQueue();
    }
}
