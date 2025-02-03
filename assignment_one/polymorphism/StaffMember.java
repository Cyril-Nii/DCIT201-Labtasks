package assignment_one.polymorphism;

public abstract class StaffMember {

    private String name;
    private String id;

    public StaffMember(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public abstract double getPay();

    @Override
    public String toString(){
        return "Name: " + name + "\nID: " + id;
    }
}
