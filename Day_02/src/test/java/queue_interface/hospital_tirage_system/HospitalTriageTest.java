package queue_interface.hospital_tirage_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue_interface.hospital_triage_system.HospitalTriage;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageTest {

    private HospitalTriage triage;

    @BeforeEach
    void setUp() {
        triage = new HospitalTriage();
    }

    @Test
    void testAddPatient() {
        System.out.println("Testing addPatient method...");

        triage.addPatient("Arpita", 3);
        triage.addPatient("Raj", 5);
        triage.addPatient("Kritika", 2);

        System.out.println("Expected order (highest severity first): Raj, Arpita, Kritika");
        triage.displayQueue();
    }

    @Test
    void testTreatNextPatient() {
        System.out.println("Testing treatNextPatient method...");

        triage.addPatient("Arpita", 3);
        triage.addPatient("Raj", 5);
        triage.addPatient("Kritika", 2);

        System.out.println("\nBefore treatment:");
        triage.displayQueue();

        System.out.println("\nTreating first patient...");
        triage.treatNextPatient(); // Should treat Raj

        System.out.println("After treating the highest severity patient:");
        triage.displayQueue();
    }

    @Test
    void testEmptyQueueTreatment() {
        System.out.println("Testing treatNextPatient on an empty queue...");
        triage.treatNextPatient();
    }

    @Test
    void testDisplayEmptyQueue() {
        System.out.println("Testing displayQueue on an empty queue...");
        triage.displayQueue();
    }
}
