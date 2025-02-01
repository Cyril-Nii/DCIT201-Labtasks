package assignment_one.abstraction;

import java.util.Scanner;

public class Student extends Hostel implements Department {

    private String regdNo;
    private String studentName;
    private String electiveSubject;
    private double avgMarks;
    private String deptName;
    private String deptHead;

    public String getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(String regdNo) {
        if(regdNo.length() != 8) {
            throw new IllegalArgumentException("Registration number must be 8 characters long");
        }

        this.regdNo = regdNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getDeptName() {
        return deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }


    public void getStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        setStudentName(scanner.nextLine());

        System.out.println("Enter elective subject: ");
        setElectiveSubject(scanner.nextLine());

        System.out.println("Enter average marks: ");
        setAvgMarks(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter registration number: ");
        setRegdNo(scanner.nextLine());

        System.out.println("Enter Department Name: ");
        setDeptName(scanner.nextLine());

        System.out.println("Enter Department Head: ");
        setDeptHead(scanner.nextLine());

        System.out.println("Enter Hostel Name: ");
        setHostelName(scanner.nextLine());

        System.out.println("Enter Hostel Location: ");
        setHostelLocation(scanner.nextLine());

        System.out.println("Enter Number of Rooms: ");
        setNumberOfRooms(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character
    }

    public void printDepartmentDetails(){
        System.out.println("Department Name: " + getDeptName() + "\nDepartment Head: " + getDeptHead());
    }

    public void printStudentDetails(){
        System.out.println("\n**STUDENT DETAILS**\n");
        System.out.println("Student Name: " + getStudentName() + "\nElective Subject: " + getElectiveSubject() + "\nAverage Marks: " + getAvgMarks() + "\nRegistration Number: " + getRegdNo());
        printDepartmentDetails();
        printHostelDetails();
    }

}
