import java.util.Scanner;

public class Vehicle {
    String ownerName;
    String vehicleType;
    final String registrationNumber; 
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    static double registrationFee = 2500.0;
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles to register: ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1));
            System.out.print("Owner Name: ");
            String ownerName = sc.nextLine();
            System.out.print("Vehicle Type (Car/Bike/other): ");
            String vehicleType = sc.nextLine();
            System.out.print("Registration Number: ");
            String regNumber = sc.nextLine();
            vehicles[i] = new Vehicle(ownerName, vehicleType, regNumber);
        }
        System.out.print("\nDo you want to update the registration fee? (yes/no): ");
        String update = sc.nextLine();
        if (update.equalsIgnoreCase("yes")) {
            System.out.print("Enter new registration fee: ");
            double newFee = sc.nextDouble();
            sc.nextLine();
            updateRegistrationFee(newFee);
        }
        System.out.println("\n--- Vehicle Registration Details ---");
        for (Vehicle v : vehicles) {
            System.out.println();
            v.displayDetails();
        }

    }
}