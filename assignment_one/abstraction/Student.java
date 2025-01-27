package assignment_one.abstraction;

public class Student extends Hostel implements Department {

    private String studentName; // Name of student
    private String regdNo; // 8 digit registration number of the student
    private String electiveSubject; // Elective subject chosen by the student.
    private double avgMarks; // Average marks of the student.


    public Student(String hostelName, String hostelLocation, int numberOfRooms, String studentName, String regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);

        if (regdNo.length() != 8){
            throw new IllegalArgumentException("Registration number must be 8 digits");
        }

        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;


    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(String regdNo) {
        if(regdNo.length() != 8){
            throw new IllegalArgumentException("Registration number must be 8 digits");
        }

        this.regdNo = regdNo;
    }

    public String getElectiveSubject() {
        return electiveSubject;
    }

    public void setElectiveSubject(String electiveSubject) {
        this.electiveSubject = electiveSubject;
    }

    public double getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(double avgMarks) {
        this.avgMarks = avgMarks;
    }

    @Override
    public void printDepartmentDetails() {

    }
}
