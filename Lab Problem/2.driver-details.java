/*Lab Task 2
A ride-sharing company needs to store driver details and calculate earnings based on trips
completed.
Task Instructions:
• Create a `Driver` class with fields `name`, `tripsCompleted`, and `earningPerTrip`.
• Add a `setDriver(String n, int trips, double earning)` method to assign values.
• Add a `calculateTotalEarnings()` method that multiplies trips with earning per trip and
returns the result.
• Add a `showDriver()` method to display all details.
•`, create at least two eBook objects, change their availability, and display
updated info.*/

class Driver {
    String name;
    int tripsCompleted;
    double earningPerTrip;

    void setDriver(String n, int trips, double earning) {
        name = n;
        tripsCompleted = trips;
        earningPerTrip = earning;
    }

    double totalearnings = 0;
    void calculateTotalEarnings() {
        totalearnings = tripsCompleted * earningPerTrip;
    }

    void showDriver() {
        System.out.println("Name: " + name);
        System.out.println("Total trips completed: " + tripsCompleted);
        System.out.println("Earning Per Trip: " + earningPerTrip);
        System.out.println("Total Earnings: " + totalearnings);
        System.out.println("-----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Driver drv1 = new Driver();
        drv1.setEBook("Adbul Kashem", 12, 4200);
        drv1.calculateTotalEarnings();
        drv1.showDriver();

        Driver drv2 = new Driver();
        drv2.setEBook("Gopur Uddin", 8, 6500);
        drv2.calculateTotalEarnings();
        drv2.showDriver();
    }

}
