package assignment_one.inheritance.Restaurant;

public class Chef extends Employee {

    private String speciality;

    public Chef(String employeeId, String name, String speciality) {
        super(employeeId, name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void performDuty() {
        System.out.println("Chef " + getName() + " is preparing " + getSpeciality() + " dishes.");
    }
}