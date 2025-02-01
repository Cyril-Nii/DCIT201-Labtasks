package assignment_one.abstraction;

public class Hostel {

    private String hostelName;
    private String hostelLocation;
    private int numberOfRooms;

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName){
        this.hostelName = hostelName;
    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public void setHostelLocation(String hostelLocation){
        this.hostelLocation = hostelLocation;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if(numberOfRooms <= 0){
            throw new IllegalArgumentException("Number of rooms must be greater that 0");
        }

        this.numberOfRooms = numberOfRooms;
    }

    public void printHostelDetails(){
        System.out.println("Hostel Name: " + getHostelName() + "\nHostel Location: " + getHostelLocation() + "\nNumber of Rooms: " + getNumberOfRooms());
    }
}
