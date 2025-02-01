package assignment_one.abstraction;

public class Main {

    public static void main(String[] args) {

        UniversityDriverMenu menu = new UniversityDriverMenu();

        menu.admitNewStudent();

        menu.displayStudentDetails(menu.students.getFirst().getRegdNo());

        menu.migrateStudent(menu.students.getFirst().getRegdNo(), "New Hostel", "New Location", 100);

        menu.displayStudentDetails(menu.students.getFirst().getRegdNo());

    }

}
