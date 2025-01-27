package assignment_one.abstraction;

public class Student extends Hostel implements Department {


    public Student(String hostelName, String hostelLocation, int numberOfRooms) {
        super(hostelName, hostelLocation, numberOfRooms);
    }

    @Override
    public void printDepartmentDetails() {

    }
}
