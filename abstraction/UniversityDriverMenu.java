package assignment_one.abstraction;

import java.util.ArrayList;
import java.util.List;

public class UniversityDriverMenu {

    List<Student> students = new ArrayList<>();

    public UniversityDriverMenu(){
        students = new ArrayList<>();
    }

    public void admitNewStudent() {
        Student student = new Student();
        student.getStudentDetails();
        students.add(student);
    }

    public void migrateStudent(String regdNo, String newHostelName, String newHostelLocation, int newNumberOfRooms){
        for(Student student : students){
            if(student.getRegdNo().equals(regdNo)){
                student.setHostelName(newHostelName);
                student.setHostelLocation(newHostelLocation);
                student.setNumberOfRooms(newNumberOfRooms);
            }
        }
    }

    public void displayStudentDetails(String regdNo){
        for(Student student : students){
            if(student.getRegdNo().equals(regdNo)){
                student.printStudentDetails();
            }
        }
    }

}