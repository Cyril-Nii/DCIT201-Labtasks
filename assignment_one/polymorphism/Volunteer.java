package assignment_one.polymorphism;

public class Volunteer extends StaffMember {

    public Volunteer(String name, String id){
        super(name, id);
    }

    @Override
    public double getPay(){
        return 0.0;
    }

}
