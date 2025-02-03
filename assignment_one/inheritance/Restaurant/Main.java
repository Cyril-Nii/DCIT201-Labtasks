package assignment_one.inheritance.Restaurant;

public class Main {

    public static void main(String[] args) {
        Chef chef = new Chef("E001", "Alice", "Italian");
        Waiter waiter = new Waiter("E002", "Bob", "Outdoor");

        Employee[] employees = {chef, waiter};

        RestaurantManagementSystem rms = new RestaurantManagementSystem();

        for (Employee employee : employees) {
            rms.assignDuty(employee);
        }
    }
}
