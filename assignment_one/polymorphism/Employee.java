package assignment_one.polymorphism;

public class Employee extends StaffMember {

    private double monthlySalary;

    public Employee(String name, String id, double monthlySalary){
        super(name, id);
        if(monthlySalary < 0){
            throw new IllegalArgumentException("Monthly salary cannot be negative.");
        }
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary < 0){
            throw new IllegalArgumentException("Monthly salary cannot be negative.");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getPay(){
        return monthlySalary;
    }
}
