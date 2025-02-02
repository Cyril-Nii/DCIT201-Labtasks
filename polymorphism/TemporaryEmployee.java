package assignment_one.polymorphism;

public class TemporaryEmployee extends StaffMember {

    private double hourlyRate;
    private int hoursWorked;

    public TemporaryEmployee(String name, String id, double hourlyRate, int hoursWorked){
        super(name, id);

        if (hourlyRate < 0){
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }

        if (hoursWorked < 0){
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate){
        if(hourlyRate < 0){
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked){
        if(hoursWorked < 0){
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double getPay(){
        return hourlyRate * hoursWorked;
    }
}
