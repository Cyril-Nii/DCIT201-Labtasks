package assignment_one.abstraction;

public class Hostel {

// Attributes
    private String hostelName;
    private String hostelLocation;
    private int numberOfRooms;

// Constructor
    public Hostel(String hostelName, String hostelLocation, int numberOfRooms){

        if(numberOfRooms <= 0){
            throw new IllegalArgumentException("Number of rooms must be greater that 0");
        }

        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;

    }

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


    public void setHostelDetails(String name, String location, int rooms){
        this.setHostelName(name);
        this.setHostelLocation(location);
        this.setNumberOfRooms(rooms);
    }


    public void printHostelDetails(){
        System.out.println("Hostel Name: " + hostelName + "\nHostel Location: " + hostelLocation + "\nNumber of Rooms: " + numberOfRooms);
    }

}
