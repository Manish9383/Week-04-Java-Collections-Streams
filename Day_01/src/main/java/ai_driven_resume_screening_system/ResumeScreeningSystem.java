package ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> resume1=new Resume<>(new SoftwareEngineer("Manish Patel" , 5));
        Resume<DataScientist> resume2=new Resume<>(new DataScientist("Vinayak Singh",4));
        Resume<ProductManager> resume3=new Resume<>(new ProductManager("Arpita Goutam",6));

        resume1.processResume();
        resume2.processResume();
        resume3.processResume();

        List<JobRole> resumes=new ArrayList<>();
        resumes.add(new SoftwareEngineer("Kritika Das" , 5));
        resumes.add(new DataScientist("Rohan Singh",4));
        resumes.add(new ProductManager("Khushi Tripathi",6));
        resumes.add(new SoftwareEngineer("Sanchita Prabhu",4));

        MultipleResume.processMultipleResume(resumes);

    }
}
