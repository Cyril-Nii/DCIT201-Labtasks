package assignment_one.polymorphism;

public class Staff {

    private StaffMember[] staffList;

    public Staff(StaffMember[] staffList) {
        this.staffList = staffList;
    }

    public double getTotalCost(){
        double totalCost = 0.0;
        for(StaffMember staffMember : staffList){
            totalCost += staffMember.getPay();
        }
        return totalCost;
    }

    public void displayStaff(){
        for(StaffMember staffMember : staffList){
            System.out.println(staffMember);
            System.out.println("Pay: " + staffMember.getPay() + "\n");
        }
    }

}