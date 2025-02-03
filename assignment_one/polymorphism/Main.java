package assignment_one.polymorphism;

public class Main {
    public static void main(String[] args) {
        StaffMember[] staffList = {
                new Employee("John", "E001", 3000.0),
                new TemporaryEmployee("Jane", "E002", 15.0, 160),
                new Manager("Alice", "M001", 5000.0, 2000.0),
                new Volunteer("Mark", "V001")
        };

        Staff staff = new Staff(staffList);
        staff.displayStaff();
        System.out.println("Total cost: " + staff.getTotalCost());
    }
}