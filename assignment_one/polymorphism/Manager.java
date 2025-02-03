package assignment_one.polymorphism;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, String id, double monthlySalary, double bonus){
        super(name, id, monthlySalary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
}

    @Override
    public double getPay() {
        return getMonthlySalary() + getBonus();

    }
}
