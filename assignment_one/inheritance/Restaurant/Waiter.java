package assignment_one.inheritance.Restaurant;

public class Waiter extends Employee {

    private String assignedSection;

    public Waiter(String employeeId, String name, String assignedSection){
        super(employeeId, name);

        this.assignedSection = assignedSection;
    }

    public String getAssignedSection(){
        return assignedSection;
    }

    public void setAssignedSection(String assignedSection){
        this.assignedSection = assignedSection;
    }

    @Override
    public void performDuty() {
        System.out.println("Waiter " + getName() + " is serving customers in the " + getAssignedSection() + " section.");
    }
}
